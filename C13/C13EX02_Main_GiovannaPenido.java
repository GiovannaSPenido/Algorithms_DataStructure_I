package PRIMEIRO_SEMESTRE.C13;

import java.util.Scanner;
public class C13EX02_Main_GiovannaPenido {
    public static double valorX;
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        do {
            if (valorX != -1) {
                System.out.print("Informe o valor de X: ");
                valorX = console.nextDouble();
                System.out.println("Resultado -> f(x) = " + C13EX02_Metodo_GiovannaPenido.fx(valorX));
            }
        } while (valorX != -1);
        console.close();
    }
}
