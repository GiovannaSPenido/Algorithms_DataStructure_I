package PRIMEIRO_SEMESTRE.C12;

import java.util.Scanner;
public class C12EX13_GiovannaPenido {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String MESES[] = new String[12], temp;
        for(int aux = 0; aux < MESES.length; aux++) {
            System.out.print("Informe os meses do ano em ordem cronológica: ");
            MESES[aux] = console.nextLine();
        }
        System.out.println("|| Meses Impressos ||");
        for(int aux = 0; aux < MESES.length-1; aux++) {
            for(int x = 0; x < MESES.length-1; x++) {
                if(MESES[x].compareToIgnoreCase(MESES[x+1]) > 0) {
                    temp = MESES[x];
                    MESES[x] = MESES[x+1];
                    MESES[x+1] = temp;
                }
            }
        }
        for(int aux = 0; aux < MESES.length; aux++) {
            System.out.println(aux+") "+ MESES[aux]);
        }
        console.close();
    }
}