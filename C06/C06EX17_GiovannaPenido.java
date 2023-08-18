package PRIMEIRO_SEMESTRE.C06;

import java.util.Scanner;
public class C06EX17_GiovannaPenido {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Olá, vamos descobrir se você está apto ou não para exercer a função de programador na empresa? Responda as perguntas com V ou F!" + "\nVocê tem curso técnico de programação?" );
        String pergunta1 = teclado.nextLine();
        System.out.print("Você tem curso superior de programação?" );
        String pergunta2 = teclado.nextLine();
        System.out.print("Você tem menos de 3 anos de experiência em programação?" );
        String pergunta3 = teclado.nextLine();
        System.out.print("Você se considera uma pessoa criativa?" );
        String pergunta4 = teclado.nextLine();
        System.out.print("Você prefere liderar a ser liderado?" );
        String pergunta5 = teclado.nextLine();
        System.out.print("Você prefere trabalhar sozinho a trabalhar em equipe?" );
        String pergunta6 = teclado.nextLine();
        System.out.print("Você é autodidata (aprende sozinho)?" );
        String pergunta7 = teclado.nextLine();
        System.out.print("Você aceitaria uma remuneração inicial de R$1500?" );
        String pergunta8 = teclado.nextLine();
        System.out.print("Você só aceitaria trabalhar em escritórios da empresa dentro da grande BH?" );
        String pergunta9 = teclado.nextLine();
        int ganhoPts1 = 1, ganhoPts2 = 1, ganhoPts3 = 1, ganhoPts4 = 1, ganhoPts5 = 1, ganhoPts6 = 1, ganhoPts7 = 1, ganhoPts8 = 1;
        if (pergunta1.equalsIgnoreCase("F" ) && pergunta3.equalsIgnoreCase("V") || pergunta1.equalsIgnoreCase("V" ) && pergunta3.equalsIgnoreCase("V" )) {
            ganhoPts8 = - 1 ;
        } else {
            if (pergunta2.equalsIgnoreCase("F" ) && pergunta3.equalsIgnoreCase("V" ) || pergunta2.equalsIgnoreCase("F" ) && pergunta3.equalsIgnoreCase("F" )) {
                ganhoPts1 = - 1;
            }
        }
            if (pergunta4.equalsIgnoreCase("F" )) {
                ganhoPts2 = - 1;
            }
            if (pergunta5.equalsIgnoreCase("F" ) && pergunta8.equalsIgnoreCase("F" )) {
                ganhoPts4 = - 1;
            }
            if (pergunta6.equalsIgnoreCase("V" )) {
                ganhoPts5 = - 1;
            }
            if (pergunta7.equalsIgnoreCase("F" )) {
                ganhoPts6 = - 1;
            }
            if (pergunta9.equalsIgnoreCase("V" )) {
                ganhoPts7 = - 1;
            }
        int ganhoTotal = ganhoPts1 + ganhoPts2 + ganhoPts3 + ganhoPts4 + ganhoPts5 + ganhoPts6 + ganhoPts7 + ganhoPts8;
        if (ganhoTotal == 8) {
                System.out.println("Parabéns, você está apto(a) para exercer a função de programador na empresa!" );
            } else {
                System.out.println("Infelizmente, você não está apto(a) para exercer a função de programador na empresa." );
            }
            teclado.close();
        }
    }

