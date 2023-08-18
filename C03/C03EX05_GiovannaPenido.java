package PRIMEIRO_SEMESTRE.C03;

import java.util.Scanner;
public class C03EX05_GiovannaPenido {
//Função: Calcular a idade atual com base da subtração do ano de nascimento
//Autor: Giovanna Silva Penido
    public static void main(String[] args) {
        String nome;
        int anoNasc, anoAtual, idade;
        Scanner teclado = new Scanner(System.in);
            System.out.print("Digite seu nome:");
            nome = teclado.nextLine();
            System.out.print("Digite o ano em que você nasceu:");
            anoNasc = teclado.nextInt();
            System.out.print("Digite o ano em que estamos:");
            anoAtual = teclado.nextInt();
            idade = anoAtual - anoNasc;
            System.out.print(nome+", você tem/terá "+ idade +" anos em "+anoAtual);
            teclado.close();
           }
       }
