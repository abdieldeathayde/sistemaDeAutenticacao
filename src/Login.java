import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import modelo.Usuario;
public class Login {
    Scanner sc = new Scanner(System.in);




    public void efetuar_login() {
        System.out.println("Por favor, digite seu login: \n");
        String login = sc.nextLine();
        System.out.println("Por favor digite sua senha: \n");
        String senha = sc.nextLine();

        Usuario user = new Usuario(login, senha);

        ArrayList<Usuario> usuario = new ArrayList<>();
        usuario.add(user);

        if (usuario.contains(user.getLogin())) {

        }
    }
//

//
//
//        if (login.equalsIgnoreCase(user.getLogin()) && senha.equalsIgnoreCase(user.getSenha())) {
//            System.out.println("Logado com sucesso!");
//        } else {
//            System.out.println("Erro! Login ou senha incorretos!");
//        }


//    }
}
