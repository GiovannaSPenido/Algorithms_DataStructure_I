package PRIMEIRO_SEMESTRE.C10;

import java.util.Scanner;

public class C10EX05_GiovannaPenido {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String sexo;
        double altura, peso, soma = 0;
        int cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0;
        System.out.println("Para interromper a repetição, digite 0 para altura!");
        do {
            System.out.print("Insira a sua altura em metros: ");
            altura = console.nextDouble();
            if (altura != 0) {
                System.out.print("Insira o seu peso: ");
                peso = console.nextDouble();
                console.nextLine();
                System.out.print("Insira o seu sexo biológico (M ou F): ");
                sexo = console.nextLine();
                System.out.println();
                if (sexo.equalsIgnoreCase("F")) {
                    cont1++;
                    if ( peso < 60 ) {
                        cont3++;
                    }
                }
                if (sexo.equalsIgnoreCase("M")) {
                    soma += altura;
                    cont2++;
                }
                cont4++;
            }
        } while (altura != 0);
        System.out.println();
        System.out.println("A repetição foi interrompida!");
        System.out.println();
        double alturaMedia = soma / cont2;
        System.out.println("Total de pessoas pesquisadas = "+cont4);
        System.out.println("Quantidade de mulheres = "+cont1);
        System.out.println("Altura média entre os homens = "+alturaMedia);
        System.out.println("Quantidade de mulheres com peso inferior a 60 = "+cont3);
        console.close();
    }
}
