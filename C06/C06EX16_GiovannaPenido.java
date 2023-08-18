package PRIMEIRO_SEMESTRE.C06;

import java.util.Scanner;
public class C06EX16_GiovannaPenido {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double media = 0;
        int peso1 = 0, peso2 = 0;
        System.out.print("Insira quantas faltas você obteve: ");
        int faltas = teclado.nextInt();
        System.out.print("Insira a primeira nota de prova: ");
        double nota1 = teclado.nextDouble();
        System.out.print("Insira a segunda nota de prova: ");
        double nota2 = teclado.nextDouble();
        System.out.print("Insira a terceira nota de prova: ");
        double nota3 = teclado.nextDouble();
        System.out.print("Insira a sua idade: ");
        int idade = teclado.nextInt();
        System.out.print("Informe a nota do trabalho final: ");
        double notaTF = teclado.nextDouble();
        if (faltas >= 1 && faltas <= 5) {
            peso1 = 3;
        } else {
            if (faltas > 5 && faltas <= 10) {
                peso1 = 2;
            } else {
                if (faltas > 10) {
                    peso1 = 1;
                }
            }
        }
        if (nota1 > nota2 && nota3 > nota2) {
            double maioresNotas = nota1 + nota3;
            media = maioresNotas / 2;
        } else {
            if (nota1 > nota3 && nota2 > nota3) {
                double maioresNotas = nota1 + nota2;
                media = maioresNotas / 2;
            } else {
                if (nota1 > nota2 && nota3 > nota2) {
                    double maioresNotas = nota1 + nota3;
                    media = maioresNotas / 2;
                }
            }
        }
        if (idade <= 17) {
            peso2 = 1;
        } else {
            if (idade > 17 && idade <= 50) {
                peso2 = 2;
            } else {
                if (idade > 50) {
                    peso2 = 3;
                }
            }
            double conta1 = (media * peso1);
            double notaFinal = conta1 + (notaTF * peso2);
            if (notaFinal <= 50) {
                System.out.println("Resultado Final: Reprovado");
            } else {
                if (notaFinal > 50 && notaFinal <= 70) {
                    System.out.println("Resultado Final: Regular");
                } else {
                    if (notaFinal > 70 && notaFinal <= 80) {
                        System.out.println("Resultado Final: Bom");
                    } else {
                        if (notaFinal > 80 && notaFinal <= 90) {
                            System.out.println("Resultado Final: Muito Bom");
                        } else {
                            if (notaFinal > 90) {
                                System.out.println("Resultado Final: Excelente");
                            }
                        }
                    }
                }
            }
        }
        teclado.close();

    }
}
