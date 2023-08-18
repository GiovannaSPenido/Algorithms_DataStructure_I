package PRIMEIRO_SEMESTRE.C06;

import java.util.Scanner;
public class C06EX12_GiovannaPenido {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double custoTotal, aluguelTotal, precoGalpao, precoCaixas;
        System.out.print("Informe a quantidade de bolas produzidas: ");
        int quantBolasProd = teclado.nextInt();
        System.out.print("Informe a quantidade de bolas com defeito produzidas: ");
        int quantBolasDef = teclado.nextInt();
        System.out.print("Informe o preço unitário de cada caixa de papelão: R$");
        double precoCaixa = teclado.nextDouble();
        System.out.print("Informe o aluguel mensal de um galpão: R$");
        double aluguelGalpao = teclado.nextDouble();
        System.out.print("Informe a quantidade de meses restantes até a copa: ");
        double mesesCopa = teclado.nextDouble();
        int quantBolas = quantBolasProd - quantBolasDef;
        int quantCaixas = quantBolas / 10;
        int quantGalpoes = quantCaixas / 850;
        if(quantBolas % 10 > 0 && quantGalpoes % 850 > 0) {
            quantCaixas++;
            quantGalpoes++;
        } else {
            if(quantBolas % 10 > 0 && quantGalpoes % 850 == 0) {
                quantCaixas++;
                quantGalpoes = quantCaixas / 850;
            } else {
                if(quantBolas % 10 == 0 && quantGalpoes % 850 > 0) {
                    quantGalpoes++;
                    quantCaixas = quantBolas / 10;
                }
                    }
                    }
        precoCaixas = precoCaixa * quantCaixas;
        precoGalpao = quantGalpoes * aluguelGalpao;
        custoTotal = (precoGalpao * mesesCopa) + precoCaixas;
        System.out.printf("O custo total foi de: %,2f",custoTotal);
        teclado.close();
                }
        }






