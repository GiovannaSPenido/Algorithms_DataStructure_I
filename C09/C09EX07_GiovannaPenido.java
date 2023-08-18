package PRIMEIRO_SEMESTRE.C09;

import java.util.Scanner;
public class C09EX07_GiovannaPenido {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double num = 3, den = 7, serie = 0;
        for (int aux = 1; aux <= 6; aux++) {
            serie += (float) num / den;
            num += 5;
            den += 6;
        }
        double conta = serie;
        System.out.println("Valor da série = "+conta);
        console.close();
    }
}

