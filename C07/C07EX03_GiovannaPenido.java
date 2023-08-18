package PRIMEIRO_SEMESTRE.C07;

import java.util.Scanner;
public class C07EX03_GiovannaPenido {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Insira o valor do imposto: ");
        double imposto = teclado.nextInt();
        System.out.print("Insira a quantidade de dias de atraso: ");
        int diasAtraso = teclado.nextInt();
        double multa;
        switch (diasAtraso) {
            case 1, 2, 3, 4, 5 -> System.out.println(" -> Para a quantidade de dias inserida há isenção de multa.");
            case 6, 7, 8 -> {
                multa = imposto * 0.02;
                System.out.println(" -> Multa de R$" + multa);
            }
            case 9, 10 -> {
                double imposto2 = imposto * 0.1;
                multa = imposto2 + (diasAtraso * 0.5);
                System.out.println(" -> Multa de R$" + multa);
            }
            default -> {
                if (diasAtraso > 10) {
                    multa = (imposto * 1.5) + (diasAtraso * 1);
                    System.out.println(" -> Multa de R$" + multa);
                }
            }
        }
    }
}


