package PRIMEIRO_SEMESTRE.C11;

import java.util.Scanner;
public class C11EX06_GiovannaPenido {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int casasT = 100, numCanal, cont1 = 0, cont2 = 0, cont3 = 0, pessoas;
        double soma4 =  0, soma7 = 0, soma12 = 0;
        System.out.print("Insira o número de casas no qual a informação deve ser ignorada: ");
        int casasI = console.nextInt();
        int casas = casasT - casasI;
        for (int aux = 1; aux <= casas; aux++) {
            System.out.print("Insira o número do canal: ");
            numCanal = console.nextInt();
            switch (numCanal) {
                case 4 -> cont1++;
                case 7 -> cont2++;
                case 12 -> cont3++;
            }
            System.out.print("Insira o total de pessoas assistindo ao canal nessa casa: ");
            pessoas = console.nextInt();
            System.out.println();
                switch (numCanal) {
                    case 4 -> soma4 += pessoas;
                    case 7 -> soma7 += pessoas;
                    case 12 -> soma12 += pessoas;
                }
            }
        double somaT = soma4 + soma7 + soma12;
        double media = (float) somaT / 3;
        double porcentAudiencia4 = (float) (cont1 * 100) / casas;
        double porcentAudiencia7 = (float) (cont2 * 100) / casas;
        double porcentAudiencia12 = (float)(cont3 * 100) / casas;
        System.out.println("A audiência total de cada canal pesquisado: \nCANAL 4 = "+soma4+"\nCANAL 7 = "+soma7+"\nCANAL 12 = "+soma12);
        System.out.println("A porcentagem de audiência para cada canal pesquisado: \nCANAL 4 = "+porcentAudiencia4+"\nCANAL 7 = "+porcentAudiencia7+"\nCANAL 12 = "+porcentAudiencia12);
        if (cont1 > cont2 && cont1 > cont3) {
            System.out.println("O canal 4 é o mais assistido!");
        } else if (cont2 > cont1 && cont2 > cont3) {
            System.out.println("O canal 7 é o mais assistido!");
        } else System.out.println("O canal 12 é o mais assistido!");
        System.out.println("A média de pessoas que estavam assistindo TV = "+media);
        console.close();
    }
}
