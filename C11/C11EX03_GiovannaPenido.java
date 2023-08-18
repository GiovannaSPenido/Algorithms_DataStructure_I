package PRIMEIRO_SEMESTRE.C11;

import java.util.Scanner;
public class C11EX03_GiovannaPenido {
    public static void main(String[] args) {
        Scanner dados = new Scanner(C11EX03_GiovannaPenido.class.getResourceAsStream("c11ex03.txt"));
        String placaV;
        int diaMulta, pontos, cont = 0;
        double multa, soma = 0;
        while (dados.hasNextLine()) {
            diaMulta = dados.nextInt();
            dados.nextLine();
            if (diaMulta == 99) break;
            placaV = dados.nextLine();
            pontos = dados.nextInt();
            switch (pontos) {
                case 3 -> multa = 42;
                case 5 -> multa = 108;
                case 8 -> multa = 479;
                default -> {
                    continue;
                }
            }
            System.out.println("PLACA: "+placaV+"\nMULTA = R$"+multa);
            System.out.println();
            if (dados.hasNextLine()) {
                dados.nextLine();
            }
            if (pontos == 8 && diaMulta <= 15) {
                cont++;
            }
            soma += multa;
        }
        System.out.println("A quantidade de multas de pontuação 8 da primeira quinzena do mês = "+cont);
        System.out.println("O valor total arrecadado com as multas = R$ "+soma);
        dados.close();
        }
    }

