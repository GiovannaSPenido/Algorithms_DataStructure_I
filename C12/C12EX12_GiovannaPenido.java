package PRIMEIRO_SEMESTRE.C12;

import java.util.Scanner;
public class C12EX12_GiovannaPenido {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String vetNomes[] = new String[50];
        int vetNotas[] = new int[50], maiorNota = 0;
        for(int aux = 0; aux < vetNomes.length; aux++) {
            System.out.print("\nInforme o seu nome: ");
            vetNomes[aux] = console.nextLine();
            System.out.print("Informe a sua nota: ");
            vetNotas[aux] = console.nextInt();
            console.nextLine();
        }
        for(int aux = 0; aux < vetNomes.length; aux++) {
            if (maiorNota < vetNotas[aux]) {
                maiorNota = vetNotas[aux];
            }
        }
        System.out.println("\n|| ALUNOS COM A MAIOR NOTA ||");
        for(int aux = 0; aux < vetNomes.length; aux++) {
            if (maiorNota == vetNotas[aux]) {
                System.out.print("| "+vetNomes[aux]);
            }
        }
        console.close();
    }
}

