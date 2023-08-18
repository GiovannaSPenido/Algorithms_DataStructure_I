package PRIMEIRO_SEMESTRE.C11;
import java.util.Scanner;
public class C11EX13_GiovannaPenido {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double n1 = 1, n2 = 10, n3 = 2, den = 1, num = 1, n4 = 0, serie = 0;
        int aux = 0;
        System.out.print("Insira o número de termos que a série terá: ");
        int termos = console.nextInt();
        do {
            aux++;
            if (aux <= termos) {
                serie += num / den;
                n1 += 1;
                n2 += 9;
                n3 += 2;
                n4 += 1;
                num = (n1 * Math.pow(n2, n3));
                den = Math.pow(7, n4);
            }
        } while (aux <= termos);
        double conta = (float) 71 + Math.cbrt(serie);
        System.out.println("Valor da série = "+conta);
        console.close();
    }
}
