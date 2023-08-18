package PRIMEIRO_SEMESTRE.C08;

import java.util.Scanner;
public class C08EX01_GiovannaPenido {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        for (int aux = 1; aux <= 10; aux++) {
            System.out.print("Insira o valor do raio: ");
            double raio = teclado.nextDouble();
            double area = 3.1416 * Math.pow(raio,2);
            System.out.println("A área para o raio informado é "+area);
        }
        teclado.close();
    }
}
