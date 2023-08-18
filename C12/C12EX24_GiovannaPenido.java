package PRIMEIRO_SEMESTRE.C12;

import java.util.Scanner;

public class C12EX24_GiovannaPenido {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int vetor1[] = new int[10], cont = 0;
        for (int aux = 0; aux < vetor1.length; aux++) {
            System.out.print("Insira um número inteiro: ");
            vetor1[aux] = console.nextInt();
        }
        int vetor2[] = new int[vetor1.length];
        for (int aux = 0; aux < vetor1.length; aux++) {
            vetor2[aux] = vetor1[aux];
        }
        console.close();
        for(int aux = 0; aux < vetor2.length; aux++) {
            if (vetor2[aux] % 3 == 0) {
                System.out.print(" | "+vetor2[aux]);
            }
        }
    }
}
