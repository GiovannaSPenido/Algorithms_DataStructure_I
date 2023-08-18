package PRIMEIRO_SEMESTRE.C11;

import java.util.Scanner;
public class C11EX01_GiovannaPenido {
    public static void main(String[] args) {
        double fx, soma = 0;
        int cont = 0;
        Scanner console = new Scanner(System.in);
        System.out.print("Informe um número inteiro: \n");
        double numero = console.nextDouble();
        for (int x = 1; x <= numero; x++) {
            if (x % 2 != 0) {
                cont++;
                fx = (float) Math.pow(x,2) + (4 * x - 2) / 5.0;
                System.out.println("X = "+x);
                System.out.println("F(x) = "+fx+"\n");
                soma += fx;
            }
        }
        double media = (float) soma / cont;
        System.out.println("MÉDIA = "+media);
        console.close();
    }
}
