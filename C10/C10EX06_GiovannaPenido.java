package PRIMEIRO_SEMESTRE.C10;

import java.util.Scanner;
public class C10EX06_GiovannaPenido {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double valorX, valorY, distancia;
        System.out.print("Insira o valor A da reta R: ");
        double valorA = console.nextDouble();
        System.out.print("Insira o valor B da reta R: ");
        double valorB = console.nextDouble();
        System.out.print("Insira o valor C da reta R: ");
        double valorC = console.nextDouble();
        System.out.println();
        do {
            System.out.print("Insira a coordenada X: ");
            valorX = console.nextDouble();
            System.out.print("Insira a coordenada Y: ");
            valorY = console.nextDouble();
            distancia = ((valorA * valorX) + (valorB * valorY) + valorC) / Math.sqrt(Math.pow(valorA,2) + Math.pow(valorB,2));
            System.out.println("D = "+distancia);
            System.out.println();
        } while (distancia != 0);
        console.close();
    }
}
