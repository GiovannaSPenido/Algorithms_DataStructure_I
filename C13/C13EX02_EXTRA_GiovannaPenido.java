package PRIMEIRO_SEMESTRE.C13;

import java.util.Scanner;

public class C13EX02_EXTRA_GiovannaPenido {
    // DECLARAÇÃO DE VARIÁVEIS VÁLIDAS PARA TODAS AS CLASSES DO PROGRAMA
    static Scanner console = new Scanner(System.in);
    static double salario, aliquota, imposto;
    static int dependentes;

    // MAIN
    public static void main(String[] args) {
        //ENTRADA DE DADOS
        System.out.print("Olá, vamos calcular seu imposto de renda?!");
        System.out.print("\nInsira o valor do salário: R$");
        salario = console.nextDouble();
        System.out.print("Agora insira a quantidade de dependentes: ");
        dependentes = console.nextInt();
        console.close();
        // CHAMADA DO MÉTODO COM PARÂMETRO
        imposto = calculoImposto(dependentes,salario);
        System.out.println(" = R$"+imposto);
    }
    public static double calculoImposto(int dependentes, double salario) {
        double calculo, faixaSalarial = 0;
        faixaSalarial = salario - (dependentes * 150);
        if (faixaSalarial < 1000) {
            aliquota = 0;
        } else if (faixaSalarial > 1000 && faixaSalarial < 5000) {
            aliquota = 0.1;
        } else if (faixaSalarial > 5000 && faixaSalarial < 10000) {
            aliquota = 0.15;
        }  else {
            aliquota = 0.2;
        }
        calculo = aliquota * faixaSalarial;
        return calculo;
    }
}
