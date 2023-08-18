package PRIMEIRO_SEMESTRE.C08;

import java.util.Scanner;
public class C08EX29_GiovannaPenido {
    public static void main(String[] args) {
        double multi = 1;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o valor de X: ");
        double valorX = teclado.nextDouble();
        System.out.print("Informe o valor de Y: ");
        double valorY = teclado.nextDouble();
        for (int aux = 1; aux <= valorY; aux++) {
            multi *= valorX;
        }
        System.out.println(valorX+" ^ "+valorY+" = "+multi);
        teclado.close();
    }
}