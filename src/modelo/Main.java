package modelo;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    static Set<Usuario> usersSet = new HashSet<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("MENU: \n\n0 - Sair  \n1 - Cadastrar usuário \n2 - Fazer login");
        String opcao = sc.next();

        while (opcao.contains("1") || opcao.contains("2")) {
            switch (opcao) {
                case "0" -> System.out.println("Encerrando seção! Obrigado por utilizar nosso sistema!");
                case "1" -> cadastrarUsuario();
                case "2" -> efetuarLogin();
            }
            System.out.println("MENU: \n\n0 - Sair  \n1 - Cadastrar usuário \n2 - Fazer login");
            opcao = sc.next();
        }
    }

    //            System.out.println("MENU: \n\n0 - Sair  \n1 - Cadastrar usuário \n2 - Fazer login");
    //            opcao = sc.nextLine();

    //            option = Integer.parseInt(opcao);


    //        menu();

    //    }
    private static void efetuarLogin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu login: ");
        String login = sc.nextLine();
        System.out.println("Digite sua senha: ");
        String senha = sc.nextLine();
        Login logon = new Login();

        logon.autenticarLogin(login, senha, usersSet);
//        menu();
    }

    private static void cadastrarUsuario() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha um login: ");
        String login = sc.nextLine();
        System.out.println("Escolha uma senha: ");
        String senha = sc.nextLine();
        Usuario usuarios = new Usuario(login, senha);
        usersSet.add(usuarios);
        menu();
    }

    protected static void menu() {


    }
}
