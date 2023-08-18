package PRIMEIRO_SEMESTRE.C12;

import java.util.Scanner;

public class C12EX01_GiovannaPenido {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int numero, contador = 0;
        for (int aux = 1; aux <= 10; aux++) {
        System.out.print("Insira um número: ");
        numero = console.nextInt();
        if (numero % 5 == 0 && numero % 7 == 0) {
            contador++;
        }
        }
        System.out.println("\nQuantidade de divisores de 5 e 7 ao mesmo tempo = "+contador);
        console.close();
    }
}
