package PRIMEIRO_SEMESTRE.C05;

import java.util.Scanner;
public class C05EX05_GiovannaPenido {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double celsius;
        double kelvin;
        double fahrenheit;
        System.out.print("Informe o valor da temperatura em Celsius: ");
        celsius = teclado.nextDouble();
        kelvin = celsius + 273;
        fahrenheit = ((9 * celsius) + 160)/5;
        System.out.println("Kelvin = "+kelvin);
        System.out.println("Fahrenheit = "+fahrenheit);
        teclado.close();
    }
}