package PRIMEIRO_SEMESTRE.C12;

import java.util.Scanner;
public class C12EX22_GiovannaPenido {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int vetNumeros[] = new int[20];
        for(int aux = 0; aux < vetNumeros.length; aux++) {
            System.out.print("Informe um número inteiro: ");
            vetNumeros[aux] = console.nextInt();
            System.out.println();
        }
        console.close();
        System.out.println("Números Impressos -> ");
        for(int aux = 0; aux < vetNumeros.length; aux++) {
            if(aux % 2 == 0) {
                System.out.print(" | "+vetNumeros[aux]);
            } else {
                System.out.print(" | "+vetNumeros[aux]);
            }
        }
    }
}

