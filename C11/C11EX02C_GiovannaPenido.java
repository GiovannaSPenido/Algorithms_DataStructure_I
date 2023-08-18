package PRIMEIRO_SEMESTRE.C11;

import java.util.Scanner;
public class C11EX02C_GiovannaPenido {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String nome, nomeMenor = "";
        double valor, valorMenor = 1000000000, somaB = 0, volumeT = 0;
        int contB = 0, contP = 0, contO = 0;
        System.out.print("Informe o seu nome: ");
        nome = console.nextLine();
        while (!nome.equalsIgnoreCase("X")) {
            System.out.print("Informe o valor aplicado (X PRA FINALIZAR): ");
            valor = console.nextDouble();
            if (valor <= 1000) {
                System.out.println("Sua classificação é BRONZE!\n");
                contB++;
                somaB += valor;
            }
            if (1000 < valor && valor <= 5000) {
                System.out.println("Sua classificação é PRATA!\n");
                contP++;
            }
            if (valor > 5000) {
                System.out.println("Sua classificação é OURO!\n");
                contO++;
            }
            if (valor < valorMenor) {
                valorMenor = valor;
                nomeMenor = nome;
            }
            volumeT += valor;
            console.nextLine();
            System.out.print("Informe o seu nome: ");
            nome = console.nextLine();
        }
        double mediaB = (float) somaB / contB;
        System.out.println("Total de BRONZE: "+contB);
        System.out.println("Total de PRATA: "+contP);
        System.out.println("Total de OURO: "+contO);
        System.out.printf("\nMédia das aplicações dos clientes Bronze = R$ %.2f", mediaB);
        System.out.printf("\nVolume total das aplicações = R$ %.2f", volumeT);
        System.out.println("\nNome do aplicador de menor aplicação = "+nomeMenor);
        console.close();
    }
}
