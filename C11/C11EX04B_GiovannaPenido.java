package PRIMEIRO_SEMESTRE.C11;

import java.util.Scanner;
public class C11EX04B_GiovannaPenido {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String nome, sexo, nomeMaior = "";
        int idade, pontosP, contC = 0, contM = 0, contF = 0, idadeMaior = 0;
        double multa, somaIdade = 0, somaMulta = 0;
        do {
            System.out.print("Insira seu nome: ");
            nome = console.nextLine();
            if (!nome.equalsIgnoreCase("X")) {

                System.out.print("Insira sua idade: ");
                idade = console.nextInt();
                console.nextLine();
                System.out.print("Insira o seu sexo biológico (M ou F): ");
                sexo = console.nextLine();
                System.out.print("Insira a quantidade de pontos perdidos na carteira: ");
                pontosP = console.nextInt();
                System.out.print("Insira o valor da multa: ");
                multa = console.nextDouble();
                System.out.println();
                console.nextLine();

                somaIdade += idade;
                contC++;
                somaMulta += multa;

                if (sexo.equalsIgnoreCase("M")) {
                    contM++;
                }
                if (sexo.equalsIgnoreCase("F") && pontosP == 7) {
                    contF++;
                }
                if (idade > idadeMaior) {
                    idadeMaior = idade;
                    nomeMaior = nome;
                }
            }
        } while (!nome.equalsIgnoreCase("X"));
        double media = (float) somaIdade / contC;
        double percentual = (float) (contM / contC) * 100;
        System.out.println("Idade média dos condutores = "+media);
        System.out.println("Valor total das multas aplicadas = R$"+somaMulta);
        System.out.printf("Percentual de homens multados = %.2f" , percentual);
        System.out.println("\nQuantidade de mulheres que perderam 7 pontos na carteira = "+contF);
        System.out.println("Nome e idade da pessoa mais velha = "+nomeMaior+", "+idadeMaior);
        console.close();
    }
}