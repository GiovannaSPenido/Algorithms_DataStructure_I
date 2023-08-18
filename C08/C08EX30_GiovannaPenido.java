package PRIMEIRO_SEMESTRE.C08;

import java.util.Scanner;
public class C08EX30_GiovannaPenido {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double serie = 1, soma = 0;
        System.out.print("Informe o valor de X: ");
        double valorX = teclado.nextDouble();
        System.out.print("Informe o número de termos: ");
        double numTermos = teclado.nextDouble();
        for (int aux = 1; aux <= numTermos; aux++) {
            serie = Math.pow(valorX,aux) / aux;
            soma += serie;
        }
        System.out.println("S = "+soma);
    }
}