package PRIMEIRO_SEMESTRE.C08;

import java.util.Scanner;
public class C08EX12_GiovannaPenido {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int codModelo, soma = 0, cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0;
        String modelo;
        double precoU1 = 0, precoU2 = 0, precoU3 = 0, precoU4 = 0, precoU5 = 0, faturamento1 = 0, faturamento2 = 0, faturamento3 = 0, faturamento4 = 0, faturamento5 = 0;
        for (int aux = 1; aux <= 1000; aux++) {
            System.out.print("Insira qual o código do modelo do equipamento: ");
            codModelo = teclado.nextInt();
            if (codModelo == 1) {
                modelo = "A2450";
                cont1++;
                precoU1 = 1565;
            } else if (codModelo == 2) {
                modelo = "B2356";
                cont2++;
                precoU2 = 1890;
            } else if (codModelo == 3) {
                modelo = "C3900";
                cont3++;
                precoU3 = 2150;
            } else if (codModelo == 4) {
                modelo = "D4100";
                cont4++;
                precoU4 = 2963;
            } else if (codModelo == 5) {
                modelo = "E6749";
                cont5++;
                precoU5 = 3750;
            } else {
                System.out.print("Insira um código válido."); }
            }
            teclado.nextLine();
        faturamento1 = precoU1 * cont1;
        faturamento2 = precoU2 * cont2;
        faturamento3 = precoU3 * cont3;
        faturamento4 = precoU4 * cont4;
        faturamento5 = precoU5 * cont5;
        double faturamentoTotal = faturamento1 + faturamento2 + faturamento3 + faturamento4 + faturamento5;
        System.out.println("Faturamento total = R$"+faturamentoTotal);
        teclado.close();
    }
}