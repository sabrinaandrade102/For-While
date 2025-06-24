import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeNomes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> listaNomes = new ArrayList<>();

        listaNomes.add("João");
        listaNomes.add("Maria");
        listaNomes.add("Pedro");
        listaNomes.add("Joana");

        while (true) {
            System.out.println("1 - Exibir\n2 - Remover\n3 - Adicionar\n0 - Sair");
            int op = scan.nextInt();

            switch (op) {
                case 1:
                    System.out.println(listaNomes);
                    System.out.println("A lista possui " + listaNomes.size() + " itens");
                    break;

                case 2:
                    System.out.print("Digite o índice do nome que deseja remover: ");
                    int indice = scan.nextInt();
                    if (indice >= 0 && indice < listaNomes.size()) {
                        listaNomes.remove(indice);
                    } else {
                        System.out.println("Índice inválido!");
                    }
                    break;

                case 3:
                    System.out.print("Digite o nome que deseja adicionar: ");
                    String nome = scan.next();
                    listaNomes.add(nome);
                    break;

                case 0:
                    System.out.println("Programa encerrado.");
                    return;

                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
