import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeCompras {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> listaCompras = new ArrayList<>();

        listaCompras.add("Feijão");
        listaCompras.add("Arroz");
        listaCompras.add("Batata");
        listaCompras.add("Frango");

        while (true) {
            System.out.println("1 - Exibir\n2 - Remover\n3 - Adicionar\n0 - Sair");
            int op = scan.nextInt();

            switch (op) {
                case 1:
                    for (int i = 0; i < listaCompras.size(); i++) {
                        System.out.println((i + 1) + " - " + listaCompras.get(i));
                    }
                    break;

                case 2:
                    System.out.print("Digite o número do item que deseja remover: ");
                    int indice = scan.nextInt() - 1;
                    if (indice >= 0 && indice < listaCompras.size()) {
                        listaCompras.remove(indice);
                    } else {
                        System.out.println("Índice inválido!");
                    }
                    break;

                case 3:
                    System.out.print("Digite o produto que deseja adicionar: ");
                    String produto = scan.next();
                    listaCompras.add(produto);
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
