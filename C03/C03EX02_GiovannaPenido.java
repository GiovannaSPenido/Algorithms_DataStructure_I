package PRIMEIRO_SEMESTRE.C03;

import java.util.Scanner;
public class C03EX02_GiovannaPenido {
    // Função: Calcula a média de 3 números inteiros
    // Autor: Giovanna Silva Penido
    public static void main(String[] args) {
        long n1, n2, n3, soma;
        double media;
        Scanner teclado = new Scanner(System.in) ;
        System.out.print("Informe um número:");
        n1 = teclado.nextLong();
        System.out.print("Informe um número:");
        n2 = teclado.nextLong();
        System.out.print("Informe um número:");
        n3 = teclado.nextLong();
        soma =  n1 + n2 + n3;
        media = soma / 3.0;
        System.out.println("Média = " + media);
        teclado.close();
    }
}
