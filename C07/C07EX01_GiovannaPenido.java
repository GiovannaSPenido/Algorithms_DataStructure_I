package PRIMEIRO_SEMESTRE.C07;

import java.util.Scanner;
public class C07EX01_GiovannaPenido {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Olá! Vamos calcular o seu prêmio?" + "\nPrimeiramente, insira seu nome: ");
        String nome = teclado.nextLine();
        System.out.print("Agora informe quantos jogos você acertou: ");
        int numAcertos = teclado.nextInt();
        switch (numAcertos) {
            case 1, 2, 3, 4, 5 -> System.out.println("Você não ganhou nenhum prêmio!");
            case 6, 7, 8, 9, 10 -> System.out.println("Você ganhou outro cartão!");
            case 11 -> System.out.println("Você ganhou 100 reais!");
            case 12 -> System.out.println("Você ganhou 1.000 reais!");
            case 13 -> System.out.println("Você ganhou 50.000 reais!");
            default -> System.out.println("O número de acertos ultrapassou a quantidade de jogos. Reinicie o programa!");
        }
        teclado.close();
    }
}
