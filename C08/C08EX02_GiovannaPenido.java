package PRIMEIRO_SEMESTRE.C08;

import java.util.Scanner;
public class C08EX02_GiovannaPenido {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota;
        for (int aux = 1; aux <= 50; aux++) {
            System.out.print("Insira a nota final do aluno: ");
            double notaFinal = teclado.nextDouble();
            if(notaFinal <= -1) {
                break;}
            System.out.print("Insira o número de faltas do aluno: ");
            double numFaltas = teclado.nextDouble();
            if(notaFinal >= 65 && numFaltas <= 16) {
                    System.out.println("-> ALUNO APROVADO");
                } else {
                    System.out.println("-> ALUNO REPROVADO");
                }
            }
        teclado.close();
        }
    }
