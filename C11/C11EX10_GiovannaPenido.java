package PRIMEIRO_SEMESTRE.C11;

import java.util.Scanner;
public class C11EX10_GiovannaPenido {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Insira um número de 1 a 9: ");
        int numero = console.nextInt();
        if (numero == 0 || numero > 9) {
            System.out.println("Número inválido, reinicie o programa!");
        }
        for (int aux1 = 1; aux1 <= numero; aux1++) {
            for (int aux2 = 1; aux2 <= aux1; aux2++) {
                System.out.print("EMGE ");
            }
            System.out.println();
        }
        console.close();
    }
}

