package PRIMEIRO_SEMESTRE.C08;

import java.util.Scanner;
public class C08EX10_GiovannaPenido {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int soma = 0, rep;
        String nome, nomeMaior = "";
        double precoU, quantidade, custosParcial, custoMaior = 0, media;
        System.out.print("Insira quantos insumos foram utilizados: ");
        rep = teclado.nextInt();
        teclado.nextLine();
        for (int aux = 1; aux <= rep; aux++) {
            System.out.print("Insira o nome do insumo: ");
            nome = teclado.nextLine();
            System.out.print("Insira o preço unitário de " + nome + ": ");
            precoU = teclado.nextDouble();
            System.out.print("Insira a quantidade utlizada de " + nome + ": ");
            quantidade = teclado.nextDouble();
            custosParcial = quantidade * precoU;
            soma += custosParcial;
            if (aux == 1 || custosParcial > custoMaior) {
                custoMaior = custosParcial;
                nomeMaior = nome;
            }
            teclado.nextLine();
        }
        media = (float) soma / rep;
        System.out.println("O custo total do projeto foi de R$"+soma+"\nA média dos custos parciais é de R$"+media+"\nO nome do insumo de maior custo parcial -> "+nomeMaior);
        teclado.close();
    }
}
