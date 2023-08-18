package PRIMEIRO_SEMESTRE.C05;

import java.util.Scanner;
public class C05EXTRA1_GiovannaPenido {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n1, n2, n3, n4, numero, soma1, soma2;
        System.out.print("Insira um número de 4 algarismos e descubra se ele é classificado como palíndromo ou não: ");
        numero = teclado.nextInt();
        n1 = numero / 1000;
        n2 = (numero % 1000) / 100;
        n3 = (numero % 100) / 10;
        n4 = numero % 10;
        soma1 = n1 + n2;
        soma2 = n3 + n4;
        if (soma1 == soma2) {
            System.out.println("O número é um palíndromo!");
        } else {
            System.out.println("O número não é um palíndromo!");
        }
        teclado.close();
    }
}
