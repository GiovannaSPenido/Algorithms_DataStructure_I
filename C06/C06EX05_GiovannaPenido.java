package PRIMEIRO_SEMESTRE.C06;

import java.util.Scanner;
public class C06EX05_GiovannaPenido {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero, resto1, resto2;
        System.out.print("Insira o número: ");
        numero = teclado.nextInt();
        resto1 = numero % 5;
        resto2 = numero % 7;
        if(resto1 == 0 && resto2 == 0){
            System.out.println("O número é divisível simultaneamente por 5 e 7");
        } else {
            System.out.println("O número não é divisível simultaneamente por 5 e 7");
        }
        teclado.close();
    }
}

