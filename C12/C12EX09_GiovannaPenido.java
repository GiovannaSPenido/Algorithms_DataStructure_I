package PRIMEIRO_SEMESTRE.C12;

import java.util.Scanner;
public class C12EX09_GiovannaPenido {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double soma = 0;
        int vetNum[] = new int[10];
        for(int aux = 0; aux < vetNum.length; aux++) {
            System.out.print("Insira um número: ");
            vetNum[aux] = console.nextInt();
            soma += vetNum[aux];
        }
        System.out.println("\n|| NÚMEROS IMPRESSOS ||");
        for(int aux = 0; aux < 10; aux++) {
            if(soma % vetNum[aux] == 0) {
                System.out.print(vetNum[aux]+" ");
            }
        }
        console.close();
    }
}
