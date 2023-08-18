package PRIMEIRO_SEMESTRE.C05;

import java.util.Scanner;
public class C05EX04_GiovannaPenido {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double distancia, ponto1, ponto2, x1, x2, y1, y2;
        System.out.print("Informe a coordenada x do ponto 1: ");
        x1 = teclado.nextDouble();
        System.out.print("Informe a coordenada y do ponto 1: ");
        y1 = teclado.nextDouble();
        System.out.print("Informe a coordenada x do ponto 2: ");
        x2 = teclado.nextDouble();
        System.out.print("Informe a coordenada y do ponto 2: ");
        y2 = teclado.nextDouble();
        ponto1 = ((Math.pow(x1-x2,2)));
        ponto2 = ((Math.pow(y1-y2,2)));
        distancia = Math.sqrt(ponto1+ponto2);
        System.out.println("A distância entre os pontos 1 e 2 é: "+distancia);
        teclado.close();
    }
}
