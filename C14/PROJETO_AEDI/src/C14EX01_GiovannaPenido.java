package PRIMEIRO_SEMESTRE.C14.PROJETO_AEDI.src;

import java.util.Scanner;

public class C14EX01_GiovannaPenido {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int opcao = 0;
        double conta = 0;
        while (opcao != 9) {
            System.out.println("Informe a opção desejada: \nOpção 1 -> Série 1\nOpção 2 -> Série 2\nOpção 3 -> Série 3\nOpção 4 -> Série 4\nOpção 5 -> Série 5\nOpção 9 -> SAIR");
            System.out.print(">>> ");
            opcao = console.nextInt();
            switch (opcao) {
                case 1:
                   SERIE_1.serie1(conta);
                    break;
                case 2:
                    SERIE_2.serie2(conta);
                    break;
                case 3:
                    SERIE_3.serie3(conta);
                    break;
                case 4:
                    SERIE_4.serie4(conta);
                    break;
                case 5:
                    SERIE_5.serie5(conta);
                    break;
                case 9:
                    break;
                default:
                    System.out.println("OPÇÃO INVÁLIDA");
                    break;
            }
            System.out.println();
        }
        console.close();
        System.out.println("FIM DO PROGRAMA");
    }

}


