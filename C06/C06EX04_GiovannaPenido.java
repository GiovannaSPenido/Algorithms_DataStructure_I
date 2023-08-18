package PRIMEIRO_SEMESTRE.C06;

import java.util.Scanner;
public class C06EX04_GiovannaPenido {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double altura, peso, imc;
        String nome;
        System.out.print("Olá, vamos calcular o seu IMC?"+"\nPrimeiro informe o seu nome: ");
        nome = teclado.nextLine();
        System.out.print("Informe a sua altura em metros: ");
        altura = teclado.nextDouble();
        System.out.print("Informe o seu peso em kilos: ");
        peso = teclado.nextDouble();
        imc = (peso) / Math.pow(altura,2);
        if(imc < 18) {
            System.out.println("Você está desnutrida!");
        } else {
            if(imc < 20){
                System.out.println("Você está abaixo do peso!");
            } else {
                if(imc > 20 && imc < 25){
                    System.out.println("Você está no peso ideal!");
                } else {
                    if(imc > 25 && imc < 27){
                        System.out.println("Você está acima do peso!");
                    } else {
                        if(imc > 27){
                            System.out.println("Você está obeso!");
                        }
                    }
                }
            }
        }
        teclado.close();
    }
}