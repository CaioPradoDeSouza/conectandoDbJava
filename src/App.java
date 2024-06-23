import DAO.UsuarioDAO;
import entity.Usuario;

public class App{
    public static void main(String[] args) throws Exception {

        Usuario u = new Usuario();
        u.setNome("caio");
        u.setLogin("caio");
        u.setSenha("123456789");
        u.setEmail("caio@uol.com");

        new UsuarioDAO().cadastrarUsuario(u);
    }
}