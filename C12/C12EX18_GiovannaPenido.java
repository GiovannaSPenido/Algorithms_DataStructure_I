package PRIMEIRO_SEMESTRE.C12;

import java.util.Scanner;

public class C12EX18_GiovannaPenido {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String vetNomes[] = new String[10], nome;
        int pos = -1;
        for(int aux = 0; aux < vetNomes.length; aux++) {
            System.out.print("Insira o seu nome: ");
            vetNomes[aux] = console.nextLine();
        }
        System.out.print("Insira o nome que gostaria de saber a posição: ");
        nome = console.nextLine();
        console.close();
        for (int aux=0; aux < vetNomes.length; aux++) {
            if (nome.equalsIgnoreCase(vetNomes[aux])) {
                pos = aux;
                break;
            }
        }
            if (pos == -1) {
                System.out.print("Nome NÃO encontrado");
            } else {
                System.out.print("Nome encontrado!\nEstá na posição de número "+(pos+1)+"!");
        }
    }
}
