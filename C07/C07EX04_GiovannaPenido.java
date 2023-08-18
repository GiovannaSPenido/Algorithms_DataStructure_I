package PRIMEIRO_SEMESTRE.C07;

import java.util.Scanner;
public class C07EX04_GiovannaPenido {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe a equipe de futebol e descubra o estado que ela pertence: ");
        String nomeEquipe = teclado.nextLine();
        switch (nomeEquipe) {
            case "América", "Atlético", "Cruzeiro", "Villa Nova" -> System.out.println("Estado: Minas Gerais");
            case "Botafogo", "Flamengo", "Fluminense", "Vasco" -> System.out.println("Estado: Rio de Janeiro");
            case "Corinthias", "Palmeiras", "Santos", "São Paulo" -> System.out.println("Estado: São Paulo");
            case "Grêmio", "Internacional", "Juventude" -> System.out.println("Estado: Rio Grande do Sul");
            case "Náutico", "Santa Cruz", "Sport" -> System.out.println("Estado: Pernambuco");
        }
        teclado.close();
    }
}
