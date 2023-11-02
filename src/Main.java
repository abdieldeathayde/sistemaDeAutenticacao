
import modelo.Usuario;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Usuario> users = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int opcao;
        String login;
        String senha;

        do {
            System.out.println("\tMENU: \n\n1 - Cadastrar usuário \n2 - Fazer login");
            opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 1) {
                System.out.println("Escolha um login: ");
                login = sc.nextLine();
                System.out.println("Escolha uma senha: ");
                senha = sc.nextLine();
                Usuario usuarios = new Usuario(login, senha);
                users.add(usuarios);


                System.out.println("Usuario: " + usuarios + "array: " + users + " cadastrado com sucesso! \nSenha: " + senha);

                System.out.println("\tMENU: \n\n1 - Cadastrar usuário \n2 - Fazer login");
                opcao = sc.nextInt();
                sc.nextLine();


//            } else if (opcao == 2) {
//                Login lgin = new Login();
//                lgin.efetuar_login();
            }else {
                System.out.println("Opção inválida!");
                break;
            }

        }while (opcao != 0);
    }
}