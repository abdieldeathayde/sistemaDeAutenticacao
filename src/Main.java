import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\tMENU: \n\n1 - Cadastrar usuário \n2 - Fazer login");
        int opcao = sc.nextInt();
        sc.nextLine();

        if (opcao == 1) {
            Usuario user = new Usuario();
            user.cadastrar_usuario();


        } else if (opcao == 2) {
            Login lgin = new Login();
            lgin.efetuar_login();
        } else {
            System.out.println("Erro! Opção incorreta");
        }


        System.out.println("Hello world!");
    }
}