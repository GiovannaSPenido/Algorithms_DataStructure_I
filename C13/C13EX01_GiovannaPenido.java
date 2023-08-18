package PRIMEIRO_SEMESTRE.C13;

import java.util.Scanner;

public class C13EX01_GiovannaPenido {
    static double valorX1, valorX2, valorY1, valorY2;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Insira a coordenada X1: ");
        valorX1 = console.nextDouble();
        System.out.print("Insira a coordenada Y1: ");
        valorY1 = console.nextDouble();
        System.out.print("Insira a coordenada X2: ");
        valorX2 = console.nextDouble();
        System.out.print("Insira a coordenada Y2: ");
        valorY2 = console.nextDouble();
        System.out.println("DISTÂNCIA = "+funcao(valorX1,valorX2,valorY1,valorY2));
    }
    public static double funcao(double valorX1, double valorX2, double valorY1, double valorY2) {
        double distancia, valor1, valor2;
        valor1 = Math.pow(valorX1 - valorX2, 2);
        valor2 = Math.pow(valorY1 - valorY2, 2);
        distancia = Math.sqrt(valor1 + valor2);
        return distancia;
    }
}


