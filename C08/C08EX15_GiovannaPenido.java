package PRIMEIRO_SEMESTRE.C08;

import java.util.Scanner;
public class C08EX15_GiovannaPenido {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String cargoMaior = "", nomeMaior = "";
        int cont1 = 0, soma = 0;
        double salarioMaior = 0, salario;
        for(int aux = 1; aux <= 3 ; aux++) {
            System.out.print("Seja bem-vindo(a) ao questionário da empresa!"+"\nInsira o seu nome: ");
            String nome = teclado.nextLine();
            System.out.print("Insira a sua idade: ");
            int idade = teclado.nextInt();
            teclado.nextLine();
            System.out.print("Insira qual o seu cargo: ");
            String cargo = teclado.nextLine();
            System.out.print("Insira o seu salário: ");
            salario = teclado.nextDouble();
            System.out.println();
            if(salario > 10000 && idade > 50) {
                System.out.println("Parabéns você é classificado como funcionário sênior!");
                System.out.println();
            }
            if(idade <= 18) {
                soma += salario;
                cont1++;
            }
            if(aux == 1 || salarioMaior < salario) {
                salarioMaior = salario;
                nomeMaior = nome;
                cargoMaior = cargo;
            }
            teclado.nextLine();
        }
        double media = (float) soma / cont1;
        System.out.println("A média dos salários dos funcionários que tem até 18 anos de idade é = "+media);
        System.out.println("O(A) funcionário(a) "+nomeMaior+", que atualmente ocupa o cargo de "+cargoMaior+" possui o maior salário da empresa.");
        teclado.close();
    }
}
