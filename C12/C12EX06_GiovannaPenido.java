package PRIMEIRO_SEMESTRE.C12;

import java.util.Scanner;

public class C12EX06_GiovannaPenido {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String vet[] = new String[12];
        for(int aux = 0; aux < vet.length; aux++) {
            System.out.print("Informe o mês: ");
            vet[aux] = console.nextLine();
        }
        System.out.println("|| Meses Impressos ||");
        for(int aux = vet.length-1; aux >= 0; aux--) {
            System.out.print(vet[aux]+" ");
        }
        System.out.println();
        console.close();
    }
}