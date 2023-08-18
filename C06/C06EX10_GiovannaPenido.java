package PRIMEIRO_SEMESTRE.C06;

import java.util.Scanner;
public class C06EX10_GiovannaPenido {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o capital aplicado: R$");
        double capital = teclado.nextDouble();
        System.out.print("Informe o número de dias que o capital está aplicado: ");
        int numDias =  teclado.nextInt();
        System.out.print("Informe a taxa diária (%): ");
        double taxaDiaria = teclado.nextDouble();
        double taxaAdm = 10;
        double rendimento = capital * numDias * (taxaDiaria / 100);
        double impostoRenda = 0.15 * rendimento;
        double valorResgate = capital + rendimento - impostoRenda - taxaAdm;
        System.out.printf("O valor a ser resgatado é: R$%.2f",valorResgate);
        teclado.close();
    }
}