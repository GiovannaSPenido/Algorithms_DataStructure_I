package PRIMEIRO_SEMESTRE.C05;

import java.util.Scanner;
public class C05EX01_GiovannaPenido {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double fx, x;
        System.out.print("Informe o valor de x: ");
        x = teclado.nextDouble();
        fx = Math.pow(x,3) + 4 * x + 10;
        System.out.println("f(x) = "+fx);
        teclado.close();
    }
}
