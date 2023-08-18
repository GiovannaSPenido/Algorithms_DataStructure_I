package PRIMEIRO_SEMESTRE.C09;

import java.util.Scanner;
public class C09EX05_GiovannaPenido {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double num = 3, den = 7, serie = 0;
        System.out.print("Insira o número de termos que a série terá: ");
        int termos = console.nextInt();
        for (int aux = 1; aux <= termos; aux++) {
            serie += (float) num / den;
            num += 5;
            den += 6;
        }
        System.out.println("Valor da série = "+serie);
        console.close();
    }
}

