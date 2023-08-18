package PRIMEIRO_SEMESTRE.C08;

import java.util.Scanner;
public class C08EX07_GiovannaPenido {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double media = 0;
        int idade = 0, cont1 = 0, cont2 = 0, soma = 0;
        for (int aux = 1; aux <= 5; aux++) {
            System.out.print("Informe seu nome: ");
            String nome = teclado.nextLine();
            System.out.print("Informe sua idade: ");
            idade = teclado.nextInt();
            if (idade <= 12) {
                cont1++;
            }
            if (idade > 30) {
                cont2++;
            }
            soma += idade;
            teclado.nextLine();
        }
        media = soma / 5.0;
        System.out.println("Alunos que tem até 12 anos = "+cont1+"\nAlunos que tem acima de 30 anos = "+cont2+"\nMédia das idades informadas = "+media);
        teclado.close();
    }
}
