
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> Senhas = new ArrayList<>();
        ArrayList<String> Logins = new ArrayList<>();

        Logins.add(0, "Desenvolvedor");
        Senhas.add(0, "dev123");

        System.out.println("\tMENU: \n\n1 - Cadastrar usuário \n2 - Fazer login");
        int opcao = sc.nexInt();
        sc.nextLine();

        if (opcao == 1) {


        } else if (opcao == 2) {
            System.out.println("Login: ");
            String login = sc.nextLine();
            Logins.add(1, login);
            String senha = sc.nextLine();
            Senhas.add(1, senha);
            if (Logins.get(1).equalsIgnoreCase(Logins.get(0)) && Senhas.get(1).equalsIgnoreCase(Senhas.get(0))) {
                System.out.println("Logado com sucesso! \n\nObrigado por utilizar nosso sistema! ");
            } else {
                System.out.println("login ou senha incorretos!");
            }
        }


        System.out.println("Hello world!");
    }
}