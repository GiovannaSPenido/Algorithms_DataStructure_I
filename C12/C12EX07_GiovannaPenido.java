package PRIMEIRO_SEMESTRE.C12;

import java.util.Scanner;

public class C12EX07_GiovannaPenido {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String nomes[] = new String[5];
        int notas[] = new int[5];
        for (int aux = 0; aux < notas.length; aux++) {
            System.out.print("Informe o seu nome: ");
            nomes[aux] = console.nextLine();
            System.out.print("Informe a sua nota: ");
            notas[aux] = console.nextInt();
            console.nextLine();
        }
        for (int aux = 0; aux < notas.length; aux++) {
            System.out.println("NOME: "+nomes[aux]+" || ");
            if (notas[aux] <= 30) {
                System.out.print("CONCEITO D");
            } else if (notas[aux] >= 31 && notas[aux] <= 60) {
                System.out.print("CONCEITO C");
            } else if (notas[aux] >= 61 && notas[aux] <= 90) {
                System.out.print("CONCEITO B");
            } else {
                System.out.print("CONCEITO A");
            }
            System.out.println();
        }
        console.close();
    }
}
