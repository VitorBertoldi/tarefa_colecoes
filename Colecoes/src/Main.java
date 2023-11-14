import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> masculino = new ArrayList<>();
        ArrayList<String> feminino = new ArrayList<>();

        System.out.println("Para a parte 1, digite os nomes separados por ,: ");
        String nome = sc.next();
        String[] nomes = nome.split(",");
        List listaNomes = Arrays.asList(nomes);
        Collections.sort(listaNomes);
        System.out.println(listaNomes);


        System.out.println("Para a parte dois digite o nome-sexo,nome-sexo... usar M --> masculino e F --> feminino");
        String input = sc.next();
        String[] participantes = input.split(",");

        for (int i = 0; i < participantes.length; i++) {
            String[] nomeSexo = participantes[i].split("-");
            if (nomeSexo[1].equals("M"))
                masculino.add(nomeSexo[0]);
            else
                feminino.add(nomeSexo[0]);
        }
        Collections.sort(masculino);
        Collections.sort(feminino);
        System.out.println(masculino);
        System.out.println(feminino);

    }
}