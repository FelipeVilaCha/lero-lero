package br.uff.servlets;

import br.uff.dao.Conexao;
import br.uff.dao.AlunosDAO;
import br.uff.model.Alunos;
import br.uff.util.Encriptador;
import java.io.IOException;
import java.sql.SQLException;
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
public class AdicionaAluno extends HttpServlet {

    private AlunosDAO alunosDAO;
    private Conexao conexaoDB;
    
    @Override
    public void init() {
        conexaoDB = new Conexao();
        alunosDAO = new AlunosDAO(conexaoDB);    
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        boolean existe = false;
        boolean status = false;
        
        String cpf = request.getParameter("cpf");
        String nome = request.getParameter("nome");
        String email = request.getParameter("email");
        String celular = request.getParameter("celular");
        String login = request.getParameter("login");
        String senha = new Encriptador().encripta(request.getParameter("senha"));
        String endereco = request.getParameter("endereco");
        String cidade = request.getParameter("cidade");
        String bairro = request.getParameter("bairro");
        String cep = request.getParameter("cep");
        String comentario = null;
        String aprovado = "S";
        
        Alunos aluno = new Alunos(cpf, nome, email, celular, login, senha, endereco, cidade, bairro, cep, comentario, aprovado);
        
        try {
            existe = alunosDAO.verificaAluno(aluno);
        } catch (SQLException ex) {
            Logger.getLogger(AdicionaAluno.class.getName()).log(Level.SEVERE, ex.getMessage());
        }
        
        if(!existe){
            try {
                status = alunosDAO.insertAluno(aluno);
            } catch (SQLException ex) {
                Logger.getLogger(AdicionaAluno.class.getName()).log(Level.SEVERE, ex.getMessage());
            }
            
            if(status){
                request.getRequestDispatcher("/ListaAlunos").forward(request, response);
            } else {
                response.sendRedirect("http://localhost:8080/LeroLero/modules/admin/tables/alunos-table.jsp");
            }
        } else {
            response.sendRedirect("http://localhost:8080/LeroLero/modules/admin/tables/alunos-table.jsp");
        }
    }
}
