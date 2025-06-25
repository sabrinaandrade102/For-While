import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        ArrayList <String> listaMusicas= new ArrayList<>();
        System.out.println("Digite aqui o nome de uma música: ");
        String musica = scan.nextLine();
        listaMusicas.add(musica);
        listaMusicas.add("Mina feia");
        listaMusicas.add("Diario de um detento");
        listaMusicas.add("Viena");
        listaMusicas.add("Pelados em Santos");
        listaMusicas.add("Chop Suey");

        for (int i = 0; i < listaMusicas.size(); i++) {
            System.out.println(i + 0 + " - " + listaMusicas.get(i));}

        int sorteado = random.nextInt(listaMusicas.size());
        System.out.println("Número da música sorteada: "+random.nextInt(listaMusicas.size()));
    }
}

//5. Top 5 Músicas Favoritas
//● Peça para o usuário inserir 5 músicas favoritas
//● Permita mudar a posição de uma música na lista (reordenar por índice)
//● Mostrar a lista final formatada
//
//Explora: set(), get(), manipulação por índice

