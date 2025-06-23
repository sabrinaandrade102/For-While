import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número entre zero e dez: ");
        double numero = scan.nextDouble();

        while (numero < 0 || numero > 10) {
            System.out.println("Inválida, tente novamente: ");
            numero = scan.nextDouble();
        }
        System.out.println("Nota válida registrada: "+numero);
    }
}



