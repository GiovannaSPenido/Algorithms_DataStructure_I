package PRIMEIRO_SEMESTRE.C10;

import java.util.Scanner;
public class C10EX01_GiovannaPenido {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int cont = 0;
        double valor, multa, soma = 0;
        System.out.println("Para interromper o programa digite -1!");
        do {
            System.out.print("Informe o valor para descobrir a multa: R$");
            valor = console.nextDouble();
            if (valor != -1) {
                multa = valor * 0.1;
                System.out.println("Valor da Multa = R$"+multa);
                soma += multa;
                cont++;
            }
        } while (valor != -1);
        double media = (float) soma / cont;
        System.out.printf("Média das multas geradas = R$%.2f",media);
        console.close();
    }
}
