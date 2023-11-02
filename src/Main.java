import modelo.Usuario;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> users = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\tMENU: \n\n1 - Cadastrar usuário \n2 - Fazer login");
            opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 1) {
                Usuario user = new Usuario();
                user.cadastrar_usuario();
                users.add(user.getLogin());

                for (int i = 0; i < users.size(); i ++) {
                    System.out.println("Usuario: " + users.indexOf(i) + " cadastrado com sucesso!");

                    System.out.println("\tMENU: \n\n1 - Cadastrar usuário \n2 - Fazer login");
                    opcao = sc.nextInt();
                    sc.nextLine();
                }

            } else if (opcao == 2) {
                Login lgin = new Login();
                lgin.efetuar_login();
            } else {
                System.out.println("Opção inválida!");
                break;
            }

        }while (opcao != 0);
    }
}