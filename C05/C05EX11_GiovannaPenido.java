package PRIMEIRO_SEMESTRE.C05;

import java.util.Scanner;
public class C05EX11_GiovannaPenido {
    public static void main(String[] args) {
        int numCheque, divisao1, divisao2, divisao3;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Insira o número de 9 dígitos presente no cheque: ");
        numCheque = teclado.nextInt();
        divisao1 = numCheque / 1000000;
        divisao2 = numCheque / 1000 % 1000;
        divisao3 = numCheque % 1000;
        System.out.println("Número do cheque = " + numCheque + "\nBanco = " + divisao1 + "\nAgência = " + divisao2 + "\nSequencial = " + divisao3);
        teclado.close();
    }
    }