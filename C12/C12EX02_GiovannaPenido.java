package PRIMEIRO_SEMESTRE.C12;

import java.util.Scanner;

public class C12EX02_GiovannaPenido {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int vet [] = new int[10];
        for (int aux = 0; aux < vet.length; aux++) {
            System.out.print("Informe um número inteiro: ");
            vet [aux] = console.nextInt();
        }
        System.out.println();
        System.out.println("Números impressos: ");
        for (int aux = 0; aux < vet.length; aux++) {
            if (vet[aux] > 5 && vet[aux] < 10) {
                System.out.println(vet[aux]);
            }
        }
        console.close();
    }
}
