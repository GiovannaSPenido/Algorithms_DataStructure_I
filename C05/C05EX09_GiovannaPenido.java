package PRIMEIRO_SEMESTRE.C05;

import java.util.Scanner;
public class C05EX09_GiovannaPenido {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota1, nota2, nota3, mediaPonderada, multi1, multi2, multi3;
        System.out.print("Insira a nota do primeiro aluno: ");
        nota1 = teclado.nextDouble();
        System.out.print("Insira a nota do segundo aluno: ");
        nota2 = teclado.nextDouble();
        System.out.print("Insira a nota do terceiro aluno: ");
        nota3 = teclado.nextDouble();
        multi1 = nota1 * 2;
        multi2 = nota2 * 3;
        multi3 = nota3 * 5;
        mediaPonderada = (multi1+multi2+multi3)/ (2+3+5);
        System.out.println("Média ponderada = "+mediaPonderada);
        teclado.close();
    }
}