package PRIMEIRO_SEMESTRE.C13;

import java.util.Scanner;

public class C13EX04_GiovannaPenido {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int cont = 0;

        // uso do método Math. para gerar um número aleátorio entre 0 e 1
        double numero = Math.round(Math.random() * 100), palpite;

        System.out.print("O computador gerou um número aleatório entre 0 e 100, o seu desafio é descobrir!");

        // repetição com flag
        do {

            // entrada de dados
            System.out.print("\nQual o seu palpite?\n-> ");
            palpite = console.nextDouble();

            // condição if-else
            if(palpite > numero) {
                System.out.println("O palpite informado está acima do número gerado!");
                System.out.println();
            } else {
                System.out.println("O palpite informado está abaixo do número gerado!");
                System.out.println();
            }
            cont++;
            // (flag)
        } while (numero != palpite);

        // saída de dados
        System.out.println("Parabéns você encontrou o número "+numero+"!\nForam necessárias "+cont+" tentativas para descobrir!");
        console.close();
    }
}
