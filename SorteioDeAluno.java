import java.util.ArrayList;
import java.util.Random;

public class SorteioDeAluno {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<String> listaAlunos = new ArrayList<>();

        listaAlunos.add("Sabrina");
        listaAlunos.add("Bruno");
        listaAlunos.add("Yago");
        listaAlunos.add("Camile");
        listaAlunos.add("Ana");

        for (int i = 0; i < listaAlunos.size(); i++) {
            System.out.println((i + 1) + " - " + listaAlunos.get(i));
        }

        int sorteado = random.nextInt(listaAlunos.size());
        System.out.println("\nAluno sorteado: " + listaAlunos.get(sorteado));
    }
}
