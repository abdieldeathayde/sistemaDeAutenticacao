package modelo;

import java.util.*;

import modelo.Usuario;
public class Login {
    Scanner sc = new Scanner(System.in);





    void autenticarLogin(Usuario user) {
        String login;
        System.out.println("Digite seu login:");
        login = sc.nextLine();

        String senha;
        System.out.println("Digite sua senha: ");
        senha = sc.nextLine();

        Usuario usuario = new Usuario(login, senha);



        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(usuario);


        boolean autenticado = usuarios.stream().anyMatch(u -> u.getLogin().equals(login) && u.getSenha().equals(senha));

        if (autenticado) {
            System.out.println("Usuário logado com sucesso! " + usuario);
        } else {
            System.out.println("Usuário ou senha incorretos!");
        }

        sc.close();

    }

}
