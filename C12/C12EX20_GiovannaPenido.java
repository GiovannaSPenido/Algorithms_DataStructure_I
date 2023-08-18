package PRIMEIRO_SEMESTRE.C12;

import java.util.Scanner;

public class C12EX20_GiovannaPenido {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int vetNumeros[] = new int[10], cont = 0;
        double soma = 0;
        for(int aux = 0; aux < vetNumeros.length; aux++) {
            System.out.print("Informe um número inteiro: ");
            vetNumeros[aux] = console.nextInt();
            System.out.println();
        }
        console.close();
        System.out.println("Números Impressos -> ");
        for(int aux = 0; aux < vetNumeros.length; aux++) {
            if(vetNumeros[aux] > vetNumeros[9]) {
                System.out.println(" | "+vetNumeros[aux]);
                soma += vetNumeros[aux];
                cont++;
            }
        }
        double media = (float) soma / cont;
        System.out.println("Média: "+media);
    }
}
