package PRIMEIRO_SEMESTRE.C14.PROJETO_AEDI.src;

import java.util.Scanner;

public class SERIE_1 {
    public Scanner console = new Scanner(System.in);
    public static double serie1(double conta) {
        double num = 2, den = 3, serie = 0;
        for (int aux = 1; aux <= 100; aux++) {
            serie += num / den;
            num += 2;
            den += 3;
        }
        conta = 1 + Math.sqrt(serie);
        System.out.println("Resultado " + conta);
        return conta;
    }
}
