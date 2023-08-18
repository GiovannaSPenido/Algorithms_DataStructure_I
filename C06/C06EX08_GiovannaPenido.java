package PRIMEIRO_SEMESTRE.C06;

import java.util.Scanner;
public class C06EX08_GiovannaPenido {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double pesoMinimo, pesoMaximo, altura;
        String nome;
        System.out.print("Insira o seu nome: ");
        nome = teclado.nextLine();
        System.out.print("Insira sua altura em metros: ");
        altura = teclado.nextDouble();
        pesoMinimo = (20 * Math.pow(altura,2));
        pesoMaximo = (25 * Math.pow(altura,2));
        System.out.println("O seu peso ideal está entre "+pesoMinimo+"(peso mínimo) e "+pesoMaximo+"(peso máximo)");
        teclado.close();
      }
    }
