package PRIMEIRO_SEMESTRE.C06;

import java.util.Scanner;
public class C06EX01_GiovannaPenido {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double x, fx;
        System.out.print("Insira o valor de x: ");
        x = teclado.nextDouble();
        if(x < 4) {
            fx = (5 * x + 3) / Math.sqrt(16 - Math.pow(x,2));
            System.out.println("O valor de f(x) é "+fx);
        } else {
            if(x == 4) {
                fx = 0;
                System.out.println("O valor de f(x) é "+fx);
            } else {
                if(x > 4) {
                    fx = (5 * x + 3) / Math.sqrt(Math.pow(x,2) - 16);
                    System.out.println("O valor de f(x) é "+fx);
                }
            }
        }
        teclado.close();
    }
}
