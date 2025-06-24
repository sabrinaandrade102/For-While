import java.util.ArrayList;
import java.util.Scanner;

public class ContadorDePalavras {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> listaPalavras = new ArrayList<>();

        while (true) {
            System.out.print("Digite uma palavra (ou 'fim' para encerrar): ");
            String palavra = scan.next();
            if (palavra.equalsIgnoreCase("fim")) {
                break;
            }
            listaPalavras.add(palavra);
        }

        System.out.println("\nPalavras digitadas: " + listaPalavras);
        System.out.println("Total de palavras: " + listaPalavras.size());
    }
}
