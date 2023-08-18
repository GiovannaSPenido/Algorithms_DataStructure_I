package PRIMEIRO_SEMESTRE.C12;

import java.util.Scanner;

public class C12EX15_GiovannaPenido {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int vetNumeros[] = new int[10], cont = 0;
        double soma = 0;
        for(int aux = 0; aux < vetNumeros.length; aux++) {
            System.out.print("Informe um número inteiro: ");
            vetNumeros[aux] = console.nextInt();
            System.out.println();
        }
        System.out.println("NUMEROS PARES: ");
        for(int aux = 0; aux < vetNumeros.length; aux++) {
            if(vetNumeros[aux] % 2 == 0) {
                soma += vetNumeros[aux];
                cont++;
                System.out.print(" | " + vetNumeros[aux]);
            }
        }
        double media = (float) soma / cont;
        System.out.println("\nMédia dos números pares = "+media);
        console.close();
    }
}
