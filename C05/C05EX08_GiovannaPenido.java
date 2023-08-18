package PRIMEIRO_SEMESTRE.C05;

import java.util.Scanner;
public class C05EX08_GiovannaPenido {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double area, angulo;
        double raio, multiplicacao1, multiplicacao2;
        System.out.print("Insira o valor da área do setor circular: ");
        area = teclado.nextDouble();
        System.out.print("Insira o valor da área do ângulo: ");
        angulo = teclado.nextDouble();
        multiplicacao1 = 360 * area;
        multiplicacao2 = angulo * 3.1416;
        raio = Math.sqrt(multiplicacao1/multiplicacao2);
        System.out.println("Raio ="+raio);
        teclado.close();
    }
}

