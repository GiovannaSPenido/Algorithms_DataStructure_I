package PRIMEIRO_SEMESTRE.C05;

import java.util.Scanner;
public class C05EXTRA2_GiovannaPenido {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double tempRelativo, tempo, velocidade, velocidadeLuz, divisao;
        System.out.print("Insira o tempo em segundos: ");
        tempo = teclado.nextDouble();
        System.out.print("Insira a velocidade em m/s: ");
        velocidade = teclado.nextDouble();
        velocidadeLuz = 3 * Math.pow(10,8);
        divisao = Math.sqrt(1 - (Math.pow(velocidade,2) / Math.pow(velocidadeLuz,2)));
        tempRelativo = tempo * (1 / divisao);
        System.out.printf("Tempo Relativo:%10.4f" , tempRelativo);
        teclado.close();
    }
}
