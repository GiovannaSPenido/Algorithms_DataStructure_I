package PRIMEIRO_SEMESTRE.C06;

import java.util.Scanner;
public class C06EX06_GiovannaPenido {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double a, b, c, x, delta, raiz1, raiz2, fx;
        System.out.print("Insira o valor de a: ");
        a = teclado.nextDouble();
        System.out.print("Insira o valor de b: ");
        b = teclado.nextDouble();
        System.out.print("Insira o valor de c: ");
        c = teclado.nextDouble();
        delta = Math.pow(b,2) - 4 * a * c;
        raiz1 = ((-1 * b) + Math.sqrt(delta)) / (2 * a);
        raiz2 = ((-1 * b) - Math.sqrt(delta)) / (2 * a);
        if(delta > 0){
            System.out.println("Existem duas raízes reais!"+"\nX1 = "+raiz1+"\nX2 = "+raiz2);
        } else {
            if(delta == 0){
                System.out.println("Existe apenas uma raíz!"+"\nX = "+raiz1);
            } else {
                if(delta < 0){
                    System.out.println("Não existem raízes!");
                }
            }
        }
        teclado.close();
    }
}