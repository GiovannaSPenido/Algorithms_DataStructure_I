package PRIMEIRO_SEMESTRE.C08;

import java.util.Scanner;
public class C08EX09_GiovannaPenido {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int idade = 0, contF = 0, contM = 0, somaF = 0, somaM = 0, rep;
        System.out.print("Informe o número de pessoas: ");
        rep = teclado.nextInt();
        teclado.nextLine();
        for(int aux = 1; aux <= rep; aux++) {
            System.out.print("Insira seu nome: ");
            String nome = teclado.nextLine();
            System.out.print("Insira sua idade: ");
            idade = teclado.nextInt();
            teclado.nextLine();
            System.out.print("Insira qual o seu sexo biológico: ");
            String sexo = teclado.nextLine();
            if(sexo.equalsIgnoreCase("F")||sexo.equalsIgnoreCase("Feminino") || sexo.equalsIgnoreCase("Mulher")) {
                contF++;
                somaF += idade;
            } else if(sexo.equalsIgnoreCase("M")||sexo.equalsIgnoreCase("Masculino") || sexo.equalsIgnoreCase("Homem")) {
                contM++;
                somaM += idade; }
            teclado.nextLine();
            }
        double mediaF = (float) somaF/contF;
        double mediaM = (float) somaM/contM;
        System.out.println("Média das idades dos homens = "+mediaM);
        System.out.println("Média das idades das mulheres = "+mediaF);
        teclado.close();
    }
}
