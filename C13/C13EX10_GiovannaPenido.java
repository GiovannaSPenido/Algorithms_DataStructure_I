package PRIMEIRO_SEMESTRE.C13;

import java.util.Scanner;

public class C13EX10_GiovannaPenido {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        // entrada de dados
        System.out.print("Insira uma frase: ");
        String frase = console.nextLine();
        console.close();

        // separação do dado usando .split de letra em letra
        String fraseSeparada[] = frase.split("");

        // saída de dados
        for (int i = 0; i < fraseSeparada.length; i++) {
            System.out.println(fraseSeparada[i].toUpperCase());
        }
    }
}
