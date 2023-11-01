import java.util.Scanner;

public class Usuario {

    Scanner sc = new Scanner(System.in);
    String login;
    String senha;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    void cadastrar_usuario() {

        System.out.println("Por favor, digite seu login: \n");
        login = sc.nextLine() ;

        System.out.println("Por favor, digite sua senha: \n");
        senha = sc.nextLine();

        if (login.isEmpty() && senha.isEmpty()) {
            System.out.println("Erro! login ou senha estão vazios!");
        } else {
            System.out.println("Cadastro efetuado com sucesso!");
        }

        menu();






        Login lgin = new Login();
        lgin.efetuar_login();



    }

    void trocarSenha(){
        System.out.println("Digite seu login: ");
        String lgin = sc.nextLine();
        if (login.equalsIgnoreCase(lgin)) {
            System.out.println("Escolha outra senha: ");
            senha = sc.nextLine();
            setSenha(senha);
        } else {
            System.out.println("Login incorreto, tente novamente!");
            trocarSenha();
        }
    }

    void trocarLogin() {
        System.out.println("Digite seu login atual: ");
        String lgin = sc.nextLine();
        System.out.println("Digite sua senha: ");
        String senha = sc.nextLine();

        if (lgin.equalsIgnoreCase(getLogin()) && senha.equalsIgnoreCase(getSenha())) {
            System.out.println("Escolha seu novo login");
            login = sc.nextLine();
            setLogin(login);
            System.out.println("Login alterado com sucesso! ");
            Login lg = new Login();
            lg.efetuar_login();
        }
    }


    void menu() {
        System.out.println("-----Menu----- \n\n0 - Sair \n1 - Cadastrar Usuário \n2 - Efetuar Login \n3 - Trocar login \n4 - Trocar senha");
        int opcao = sc.nextInt();
        switch (opcao) {
            case 0:
                System.out.println("Encerrando! Obrigado por utilizar nosso sistema!");
                break;
            case 1:
                System.out.println("Olá redirecionando para o cadastro de clientes");
                Usuario user = new Usuario();
                user.cadastrar_usuario();
                break;
            case 2:
                System.out.println("Olá redirecionando para efetuar login!");
                Login lgin = new Login();
                lgin.efetuar_login();
                break;
            case 3:
                System.out.println("Olá, redirecionando para troca de login: ");
                trocarLogin();
            case 4:
                System.out.println("Olá redirecionando para troca de senha");
                trocarSenha();


        }
    }



}
