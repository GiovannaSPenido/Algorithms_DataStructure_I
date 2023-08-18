package PRIMEIRO_SEMESTRE.C14.PROJETO_AEDI.src;

import java.util.Scanner;

public class SERIE_2 {
    public Scanner console = new Scanner(System.in);

    public static double serie2(double conta) {
        double num = 1, den = 2, serie = 0;
        for (int aux = 1; aux <= 100; aux++) {
            serie += num / den;
            num += 2;
            den += 2;
        }
        conta = (1 / 3.0) * Math.pow(serie, 2);
        System.out.println("Resultado " + conta);
        return conta;
    }
}

