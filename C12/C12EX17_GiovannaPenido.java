package PRIMEIRO_SEMESTRE.C12;

import java.util.Scanner;

public class C12EX17_GiovannaPenido {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int vetNumeros[] = new int[10];
        for (int aux = 0; aux < vetNumeros.length; aux++) {
            System.out.print("\nInforme os números do seu vetor: ");
            vetNumeros[aux] = console.nextInt();
        }
        console.close();
        int vet2[] = new int[vetNumeros.length];
        for (int aux = 0; aux < vetNumeros.length; aux++) {
            vet2[aux] = vetNumeros[aux];
        }
        System.out.println();
        for(int aux = vet2.length-1; aux >= 0; aux--) {
            System.out.print(" |"+vet2[aux]+"| ");
        }
    }
}