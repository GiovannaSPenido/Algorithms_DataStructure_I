package PRIMEIRO_SEMESTRE.C13;

import java.util.Scanner;

public class C13EX06_GiovannaPenido {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int contador = 0;
        String nomeFamilia, nomeCompleto;

        // entrada de dados 1
        System.out.print("Insira o nome de uma família: ");
        nomeFamilia = console.nextLine();

        // repetição pra 100 pessoas
        for(int i = 0; i < 100; i++) {

            // entrada de dados 2
            System.out.print("\nInforme o seu nome completo: ");
            nomeCompleto = console.nextLine();

            // separação da String e seleção do último índice
            String partesNome[] = nomeCompleto.split(" ");
            String ultimoNome = partesNome[partesNome.length - 1];

            // contador
            if(ultimoNome.equalsIgnoreCase(nomeFamilia)) {
                contador++;
            }
        }
        console.close();
        // saída de dados
        System.out.println("A quantidade de pessoas que pertencem á família "+nomeFamilia+" é de "+contador+" pessoas");
    }
}
