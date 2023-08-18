package PRIMEIRO_SEMESTRE.C12;

import java.util.Scanner;

public class C12EX16_GiovannaPenido {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double vetNumeros[] = new double[10], numero = 0, vetConta[] = new double[10];
        for(int aux = 0; aux < vetNumeros.length; aux++) {
            System.out.print("Informe um número inteiro: ");
            vetNumeros[aux] = console.nextDouble();
            System.out.println();
        }
        System.out.print("Informe um número para multiplicar todos os outros: ");
        numero = console.nextDouble();

        for(int aux = 0; aux < vetNumeros.length; aux++) {
            vetConta[aux] = vetNumeros[aux] * numero;
        }
        for(int aux = 0; aux < vetNumeros.length; aux++) {
            System.out.println(" | "+vetConta[aux]);
        }
        console.close();
    }
}
