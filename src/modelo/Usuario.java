package modelo;

import java.util.Objects;
import java.util.Scanner;

public class Usuario {

    Scanner sc = new Scanner(System.in);
    private String login;
    private String senha;

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(login, usuario.login);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login);
    }

    public void cadastrar_usuario() {

        System.out.println("Por favor, digite seu login: \n");
        login = sc.nextLine() ;

        System.out.println("Por favor, digite sua senha: \n");
        senha = sc.nextLine();

        if (login.isEmpty() && senha.isEmpty()) {
            System.out.println("Erro! login ou senha estão vazios!");
        } else {
            System.out.println("Cadastro efetuado com sucesso!");
        }



    }



}
