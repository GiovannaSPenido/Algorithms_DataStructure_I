package PRIMEIRO_SEMESTRE.C10;

import java.util.Scanner;
public class C10EX08_GiovannaPenido {
    public static void main(String[] args) {
        String cidade, cidadeMenor = "";
        double populacao, menorPopulacao = 1000000000, numEleitores, numMulheres, numHomens, somaP = 0, somaE = 0, somaH = 0, cont1 = 0, cont2 = 0;
        Scanner console = new Scanner(System.in);
        System.out.println("Para interromper o programa digite Zimbabue de Minas!");
        do {
            System.out.println();
            System.out.print("Insira o nome da cidade: ");
            cidade = console.nextLine();
            System.out.print("Insira a população de " + cidade + ": ");
            populacao = console.nextDouble();

            if (populacao < menorPopulacao) {
                menorPopulacao = populacao;
                cidadeMenor = cidade;
            }
            somaP += populacao;

            System.out.print("Insira o número de eleitores: ");
            numEleitores = console.nextDouble();
            somaE += numEleitores;

            System.out.print("Insira a quantidade de mulheres: ");
            numMulheres = console.nextDouble();

            System.out.print("Insira a quantidade de homens: ");
            numHomens = console.nextDouble();
            somaH += numHomens;
            cont1++;

            if (populacao != numMulheres + numHomens) {
                    System.out.println("A soma do número de homens e mulheres é diferente da população informada!");
                    System.out.println();
            }

            if (numMulheres > numHomens) {
                    cont2++;
            }

            console.nextLine();
        } while (!cidade.equalsIgnoreCase("Zimbabue de Minas"));
        double percentual = (somaE / somaP) * 100;
        double media = somaH / cont1;
        System.out.println();
        System.out.println("Pelo fato de Zimbabue de Minas ter sido digitada, o programa chegou ao FIM!");
        System.out.println("Total de cidades = "+cont1);
        System.out.println("População total = "+somaP);
        System.out.println("Percentual de eleitores = "+percentual+"%");
        System.out.println("Cidades com mais mulheres que homens = "+cont2);
        System.out.println("Média de homens = "+media);
        System.out.println("Cidade com menor população = "+ cidadeMenor);
        console.close();
    }
}

