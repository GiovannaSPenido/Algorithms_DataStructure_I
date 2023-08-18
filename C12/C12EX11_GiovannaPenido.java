package PRIMEIRO_SEMESTRE.C12;

import java.util.Scanner;
public class C12EX11_GiovannaPenido {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String vetNomes[] = new String[50], maiorNome = "";
        int vetNotas[] = new int[50], maiorNota = 0;
        for(int aux = 0; aux < vetNomes.length; aux++) {
            System.out.print("\nInforme o seu nome: ");
            vetNomes[aux] = console.nextLine();
            System.out.print("Informe a sua nota: ");
            vetNotas[aux] = console.nextInt();
            console.nextLine();
            if(maiorNota < vetNotas[aux]) {
                maiorNota = vetNotas[aux];
                maiorNome = vetNomes[aux];
            }
        }
        System.out.println("\nALUNO COM A MAIOR NOTA -> "+maiorNome);
        console.close();
    }
}

