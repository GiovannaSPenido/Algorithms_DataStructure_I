package PRIMEIRO_SEMESTRE.C12;

import java.util.Scanner;

public class C12EX04_GiovannaPenido {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int vet [] = new int[20], posicao;
        for (int aux = 0; aux < vet.length; aux++) {
            posicao = aux + 1;
            System.out.print("Informe o número do corredor que chegou na posição "+posicao+": ");
            vet [aux] = console.nextInt();
        }
        for (int aux2 = 0; aux2 < 9; aux2++) {
            posicao = aux2 + 1;
            System.out.println("POSIÇÃO " + posicao + " || DUPLA FORMADA: " + vet[aux2] + " e " + vet[aux2 + 10]);
        }
        System.out.println();
        console.close();
    }
}