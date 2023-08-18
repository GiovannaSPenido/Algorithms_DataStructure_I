package PRIMEIRO_SEMESTRE.C05;

import java.util.Scanner;
public class C05EX03_GiovannaPenido {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double liquido, salario, impostoRenda, reaisFixo;
        int numDependentes;
        System.out.print("Informe o salário: ");
        salario = teclado.nextDouble();
        System.out.print("Informe o número de dependentes: ");
        numDependentes = teclado.nextInt();
        reaisFixo = 60;
        liquido = salario - (numDependentes * reaisFixo);
        impostoRenda = liquido * 15/100;
        System.out.println("Líquido = "+liquido);
        System.out.println("Imposto de renda = "+impostoRenda);
    }
}
