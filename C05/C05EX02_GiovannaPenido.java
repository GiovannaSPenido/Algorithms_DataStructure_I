package PRIMEIRO_SEMESTRE.C05;

import java.util.Scanner;
public class C05EX02_GiovannaPenido {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double raio, area, volume;
        System.out.print("Informe o valor do raio: ");
        raio = teclado.nextDouble();
        area = 4 * 3.1416 * Math.pow(raio,2);
        volume = (4 * 3.1416 * Math.pow(raio,3)) / 3;
        System.out.println("Área = "+area);
        System.out.println("Volume = "+volume);
        teclado.close();
    }
}
