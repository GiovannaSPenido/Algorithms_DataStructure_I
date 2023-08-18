package PRIMEIRO_SEMESTRE.C10;

import java.util.Scanner;

public class C10EX04_GiovannaPenido {
    public static void main(String[] args) {
        String nome;
        double quantidade, precoU, custoParcial, custoTotal = 0;
        Scanner console = new Scanner(System.in);
        System.out.println("Para interromper o programa digite FIM!");
        System.out.print("Informe o valor do BDI da empresa: ");
        double taxaBDI = console.nextDouble();
        System.out.println();
        console.nextLine();
        do {
            System.out.print("Informe o nome do produto: ");
            nome = console.nextLine();
            if (!nome.equalsIgnoreCase("FIM")) {
                System.out.print("Informa a quantidade vendida de "+nome+": ");
                quantidade = console.nextDouble();
                System.out.print("Informe o preço unitário do produto: ");
                precoU = console.nextDouble();
                custoParcial = quantidade * precoU;
                System.out.println("O custo parcial de "+nome+" é de R$"+custoParcial);
                custoTotal += custoParcial;
                console.nextLine();
                System.out.println();
            }
        } while (!nome.equalsIgnoreCase("FIM"));
        double bdi = (float) custoTotal * (taxaBDI / 100);
        double precoFinal = custoTotal + bdi;
        System.out.println("Custo Total = R$"+custoTotal);
        System.out.println("BDI = R$"+bdi);
        System.out.println("Preço final = R$"+precoFinal);
        console.close();
    }
}


