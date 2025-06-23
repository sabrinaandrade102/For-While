import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual seu nome?");
        String nome = scan.nextLine();

        System.out.println("Qual sua idade?");
        int idade = scan.nextInt();

        System.out.println("Qual seu salário?");
        double salario = scan.nextDouble();

        System.out.println("Qual seu sexo? (f/m)");
        char sexo = scan.next().charAt(0);

        System.out.println("Qual seu estado civil? (s/c/v/d)");
        char estado = scan.next().charAt(0);

        if (nome.length() <= 3) {
            System.out.println("O nome deve ter mais que 3 caracteres!");
        } else {
            System.out.println("Bem-vindo(a), " + nome);
        }

        if (idade < 0 || idade > 150) {
            System.out.println("Idade inválida");
        } else {
            System.out.println("Você tem " + idade + " anos");
        }

        if (salario <= 0) {
            System.out.println("Salário inválido.");
        } else {
            System.out.println("Seu salário é: " + salario);
        }

        if (sexo != 'f' && sexo != 'm') {
            System.out.println("Sexo inválido.");
        } else {
            System.out.println("Sexo informado: " + sexo);
        }

        if (estado != 's' && estado != 'c' && estado != 'v' && estado != 'd') {
            System.out.println("Estado civil inválido. Digite apenas s, c, v ou d.");
        } else {
            System.out.println("Estado civil informado: " + estado);
        }
    }
}
