package PRIMEIRO_SEMESTRE.C08;

import java.util.Scanner;
public class C08EX06_GiovannaPenido {
    public static void main(String[] args) {
        int soma = 0, numero = 0, cont = 0;
        Scanner teclado = new Scanner(System.in);
        for (int aux = 1; aux <= 10; aux++) {
            System.out.print("Informe um número inteiro: ");
            numero = teclado.nextInt();
            if(numero % 2 == 0) {
                System.out.println("-> Número PAR");
            } else System.out.println("-> Número ÍMPAR");
            if(numero % 4 == 0) {
                soma += numero;
            }
            if(numero % 3 == 0) {
                cont++;
            }
            teclado.nextLine();
        }
        System.out.println("A soma dos números divisíveis por 4 = "+soma+"\nA quantidade de números divisíveis por 3 = "+cont);
        teclado.close();
    }
}
