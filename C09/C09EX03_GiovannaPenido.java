package PRIMEIRO_SEMESTRE.C09;

import java.util.Scanner;
public class C09EX03_GiovannaPenido {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double serie, soma = 0, num, den;
        System.out.print("Informe a quantidade de números: ");
        int numero = teclado.nextInt();
        for (int aux = 1; aux <= numero; aux++) {
            num = Math.sqrt(aux * 4);
            den = aux * 3;
            serie = (1 + num) / den;
            soma += serie;
        }
        System.out.println(soma);
        teclado.close();
    }
}
