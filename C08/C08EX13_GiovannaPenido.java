package PRIMEIRO_SEMESTRE.C08;

import java.util.Scanner;
public class C08EX13_GiovannaPenido {
    public static void main(String[] args) {
        Scanner arquivo = new Scanner(C08EX13_GiovannaPenido.class.getResourceAsStream("c08ex13.txt"));
        String nomeCidade, populacaoStr, eleitoresStr, quantHomensStr, quantMulheresStr, nomeMenor = "";
        int cont1 = 0, cont2 = 0, populacaoMenor = 0;
        double percentual, conta = 0;

        for (int aux = 1; aux <= 5; aux++) {

            nomeCidade = arquivo.nextLine();
            populacaoStr = arquivo.nextLine();
            eleitoresStr = arquivo.nextLine();
            quantHomensStr = arquivo.nextLine();
            quantMulheresStr = arquivo.nextLine();

            int populacao = Integer.valueOf(populacaoStr);
            double eleitores = Double.valueOf(eleitoresStr);
            double quantHomens = Double.valueOf(quantHomensStr);
            double quantMulheres = Double.valueOf(quantMulheresStr);

            System.out.println("Cidade = "+nomeCidade);
            System.out.println("População = "+populacao);
            System.out.println("Eleitores = "+eleitores);
            System.out.println("Quantidade de Homens = "+quantHomens);
            System.out.println("Quantidade de Mulheres = "+quantMulheres);

            if(quantMulheres + quantHomens != populacao) {
                System.out.println("A soma de mulheres e homens difere da população!");
            }
            percentual = (eleitores * 100) / populacao;
            System.out.printf("O percentual da cidade é de: %.1f" , percentual);
            System.out.println();
            System.out.println();

            if(populacao > 1000000) {
                cont1++;
            }
            if(quantMulheres > quantHomens) {
                cont2++;
            }
            if(aux == 1 || populacao < populacaoMenor) {
                populacaoMenor = populacao;
                nomeMenor = nomeCidade;
            }
        }
        System.out.println("\n\nQuantidade total de cidades com mais de 1 milhão de habitantes = "+cont1);
        System.out.println("Quantidade total de cidades cuja população tem mais mulheres = "+cont2);
        System.out.println("Nome da cidade de menor população = "+nomeMenor);
        arquivo.close();
    }
}
