package PRIMEIRO_SEMESTRE.C08;

import java.util.Scanner;
public class C08EX20_GiovannaPenido {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double termoPA = 0, soma = 0;
        System.out.print("Insira a quantidade de termos da PA: ");
        int numTermos = teclado.nextInt();
        for (int aux = 0; aux <= numTermos; aux++) {
            soma += termoPA;
            termoPA = Math.pow(2,aux);
        }
        System.out.printf("A soma dos "+numTermos+" primeiros termos = "+soma);
        teclado.close();
    }
}
