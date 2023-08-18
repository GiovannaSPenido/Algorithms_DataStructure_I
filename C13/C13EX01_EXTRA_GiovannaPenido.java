package PRIMEIRO_SEMESTRE.C13;

import java.util.Scanner;

public class C13EX01_EXTRA_GiovannaPenido {
    public static Scanner console = new Scanner(System.in);
    static double salario, faixaSalarial = 0, aliquota, imposto;
    static int dependentes;
    public static void main(String[] args) {
        System.out.print("Olá, vamos calcular seu imposto de renda?!");
        System.out.print("\nInsira o valor do salário: R$");
        salario = console.nextDouble();
        System.out.print("Agora insira a quantidade de dependentes: ");
        dependentes = console.nextInt();
        console.close();
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
        imposto = aliquota * faixaSalarial;
        System.out.println(" = R$"+imposto);
    }
}
