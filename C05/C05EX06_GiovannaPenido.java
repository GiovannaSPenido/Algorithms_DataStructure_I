package PRIMEIRO_SEMESTRE.C05;

import java.util.Scanner;
public class C05EX06_GiovannaPenido {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double pontoP, retaR, a, b, c, x, y, distancia;
        System.out.print("Insira o valor de a: ");
        a = teclado.nextDouble();
        System.out.print("Insira o valor de b: ");
        b = teclado.nextDouble();
        System.out.print("Insira o valor de c: ");
        c = teclado.nextDouble();
        System.out.print("Insira o valor de x: ");
        x = teclado.nextDouble();
        System.out.print("Insira o valor de y: ");
        y = teclado.nextDouble();
        retaR = a * x + b * y + c;
        distancia = (a * x + b * y + c)/Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        System.out.println("Distância = "+distancia);
        teclado.close();
    }
}


