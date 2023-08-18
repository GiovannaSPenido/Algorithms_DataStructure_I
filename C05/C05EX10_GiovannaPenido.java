package PRIMEIRO_SEMESTRE.C05;

import java.util.Scanner;
public class C05EX10_GiovannaPenido {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        long numero5, divisao1, divisao2, divisao3, divisao4, divisao5;
        System.out.print("Insira um número inteiro de 5 dígitos: ");
        numero5 = teclado.nextLong();
        divisao1 = numero5 / 10000;
        divisao2 = numero5 / 1000 % 10;
        divisao3 = numero5 / 100 % 10;
        divisao4 = numero5 / 10 % 10;
        divisao5 = numero5 % 10;
        System.out.println("Número lido: "+numero5+"\n->Impressão = \n"+divisao1+"\n"+divisao2+"\n"+divisao3+"\n"+divisao4+"\n"+divisao5);
        teclado.close();
    }
}
