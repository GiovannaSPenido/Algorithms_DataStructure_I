package PRIMEIRO_SEMESTRE.C05;

import java.util.Scanner;
public class C05EX07_GiovannaPenido {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double fx, x;
        System.out.print("Insira o valor de x: ");
        x = teclado.nextDouble();
        fx = Math.sqrt((Math.pow(x/4+1,2)+1 * x/5));
        System.out.println("f(x) = "+fx);
        teclado.close();
    }
}

