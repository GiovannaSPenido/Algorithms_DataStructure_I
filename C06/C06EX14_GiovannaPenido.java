package PRIMEIRO_SEMESTRE.C06;

import java.util.Scanner;
public class C06EX14_GiovannaPenido {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Insira um número de 4 dígitos para verificar o seu inverso: ");
        int numero4d = teclado.nextInt();
        if (numero4d < 1000 || numero4d > 9999) {
            System.out.println("O número deve possuir 4 dígitos! Reinicie o programa!");
        } else {
            if (numero4d >= 1000 && numero4d < 9999) {
                int dig1 = numero4d / 1000;
                int dig2 = numero4d / 100 % 10;
                int dig3 = numero4d % 100 / 10;
                int dig4 = numero4d % 10;
                System.out.println("O número "+numero4d+" invertido é "+dig4+dig3+dig2+dig1+".");
            }
        }
        teclado.close();
    }
}