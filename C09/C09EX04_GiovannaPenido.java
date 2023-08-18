package PRIMEIRO_SEMESTRE.C09;

import java.util.Scanner;
public class C09EX04_GiovannaPenido {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double num, den, serie = 0, soma = 0, r;
        System.out.print("Insira o número de termos que a série terá: ");
        int termos = console.nextInt();
        for (int aux = 1; aux <= termos; aux++) {
                num = (aux * 4 - 3) * (aux * 4 - 2);
                den = (aux * 4 - 1) * (aux * 4);
                soma += (float) num / den;
        }
        serie = Math.sqrt(soma);
        System.out.println(serie);
        console.close();
    }
}

