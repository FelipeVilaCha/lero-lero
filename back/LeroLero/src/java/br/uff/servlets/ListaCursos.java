package br.uff.servlets;

import br.uff.dao.CursosDAO;
import br.uff.dao.Conexao;
import br.uff.dao.CursosDAO;
import br.uff.dao.InstrutoresDAO;
import br.uff.dao.MatriculasDAO;
import br.uff.dao.TurmasDAO;
import br.uff.model.Cursos;
import br.uff.model.Cursos;
import br.uff.model.Matriculas;
import br.uff.model.Turmas;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author FelipeVilaChadosSant
 */
public class ListaCursos extends HttpServlet {
    
    private Conexao conexaoDB;
    private CursosDAO cursosDAO;
    
    @Override
    public void init() {
        conexaoDB = new Conexao();
        cursosDAO = new CursosDAO(conexaoDB);
    }
    
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        
        try {
            List<Cursos> listaCursos = cursosDAO.listarCursos();
            session.setAttribute("listaCursos", listaCursos);
        } catch (SQLException ex) {
            Logger.getLogger(ListaCursos.class.getName()).log(Level.SEVERE, ex.getMessage());
        }
        
        response.sendRedirect("http://localhost:8080/LeroLero/modules/admin/tables/cursos-table.jsp");
    }
}