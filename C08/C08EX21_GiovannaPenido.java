package PRIMEIRO_SEMESTRE.C08;

import java.util.Scanner;
import java.text.DecimalFormat;
public class C08EX21_GiovannaPenido {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double imc;
        String imcFormatado;
        System.out.print("Olá, vamos conhecer a tabela do seu IMC?" + "\nPrimeiramente, informe sua altura em metros: ");
        double altura = teclado.nextDouble();
        System.out.println("|| PESO |  IMC | SITUAÇÃO CORPÓREA ||");
        System.out.println("____________________________________");
        for (int aux = 60; aux <= 100; aux++) {
            imc = (float) aux / Math.pow(altura, 2);
            imcFormatado = new DecimalFormat("#,###0.0").format(imc);
            if (imc < 20) {
                System.out.println("||  " + aux + "  | " + imcFormatado + " |   ABAIXO DO PESO  ||");
                System.out.println("____________________________________");
            } else if (imc >= 20 && imc <= 25) {
                System.out.println("||  " + aux + "  | " + imcFormatado + " |     PESO IDEAL    ||");
                System.out.println("____________________________________");
            } else if (aux == 100) {
                System.out.println("||  " + aux + " | " + imcFormatado + " |   ACIMA DO PESO   ||");
                System.out.println("____________________________________");
            } else {
                System.out.println("||  " + aux + "  | " + imcFormatado + " |   ACIMA DO PESO   ||");
                System.out.println("____________________________________");
            }
        }
        teclado.close();
    }
}
