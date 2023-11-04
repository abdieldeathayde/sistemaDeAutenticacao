package modelo;

import java.util.*;
public class Login {
    Scanner sc = new Scanner(System.in);





    void autenticarLogin(String login, String senha, Set<Usuario> usersSet) {




        boolean autenticado = usersSet.stream().anyMatch(u -> u.getLogin().equals(login) && u.getSenha().equals(senha));

        if (autenticado) {
            System.out.println("Usuário logado com sucesso! " + login);
        } else {
            System.out.println("Usuário ou senha incorretos!");
        }

        sc.close();

    }

}
