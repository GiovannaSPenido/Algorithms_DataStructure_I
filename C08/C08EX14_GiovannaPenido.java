package PRIMEIRO_SEMESTRE.C08;

import java.util.Scanner;
public class C08EX14_GiovannaPenido {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um número de 1 a 20: ");
        int numero = teclado.nextInt();
        teclado.nextLine();
        System.out.print("Digite o símbolo a ser utilizado: ");
        String simbolo = teclado.nextLine();
        String linha = simbolo + " ";
        if(numero > 1 && numero <= 20) {
            for (int aux = 1; aux <= numero; aux++) {
                System.out.println();
                for (int aux1 = 1; aux1 <= numero; aux1++) {
                    System.out.print(linha);
                }
            }
        } else {
            System.out.println("Digite um número válido.");
        }
        teclado.close();
    }
}


