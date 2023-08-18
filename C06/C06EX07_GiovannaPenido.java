package PRIMEIRO_SEMESTRE.C06;

import java.util.Scanner;
public class C06EX07_GiovannaPenido {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double salario, valorFixo, percentSalario, plLiquido, plBruto, impostoRenda;
        System.out.print("Insira o salário do empregado: R$");
        salario = teclado.nextDouble();
        if (salario <= 300) {
            valorFixo = 500;
            percentSalario = salario * 0.70;
            plBruto = valorFixo + percentSalario;
            impostoRenda = plBruto * 0.25;
            plLiquido = plBruto - impostoRenda;
            System.out.println("O valor da participação nos lucros foi de R$" + plLiquido);
        } else {
            if (salario > 300 && salario < 1000) {
                valorFixo = 200;
                percentSalario = salario * 0.50;
                plBruto = valorFixo + percentSalario;
                impostoRenda = plBruto * 0.25;
                plLiquido = plBruto - impostoRenda;
                System.out.println("O valor da participação nos lucros foi de R$" + plLiquido);
            } else {
                if (salario > 1000) {
                    valorFixo = 0;
                    percentSalario = salario * 0.30;
                    plBruto = valorFixo + percentSalario;
                    impostoRenda = plBruto * 0.25;
                    plLiquido = plBruto - impostoRenda;
                    System.out.println("O valor da participação nos lucros foi de R$" + plLiquido);
                }
            }
        }
        teclado.close();
    }
}
