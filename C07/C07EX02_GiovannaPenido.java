package PRIMEIRO_SEMESTRE.C07;

import java.util.Scanner;
public class C07EX02_GiovannaPenido {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Olá! Vamos calcular o seu conceito de aluno?" + "\nPrimeiramente, insira sua primeira nota: ");
        int nota1 = teclado.nextInt();
        System.out.print("Insira a sua segunda nota: ");
        int nota2 = teclado.nextInt();
        System.out.print("Insira a sua terceira nota: ");
        int nota3 = teclado.nextInt();
        int media = (nota1 + nota2 + nota3) / 3;
        switch (media) {
            case 1, 2, 3, 4 -> System.out.println(" -> Conceito E");
            case 5, 6 -> System.out.println(" -> Conceito D");
            case 7 -> System.out.println(" -> Conceito C");
            case 8 -> System.out.println(" -> Conceito B");
            case 9, 10 -> System.out.println(" -> Conceito A");
            }
            teclado.close();
    }
}