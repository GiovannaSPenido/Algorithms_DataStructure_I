package PRIMEIRO_SEMESTRE.C08;

import java.util.Scanner;
public class C08EX18_GiovannaPenido {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double multiplicacao;
        System.out.print("Insira um número de 1 a 9 para imprimir sua tabuada: ");
        int numero = teclado.nextInt();
        teclado.nextLine();
        System.out.println("|| TABUADA DO "+numero+" ||");
        for (int aux = 1; aux <= 10; aux++) {
            multiplicacao = numero * aux;
            System.out.println( aux+" x "+numero+" = "+multiplicacao+"\n");
        }
        teclado.close();
    }
}