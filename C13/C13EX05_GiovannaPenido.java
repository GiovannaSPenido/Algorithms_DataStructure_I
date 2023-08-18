package PRIMEIRO_SEMESTRE.C13;

import java.util.Scanner;

public class C13EX05_GiovannaPenido {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        // entrada de dados
        System.out.print("Informe um ângulo: ");
        double angulo = console.nextDouble();
        console.close();

        // transformação de graus em radianos
        double radianos = Math.toDegrees(angulo);

        // saída de dados usando métodos Math.
        System.out.println("Seno: "+Math.sin(angulo));
        System.out.println("Cosseno: "+Math.cos(angulo));
        System.out.println("Tangente: "+Math.tan(angulo));
        System.out.println("Arco Seno: " + (1 / Math.sin(angulo)));
        System.out.println("Arco Cosseno: " +(1 / Math.cos(angulo)));
        System.out.println("Arco Tangente: " + (1 / Math.tan(angulo)));
    }
}
