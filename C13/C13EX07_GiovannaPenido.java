package PRIMEIRO_SEMESTRE.C13;

import java.util.Scanner;

public class C13EX07_GiovannaPenido {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String nomeCompleto;

        // entrada de dados
        System.out.print("\nInforme o seu nome completo: ");
        nomeCompleto = console.nextLine();
        console.close();

        // separação da String e seleção do último índice
        String partesNome[] = nomeCompleto.split(" ");
        String ultimoNome = partesNome[partesNome.length - 1];

        // impressão
        System.out.println("Nome: "+nomeCompleto+"\nNome de família: "+ultimoNome);
    }
}

