package PRIMEIRO_SEMESTRE.C14.PROJETO_AEDI.src;

import java.util.Scanner;

public class SERIE_4 {
    public Scanner console = new Scanner(System.in);

    public static double serie4(double conta) {
        double num = 1, den = 2, serie = 0;
        for (int aux = 1; aux <= 100; aux++) {
            serie += num / Math.sqrt(den);
            num++;
            den += 2;
        }
        conta = serie;
        System.out.println("Resultado " + conta);
        return conta;
    }
}


