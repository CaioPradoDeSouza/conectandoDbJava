import DAO.UsuarioDAO;
import entity.usuario;

public class App{
    public static void main(String[] args) throws Exception {

        usuario u = new usuario();
        u.setNome("caio");
        u.setLogin("caio");
        u.setSenha("123456789");
        u.setEmail("caio@uol.com");

        new UsuarioDAO().cadastrarUsuario(u);
    }
}