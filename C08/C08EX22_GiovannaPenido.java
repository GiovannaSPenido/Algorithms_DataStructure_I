package PRIMEIRO_SEMESTRE.C12;

import java.util.Scanner;
public class C08EX22_GiovannaPenido {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cont1 = 0;
        System.out.print("Olá, insira um número para descobrir se ele é primo ou não: ");
        int numero = teclado.nextInt();
        for (int aux = 1; aux <= numero; aux++) {
            if (numero % aux == 0) {
                cont1++;
            }
        }
        if (cont1 == 2) {
            System.out.println("Esse número possui apenas dois divisores, estes sendo 1 e ele mesmo, portanto é classificado como PRIMO!");
        } else System.out.println("Esse número possui mais de dois divisores, portanto não é classificado como PRIMO!");
        teclado.close();
    }
}
