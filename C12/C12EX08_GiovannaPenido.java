package PRIMEIRO_SEMESTRE.C12;

import java.util.Scanner;
public class C12EX08_GiovannaPenido {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int vetNum[] = new int[20];
        for(int aux = 0; aux < vetNum.length; aux++) {
            System.out.print("Insira um número: ");
            vetNum[aux] = console.nextInt();
        }
        System.out.println("\n|| NÚMEROS IMPRESSOS ||");
        for(int aux = 0; aux < 10; aux++) {
            System.out.print(vetNum[aux]+vetNum[aux+10]+" ");
        }
        console.close();
    }
}
