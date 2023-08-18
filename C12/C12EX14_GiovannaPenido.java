package PRIMEIRO_SEMESTRE.C12;

import java.util.Scanner;

public class C12EX14_GiovannaPenido {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String vetNomes[] = new String[10], vetEstados[] = new String[10];
        int vetPopulacao[] = new int[10], temp;
        for (int aux = 0; aux < vetNomes.length; aux++) {
            System.out.print("Informe o nome da cidade: ");
            vetNomes[aux] = console.nextLine();
            System.out.print("Informe o estado a qual pertence: ");
            vetEstados[aux] = console.nextLine();
            System.out.print("Informe a sua população: ");
            vetPopulacao[aux] = console.nextInt();
            console.nextLine();
        }
        console.close();
        for (int aux = 0; aux < vetPopulacao.length - 1; aux++) {
            for (int x = 0; x < vetPopulacao.length-1; x++) {
                if (vetPopulacao[x] > vetPopulacao[x + 1]) {
                    temp = vetPopulacao[x];
                    vetPopulacao[x] = vetPopulacao[x + 1];
                    vetPopulacao[x + 1] = temp;
                }
            }
        }
        for(int aux = 3; aux > 0; aux--) {
            System.out.println(aux+") "+ vetNomes[aux]+" - "+vetEstados[aux]);
        }
    }
}