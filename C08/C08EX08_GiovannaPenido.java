package PRIMEIRO_SEMESTRE.C08;

import java.util.Scanner;
public class C08EX08_GiovannaPenido {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cont1 = 0 , cont2= 0, cont3 = 0, soma = 0;
        double media = 0;
        for (int aux = 1; aux <= 3; aux++) {
            System.out.print("Insira a nota final do aluno: ");
            double notaFinal = teclado.nextDouble();
            if (notaFinal <= -1) {
                break;
            }
            System.out.print("Insira o número de faltas do aluno: ");
            double numFaltas = teclado.nextDouble();
            if (notaFinal >= 65 && numFaltas <= 16) {
                cont1++;
                soma += notaFinal;
            } else {
                cont2++;
            }
            if(numFaltas > 16) {
                cont3++;
            }
            teclado.nextLine();
        }
        media = (float) soma / cont1;
        System.out.println("Quantidade de alunos aprovados = "+cont1);
        System.out.println("Quantidade de alunos aprovados = "+cont2);
        System.out.println("Média das notas dos alunos aprovados = "+media);
        System.out.println("Número de alunos com mais de 16 faltas = "+cont3);
        teclado.close();
    }
}

