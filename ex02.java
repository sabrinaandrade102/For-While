import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                String usuario, senha;

                System.out.println("Digite o nome de usuário:");
                usuario = scan.nextLine();

                System.out.println("Digite a senha:");
                senha = scan.nextLine();

                while (senha.equals(usuario)) {
                    System.out.println("Inválido, a senha não pode ser igual ao nome de usuário.");
                    System.out.println("Digite o nome de usuário:");
                    usuario = scan.nextLine();
                    System.out.println("Digite a senha:");
                    senha = scan.nextLine();
                }
                System.out.println("Cadastro realizado com sucesso!");
                scan.close();
            }
        }

