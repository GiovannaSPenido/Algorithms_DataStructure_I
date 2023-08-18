package PRIMEIRO_SEMESTRE.C13;

import java.util.Scanner;

public class C13EX08_GiovannaPenido {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String nomeCompleto;

        // entrada de dados
        System.out.print("\nInforme o nome completo do autor: ");
        nomeCompleto = console.nextLine();
        console.close();

        // separação da String e seleção do último índice
        String partesNome[] = nomeCompleto.split(" ");
        String ultimoNome = partesNome[partesNome.length - 1];

        // separação da inicial de cada String usando o método .charAt(pos)
        String iniciais = "";
        for (int i = 0; i < partesNome.length - 1; i++) {
            iniciais += partesNome[i].charAt(0) + ".";
        }

        // impressão
        System.out.println(" => "+ultimoNome.toUpperCase()+", "+iniciais);
    }
}

