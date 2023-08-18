package PRIMEIRO_SEMESTRE.C05;

import java.util.Scanner;
public class C05EX12_GiovannaPenido {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        long tempo, horas, minutos, segundos;
        System.out.print("Insira o tempo em segundos: ");
        tempo = teclado.nextLong();
        segundos = tempo;
        minutos = tempo / 60;
        horas = minutos / 60;
        System.out.println("Horas = "+horas+"\nMinutos = "+minutos+"\nSegundos: "+segundos);
        teclado.close();
    }
}
