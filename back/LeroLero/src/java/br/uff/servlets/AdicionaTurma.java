package br.uff.servlets;

import br.uff.dao.Conexao;
import br.uff.dao.TurmasDAO;
import br.uff.model.Turmas;
import br.uff.util.ConversorData;
import java.io.IOException;
import java.util.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author Felipe Vila Chã
 */
public class AdicionaTurma extends HttpServlet {

    private TurmasDAO turmasDAO;
    private Conexao conexaoDB;
    
    @Override
    public void init() {
        conexaoDB = new Conexao();
        turmasDAO = new TurmasDAO(conexaoDB);    
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        boolean status = false;
        boolean validaCurso = false;
        boolean validaInstrutor = false;
        
        int instrutores_id = Integer.parseInt(request.getParameter("instrutores_id"));
        int cursos_id = Integer.parseInt(request.getParameter("cursos_id"));
        String data_inicio = request.getParameter("data_inicio");
        String data_final = request.getParameter("data_final");
        int carga_horaria = Integer.parseInt(request.getParameter("carga_horaria"));
        
        Date data_inicio_formatada = null;
        try {
            data_inicio_formatada = ConversorData.convertToUtil(data_inicio);
        } catch (ParseException ex) {
            Logger.getLogger(AdicionaTurma.class.getName()).log(Level.SEVERE, ex.getMessage());
        }
        
        Date data_final_formatada = null;
        try {
            data_final_formatada = ConversorData.convertToUtil(data_final);
        } catch (ParseException ex) {
            Logger.getLogger(AdicionaTurma.class.getName()).log(Level.SEVERE, ex.getMessage());
        }
        
        Turmas turma = new Turmas(instrutores_id, cursos_id, data_inicio_formatada, data_final_formatada, carga_horaria);
        
        try {
            validaCurso = turmasDAO.validaTurmaCurso(cursos_id);
        } catch (SQLException ex) {
            Logger.getLogger(AdicionaTurma.class.getName()).log(Level.SEVERE, ex.getMessage());
        }
        
        try {
            validaInstrutor = turmasDAO.validaTurmaInstrutor(instrutores_id);
        } catch (SQLException ex) {
            Logger.getLogger(AdicionaTurma.class.getName()).log(Level.SEVERE, ex.getMessage());
        }
        
        if(validaCurso && validaInstrutor) {
            try {
                status = turmasDAO.insertTurmas(turma);
            } catch (SQLException | ParseException ex) {
                Logger.getLogger(AdicionaTurma.class.getName()).log(Level.SEVERE, ex.getMessage());
            }
        } else {
            response.sendRedirect("http://localhost:8080/LeroLero/modules/admin/tables/turmas-table.jsp");
        }
        
        if(status){
            request.getRequestDispatcher("/ListaTurmas").forward(request, response);
        }
    }
}
