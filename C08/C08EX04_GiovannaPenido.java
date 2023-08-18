package PRIMEIRO_SEMESTRE.C08;

import java.util.Scanner;
public class C08EX04_GiovannaPenido {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int idade = 0;
        String nome;
        int cont1 = 0, cont2 = 0;
        for (int aux = 1; aux <= 5; aux++) {
            System.out.print("Insira o seu nome: ");
            nome = teclado.nextLine();
            System.out.print("Insira a sua idade: ");
            idade = teclado.nextInt();
            if (idade <= 18) {
                cont1++;
            } else {
                cont2++;
            }
            teclado.nextLine();
        }
        System.out.println("Quantidade de alunos que tem até 18 anos = "+cont1);
        System.out.println("Quantidade de alunos que tem mais de 18 anos = "+cont2);
        teclado.close();
    }
}