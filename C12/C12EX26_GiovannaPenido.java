package PRIMEIRO_SEMESTRE.C12;

import java.util.Scanner;
public class C12EX26_GiovannaPenido {
        public static void main(String[] args) {
            Scanner console = new Scanner(System.in);
            System.out.print("Insira a frase que gostaria de separar: ");
            String nome = console.nextLine();
            console.close();
            String palavras[] = nome.split(" ");
            for (int aux=0; aux<palavras.length; aux++)
                System.out.println(palavras[aux]);
        }
    }


