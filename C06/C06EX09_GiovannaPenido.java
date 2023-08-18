package PRIMEIRO_SEMESTRE.C06;

import java.util.Scanner;
public class C06EX09_GiovannaPenido {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String sexo;
        String feminino = "F", masculino = "M";
        double altura;
        System.out.print("Olá, vamos calcular seu peso ideal?" + "\nInsira a sua altura em metros: ");
        altura = teclado.nextDouble();
        teclado.nextLine();
        System.out.print("Qual o seu sexo? (Digite F para Feminino ou M para Masculino: ");
        sexo = teclado.nextLine();
        if (sexo.equalsIgnoreCase(feminino)) {
            double pesoIdeal = (62.1 * altura - 44.7);
            System.out.printf("O seu peso ideal é: %.3f  " , pesoIdeal);
        } else {
            if (sexo.equalsIgnoreCase(masculino)) {
                double pesoIdeal = (72.7 * altura - 58);
                System.out.printf("O seu peso ideal é: %.3f  " , pesoIdeal);
            } else {
                System.out.println("Reinicie o programa e digite F ou M");
            }
        }
        teclado.close();
    }
}
