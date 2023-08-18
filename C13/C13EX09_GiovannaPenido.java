package PRIMEIRO_SEMESTRE.C13;

import java.util.Scanner;

public class C13EX09_GiovannaPenido {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        // entrada de dados
        System.out.print("Insira sua frase: ");
        String frase = console.nextLine();
        frase.toLowerCase();

        // separação da String + seleção das iniciais com substring e uppercase + restante com lowercase
        String palavras[] = frase.split(" ");
        String novaFrase = "";
        for (String palavra : palavras) {
            String iniciais = palavra.substring(0, 1).toUpperCase();
            String restante = palavra.substring(1).toLowerCase();

            novaFrase += iniciais + restante + " ";
        }

        // saída de dados
        System.out.println(novaFrase);
    }
}

