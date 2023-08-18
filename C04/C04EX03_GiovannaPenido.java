package PRIMEIRO_SEMESTRE.C04;

import java.util.Scanner;
public class C04EX03_GiovannaPenido {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String multa1, multa2, multa3, qntPoluentes1, qntPoluentes2;
        System.out.print("Insira uma primeira quantidade de poluentes: ");
        qntPoluentes1 = teclado.nextLine();
        System.out.print("Insira a multa para até " + qntPoluentes1 + ": R$ ");
        multa1 = teclado.nextLine();
        System.out.print("Insira uma segunda quantidade de poluentes: ");
        qntPoluentes2 = teclado.nextLine();
        System.out.print("Insira a multa para quantidades de poluentes pertencentes ao intervalo entre " + qntPoluentes1 + " e " + qntPoluentes2 + ": R$ ");
        multa2 = teclado.nextLine();
        System.out.print("Insira novamente a segunda quantidade de poluentes: ");
        qntPoluentes2 = teclado.nextLine();
        System.out.print("Insira o valor da multa para quantidades de poluentes acima de " + qntPoluentes2 + ": R$ ");
        multa3 = teclado.nextLine();
        System.out.println("_____________________________________________________________________");
        System.out.println("__________ Quantidade de Poluente Emitido X Valor da Multa __________");
        System.out.println("_____________________________________________________________________");
        System.out.println("Até " + qntPoluentes1 + " multa de R$" + multa1);
        System.out.println("_____________________________________________________________________");
        System.out.println("Entre " + qntPoluentes1 + " e " + qntPoluentes2 + " multa de R$" + multa2);
        System.out.println("_____________________________________________________________________");
        System.out.println("Acima de " + qntPoluentes2 + " multa de R$" + multa3);
        System.out.println("_____________________________________________________________________");
        teclado.close();
    }
}







