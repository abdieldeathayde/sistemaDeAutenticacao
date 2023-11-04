package modelo;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static Set<Usuario> usersSet = new HashSet<>();
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        System.out.println("\tMENU: \n\n0 - Sair  \n1 - Cadastrar usuário \n2 - Fazer login");
        opcao = sc.nextInt();
        sc.nextLine();


        do {
            switch (opcao) {
                case 1 -> cadastrarUsuario();
                case 2 -> efetuarLogin();
                default -> System.out.println("Opção inválida");
            }
            opcao = menu();

        } while (opcao != 0);
    }

    private static void efetuarLogin() {
            System.out.println("Digite seu login: ");
            String login = sc.nextLine();
            System.out.println("Digite sua senha: ");
            String senha = sc.nextLine();
            Login logon = new Login();

            logon.autenticarLogin(login, senha, usersSet);
    }

    private static void cadastrarUsuario() {

        System.out.println("Escolha um login: ");
        String login = sc.nextLine();
        System.out.println("Escolha uma senha: ");
        String senha = sc.nextLine();
        Usuario usuarios = new Usuario(login, senha);
        usersSet.add(usuarios);

    }

    static int menu() {

        int opcao;
        System.out.println("\tMENU: \n\n0 - Sair  \n1 - Cadastrar usuário \n2 - Fazer login");
        opcao = sc.nextInt();
        return opcao;


    }
}