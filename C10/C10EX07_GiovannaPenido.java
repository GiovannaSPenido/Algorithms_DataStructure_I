package PRIMEIRO_SEMESTRE.C10;

import java.util.Scanner;
public class C10EX07_GiovannaPenido {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double infectados = 1, infectadosDia;
        int contador = 0, populacao;
        System.out.print("Informe a população e descubra o tempo de infecção: ");
        populacao = console.nextInt();
        do {
            infectadosDia = infectados * 0.003;
            infectados += infectadosDia;
            contador++;
        } while (populacao >= infectados);
        int anos = contador / 356;
        int meses = contador % 365 / 30;
        int dias = contador - (anos * 365 + meses * 30);
        System.out.println("Anos = "+anos+" || Meses = "+meses+" || Dias = "+dias);
        console.close();
    }
}
