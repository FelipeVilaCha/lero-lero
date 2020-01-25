package br.uff.database;

import br.uff.dominio.Instrutores;
import java.sql.Connection;
import java.sql.DriverManager;
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
public class InstrutoresDAO {
    private String jdbcURL;
    private String jdbcUser;
    private String jdbcSenha;
    private Connection jdbcConexao;
     
    public InstrutoresDAO(String jdbcURL, String jdbcUser, String jdbcSenha) {
        this.jdbcURL = jdbcURL;
        this.jdbcUser = jdbcUser;
        this.jdbcSenha = jdbcSenha;
    }
     
    protected void conectar() throws SQLException {
        if (jdbcConexao == null || jdbcConexao.isClosed()) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                throw new SQLException(e);
            }
            jdbcConexao = DriverManager.getConnection(jdbcURL, jdbcUser, jdbcSenha);
        }
    }
     
    protected void desconectar() throws SQLException {
        if (jdbcConexao != null && !jdbcConexao.isClosed()) {
            jdbcConexao.close();
        }
    }
     
    public boolean insertInstrutor(Instrutores instrutor) throws SQLException {
        String sql = "INSERT INTO instrutores (nome, email, valor_hora, login, senha) VALUES (?, ?, ?, ?, ?)";
        conectar();
         
        PreparedStatement comando = jdbcConexao.prepareStatement(sql);
        comando.setString(1, instrutor.getNome());
        comando.setString(2, instrutor.getEmail());
        comando.setInt(3, instrutor.getValor_hora());
        comando.setString(4, instrutor.getLogin());
        comando.setString(5, instrutor.getSenha());
         
        boolean registroInserido = comando.executeUpdate() > 0;
        comando.close();
        desconectar();
        return registroInserido;
    }
     
    public List<Instrutores> listarInstrutores() throws SQLException {
        List<Instrutores> listaInstrutores = new ArrayList<>();
         
        String sql = "SELECT * FROM instrutores";
         
        conectar();
         
        Statement comando = jdbcConexao.createStatement();
        ResultSet resultado = comando.executeQuery(sql);
         
        while (resultado.next()) {
            int id = resultado.getInt("id");
            String nome = resultado.getString("nome");
            String email = resultado.getString("email");
            int valor_hora = resultado.getInt("valor_hora");
            String login = resultado.getString("login");
            String senha = resultado.getString("senha");
             
            Instrutores instrutor = new Instrutores(id, nome, email, valor_hora, login, senha);
            listaInstrutores.add(instrutor);
        }
         
        resultado.close();
        comando.close();
         
        desconectar();
         
        return listaInstrutores;
    }
     
    public boolean deletaInstrutor(Instrutores instrutor) throws SQLException {
        String sql = "DELETE FROM instrutores where id = ?";
         
        conectar();
         
        PreparedStatement comando = jdbcConexao.prepareStatement(sql);
        comando.setInt(1, instrutor.getId());
         
        boolean registroDeletado = comando.executeUpdate() > 0;
        comando.close();
        desconectar();
        return registroDeletado;     
    }
     
    public boolean atualizaInstrutor(Instrutores instrutor) throws SQLException {
        String sql = "UPDATE instrutores SET nome = ?, email = ?, valor_hora = ?, login = ?, senha = ?";
        sql += " WHERE id = ?";
        conectar();
         
        PreparedStatement comando = jdbcConexao.prepareStatement(sql);
        comando.setString(1, instrutor.getNome());
        comando.setString(2, instrutor.getEmail());
        comando.setInt(3, instrutor.getValor_hora());
        comando.setString(4, instrutor.getLogin());
        comando.setString(5, instrutor.getSenha());
        comando.setInt(6, instrutor.getId());
         
        boolean registroAtualizado = comando.executeUpdate() > 0;
        comando.close();
        desconectar();
        return registroAtualizado;     
    }
     
    public Instrutores getInstrutor(int id) throws SQLException {
        Instrutores instrutor = null;
        String sql = "SELECT * FROM instrutores WHERE id = ?";
         
        conectar();
         
        PreparedStatement comando = jdbcConexao.prepareStatement(sql);
        comando.setInt(1, id);
         
        ResultSet resultado = comando.executeQuery();
         
        if (resultado.next()) {
            String nome = resultado.getString("nome");
            String email = resultado.getString("email");
            int valor_hora = resultado.getInt("valor_hora");
            String login = resultado.getString("login");
            String senha = resultado.getString("senha");
             
            instrutor = new Instrutores(id, nome, email, valor_hora, login, senha);
        }
         
        resultado.close();
        comando.close();
         
        return instrutor;
    }
}
