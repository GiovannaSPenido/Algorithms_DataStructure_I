package PRIMEIRO_SEMESTRE.C10;

import java.util.Scanner;

public class C10EX03_GiovannaPenido {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double angulo, raio, areaSC;
        System.out.println("Para interromper o programa digite -1 para Raio!");
        System.out.print("Informe o valor do ângulo: ");
        angulo = console.nextDouble();
        do {
            System.out.print("Informe o valor do raio: ");
            raio = console.nextDouble();
            if (raio != -1) {
                areaSC = (float) (angulo * 3.1416 * Math.pow(raio,2)) / 360;
                System.out.println("S = "+areaSC);
            }
        } while (raio != -1);
        System.out.println("Por raio valer -1, o programa chegou ao FIM!");
        console.close();
    }
}

