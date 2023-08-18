package PRIMEIRO_SEMESTRE.C06;

import java.util.Scanner;
public class C06EX03_GiovannaPenido {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double salario, valorFixo, valorComissao, totalMensal;
        System.out.print("Insira o total mensal vendido: ");
        totalMensal = teclado.nextDouble();
        valorFixo = 240;
        if(totalMensal <= 1000) {
            valorComissao  = 0;
            salario = valorFixo;
            System.out.println("Para esse total vendido não há comissão. Então o salário é de R$"+salario);
        } else {
            if(totalMensal > 1000 && totalMensal < 10000) {
                valorComissao = totalMensal * 10/100;
                salario = valorFixo + valorComissao;
                System.out.println("Para esse total vendido há comissão de : "+valorComissao+"\nEntão o salário é de R$"+salario);
            } else {
                if(totalMensal > 10000) {
                    valorComissao = 1000;
                    salario = valorFixo + valorComissao;
                    System.out.printf("Para esse total vendido há comissão de : "+valorComissao+"\nEntão o salário é de R$"+salario);
                }
                }
            }
        teclado.close();
        }
    }
