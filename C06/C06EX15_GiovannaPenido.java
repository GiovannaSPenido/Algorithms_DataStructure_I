package PRIMEIRO_SEMESTRE.C06;

import java.util.Scanner;
public class C06EX15_GiovannaPenido {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double valorFixo, ppp;
        System.out.print("Digite o código do seu pacote (1-2-3): ");
        byte pacote = teclado.nextByte();
        System.out.print("Insira a quantidade de dias de consumo dos canais de pay-per-view: ");
        int diasPPP = teclado.nextInt();
        System.out.print("Informe o valor dos serviços extras: ");
        double extras = teclado.nextDouble();
        teclado.nextLine();
        System.out.print("Insira a sua cidade: ");
        String cidade = teclado.nextLine();
        double imposto;

        if (cidade.equalsIgnoreCase("Belo Horizonte")) {
            imposto = 1;
        } else {
            if (cidade.equalsIgnoreCase("São Paulo")) {
                imposto = 0.01;
            } else {
                if (cidade.equalsIgnoreCase("Rio de Janeiro")) {
                    imposto = 0.015;
                } else {
                    imposto = 0.02;
                }
            }
        }
        if (pacote == 1) {
            if (diasPPP <= 54) {
                valorFixo = 65;
                ppp = 1.20;
                double diariasPPP = ppp * diasPPP;
                double contaI = (valorFixo + diariasPPP + extras) * imposto;
                double contaG = contaI + valorFixo + diariasPPP + extras;
                System.out.println("A conta do seu pacote Basic é de R$" + contaG);
            } else {
                if (diasPPP > 54) {
                    valorFixo = 65;
                    ppp = 65;
                    double conta = (valorFixo * imposto) + (ppp * imposto) + (extras * imposto);
                    System.out.println("A conta do seu pacote Basic é de R$" + conta);
                }
            }
        } else {
            if (pacote == 2) {
                valorFixo = 104;
                ppp = 2.10;
                double diariasPPP = ppp * diasPPP;
                double contaI = (valorFixo + diariasPPP + extras) * imposto;
                double contaG = contaI + valorFixo + diariasPPP + extras;
                System.out.printf("A conta do seu pacote Advanced é de R$"+contaG);
            } else {
                if (pacote == 3) {
                    valorFixo = 137;
                    ppp = 1;
                    double contaI = (valorFixo + extras) * imposto;
                    double contaG = contaI + valorFixo + extras;
                    System.out.println("A conta do seu pacote Premium é de R$" + contaG);
                }
            }
        }
        teclado.close();
    }
}