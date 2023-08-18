package PRIMEIRO_SEMESTRE.C14.PROJETO_AEDI.src;

import java.util.Scanner;

public class SERIE_3 {
    public Scanner console = new Scanner(System.in);

    public static double serie3(double conta) {
        double num = 1, den = 6, serie = 0;
        for (int aux = 1; aux <= 100; aux++) {
            serie += num / den;
            num++;
            den += 6;
        }
        conta = serie;
        System.out.println("Resultado " + conta);
        return conta;
    }
}

