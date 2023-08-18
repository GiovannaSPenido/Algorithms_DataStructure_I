package PRIMEIRO_SEMESTRE.C12;

import java.util.Scanner;

public class C12EX10_GiovannaPenido {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String vetNomes[] = new String[8];
        int vetNotas[] = new int[50], contador = 0;
        double soma = 0;
        for(int aux = 0; aux < vetNomes.length; aux++) {
            System.out.print("\nInforme o seu nome: ");
            vetNomes[aux] = console.nextLine();
            System.out.print("Informe a sua nota: ");
            vetNotas[aux] = console.nextInt();
            console.nextLine();
            soma += vetNotas[aux];
            contador++;
        }
        double media = (float) soma / contador;
        System.out.println("\n|| ALUNOS COM NOTA ACIMA DA MÉDIA ||");
        for(int aux = 0; aux < vetNomes.length; aux++) {
            if(vetNotas[aux] > media) {
                System.out.print("|"+vetNomes[aux]+"|");
            }
        }
        console.close();
    }
}
