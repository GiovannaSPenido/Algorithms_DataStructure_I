package PRIMEIRO_SEMESTRE.C06;

import java.util.Scanner;
public class C06EX11_GiovannaPenido {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o nome da primeira equipe de vôlei: ");
        String equipe1 = teclado.nextLine();
        System.out.print("Informe o nome da segunda equipe de vôlei: ");
        String equipe2 = teclado.nextLine();
        System.out.print("Informe quantos sets, de 0 a 3, a primeira equipe informada venceu: ");
        int setEquipe1 = teclado.nextInt();
        System.out.print("Informe quantos sets, de 0 a 3, a segunda equipe informada venceu: ");
        int setEquipe2 = teclado.nextInt();
        if (setEquipe1 == 3 && setEquipe2 == 0) {
            System.out.println("A equipe " + equipe1 + " venceu com 3 pontos. Já a equipe perdedora " + equipe2 + " não recebeu nenhum ponto.");
        } else {
            if (setEquipe1 == 0 && setEquipe2 == 3) {
                System.out.println("A equipe " + equipe2 + " venceu com 3 pontos. Já a equipe perdedora " + equipe1 + " não recebeu nenhum ponto.");
            } else {
                if (setEquipe1 == 3 && setEquipe2 == 1) {
                    System.out.println("A equipe " + equipe1 + " venceu com 3 pontos. Já a equipe perdedora " + equipe2 + " não recebeu nenhum ponto.");
                } else {
                    if (setEquipe1 == 1 && setEquipe2 == 3) {
                        System.out.println("A equipe " + equipe2 + " venceu com 3 pontos. Já a equipe perdedora " + equipe1 + " não recebeu nenhum ponto.");
                    } else {
                        if (setEquipe1 == 3 && setEquipe2 == 2) {
                            System.out.println("A equipe " + equipe1 + " venceu com 2 pontos. Já a equipe perdedora " + equipe2 + " recebeu 1 ponto.");
                        } else {
                            if (setEquipe1 == 2 && setEquipe2 == 3) {
                                System.out.println("A equipe " + equipe2 + " venceu com 2 pontos. Já a equipe perdedora " + equipe1 + " recebeu 1 ponto.");
                            }
                        }
                    }
                }
            }
        }
        teclado.close();
    }
}
