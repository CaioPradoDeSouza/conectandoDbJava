package DAO;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import conexao.conexao;
import entity.usuario;

public class UsuarioDAO {
    
    public void cadastrarUsuario(usuario Usuario){

        String sql = "INSERT INTO(NOME, LOGIN, SENHA, EMAIL) VALUES(?, ?, ?, ?)";

        PreparedStatement ps = null;

        try {
            ps = conexao.getConexao().prepareStatement(sql);
            ps.setString(1, usuario.getNome());

            ps.setString(2, usuario.getLogin());

            ps.setString(3, usuario.getSenha());

            ps.setString(4, usuario.getEmail());

            ps.execute();
            ps.close();

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
