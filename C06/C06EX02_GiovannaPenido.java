package PRIMEIRO_SEMESTRE.C06;

import java.util.Scanner;
public class C06EX02_GiovannaPenido {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double quantidadePolu, valorMulta = 0f;
        System.out.print("Insira a quantidade de poluentes: ");
        quantidadePolu = teclado.nextDouble();
        if(quantidadePolu <= 1500) {
            valorMulta  = 0;
            System.out.println("Para essa quantia emitida há isenção de multa");
        } else {
            if(quantidadePolu > 1500 && quantidadePolu < 3500) {
                valorMulta = 3000;
                System.out.println("Para essa quantia emitida a multa é de R$"+valorMulta);
            } else {
                if(quantidadePolu > 3500) {
                    valorMulta = 5000 * quantidadePolu;
                    System.out.printf("Para essa quantia emitida a multa é de R$:%10.2f", valorMulta);
                }
            }
        }
        teclado.close();
    }
}
