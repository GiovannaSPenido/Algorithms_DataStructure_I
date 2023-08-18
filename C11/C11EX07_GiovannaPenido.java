package PRIMEIRO_SEMESTRE.C11;

import java.util.Scanner;
public class C11EX07_GiovannaPenido {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int aux = 0, contador = 0;
        double temperatura, temperaturaMaior = 0, temperaturaMenor = 1000, somaT = 0;
        do {
            aux++;
            if (aux != 121) {
                System.out.print("Qual a temperatura de hoje (EM CELSIUS) ??");
                temperatura = console.nextDouble();
                System.out.println();
                somaT += temperatura;
                if (temperaturaMaior < temperatura) {
                    temperaturaMaior = temperatura;
                }
                if (temperaturaMenor > temperatura) {
                    temperaturaMenor = temperatura;
                }
                if (temperatura == temperaturaMaior) {
                    contador++;
                }
            }
        } while (aux != 121);
        double media = somaT / 121.0;
        System.out.println("A menor temperatura registrada = "+temperaturaMenor);
        System.out.println("A maior temperatura registrada = "+temperaturaMaior);
        System.out.println("A média das temperaturas registradas = "+media);
        System.out.println("A quantidade de dias que ocorreu a maior temperatura = "+contador);
        console.close();
    }
}
