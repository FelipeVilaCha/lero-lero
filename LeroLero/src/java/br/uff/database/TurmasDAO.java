package br.uff.database;

import br.uff.dominio.Turmas;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author FelipeVilaChadosSant
 */
public class TurmasDAO {
     private final Conexao conexaoDB;
     
    public TurmasDAO(Conexao conexaoDB) {
        this.conexaoDB = conexaoDB;
    }
     
    public boolean insertInstrutor(Turmas turma) throws SQLException {
        String sql = "INSERT INTO turmas (instrutores_id, cursos_id, data_inicio, data_final, carga_horaria) VALUES (?, ?, ?, ?, ?)";
        
        Connection db = conexaoDB.conectar();
         
        PreparedStatement comando = db.prepareStatement(sql);
        comando.setInt(1, turma.getInstrutores_id());
        comando.setInt(2, turma.getCursos_id());
        comando.setDate(3, (Date) turma.getData_inicio());
        comando.setDate(4, (Date) turma.getData_final());
        comando.setInt(5, turma.getCarga_horaria());
         
        boolean registroInserido = comando.executeUpdate() > 0;
        comando.close();
        conexaoDB.desconectar();
        
        return registroInserido;
    }
     
    public List<Turmas> listarTurmas() throws SQLException {
        List<Turmas> listaTurmas = new ArrayList<>();
         
        String sql = "SELECT * FROM turmas";
         
        Connection db = conexaoDB.conectar();
         
        Statement comando = db.createStatement();
        ResultSet resultado = comando.executeQuery(sql);
         
        while (resultado.next()) {
            int id = resultado.getInt("id");
            int instrutores_id = resultado.getInt("instrutores_id");
            int cursos_id = resultado.getInt("cursos_id");
            Date data_inicio = resultado.getDate("data_inicio");
            Date data_final = resultado.getDate("data_final");
            int carga_horaria = resultado.getInt("carga_horaria");
             
            Turmas turma = new Turmas(id, instrutores_id, cursos_id, data_inicio, data_final, carga_horaria);
            listaTurmas.add(turma);
        }
         
        resultado.close();
        comando.close();
        conexaoDB.desconectar();
         
        return listaTurmas;
    }
     
    public boolean deletaInstrutor(Turmas turma) throws SQLException {
        String sql = "DELETE FROM turmas where id = ?";
         
        Connection db = conexaoDB.conectar();
         
        PreparedStatement comando = db.prepareStatement(sql);
        comando.setInt(1, turma.getId());
         
        boolean registroDeletado = comando.executeUpdate() > 0;
        comando.close();
        conexaoDB.desconectar();
        
        return registroDeletado;     
    }
     
    public boolean atualizaInstrutor(Turmas turma) throws SQLException {
        String sql = "UPDATE turmas SET instrutores_id = ?, cursos_id = ?, data_inicio = ?, data_final = ?, carga_horaria = ?";
        sql += " WHERE id = ?";
        
        Connection db = conexaoDB.conectar();
         
        PreparedStatement comando = db.prepareStatement(sql);
        comando.setInt(1, turma.getInstrutores_id());
        comando.setInt(2, turma.getCursos_id());
        comando.setDate(3, (Date) turma.getData_inicio());
        comando.setDate(4, (Date) turma.getData_final());
        comando.setInt(5, turma.getCarga_horaria());
        comando.setInt(6, turma.getId());
         
        boolean registroAtualizado = comando.executeUpdate() > 0;
        comando.close();
        conexaoDB.desconectar();
        
        return registroAtualizado;     
    }
     
    public Turmas getInstrutor(int id) throws SQLException {
        Turmas turma = null;
        String sql = "SELECT * FROM turmas WHERE id = ?";
         
        Connection db = conexaoDB.conectar();
         
        PreparedStatement comando = db.prepareStatement(sql);
        comando.setInt(1, id);
         
        ResultSet resultado = comando.executeQuery();
         
        if (resultado.next()) {
            int instrutores_id = resultado.getInt("instrutores_id");
            int cursos_id = resultado.getInt("cursos_id");
            Date data_inicio = resultado.getDate("data_inicio");
            Date data_final = resultado.getDate("data_final");
            int carga_horaria = resultado.getInt("carga_horaria");
             
            turma = new Turmas(id, instrutores_id, cursos_id, data_inicio, data_final, carga_horaria);
        }
         
        resultado.close();
        comando.close();
        conexaoDB.desconectar();
        
        return turma;
    }
}