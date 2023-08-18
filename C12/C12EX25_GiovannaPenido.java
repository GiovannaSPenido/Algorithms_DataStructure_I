package PRIMEIRO_SEMESTRE.C12;

import java.util.Scanner;

public class C12EX25_GiovannaPenido {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String vetNome[] = new String[20], nome, tempNome;
        int vetPont[] = new int[20], tempPont;

        // leitura dos dados
        for (int i = 0; i < vetNome.length; i++) {
            System.out.print("Insira o nome da equipe: ");
            vetNome[i] = console.nextLine();
            System.out.print("Insira a pontuação da equipe inserida: ");
            vetPont[i] = console.nextInt();
            System.out.println();
            console.nextLine();
        }

        // ordenação do contéudo do vetor de forma inversa
        for (int i = 0; i < vetPont.length-1; i++) {
            for (int g = 0; g < vetPont.length-1; g++) {
                if (vetPont[g] < vetPont[g + 1]) {
                    tempPont = vetPont[g];
                    vetPont[g] = vetPont[g + 1];
                    vetPont[g + 1] = tempPont;
                    tempNome = vetNome[g];
                    vetNome[g] = vetNome[g + 1];
                    vetNome[g + 1] = tempNome;
                }
            }
        }

        // pesquisa da posição
        int pos = -1;
        System.out.print("\nInsira o nome que gostaria de saber a pontuação no campeonato e sua respectiva classificação: ");
        nome = console.nextLine();
        for (int i = 0; i < vetNome.length; i++) {
            if (nome.equalsIgnoreCase(vetNome[i])) {
                pos = i;
                break;
            }
        }
        if (pos == -1) {
            System.out.println("Equipe não encontrada! Gostaria de tentar novamente (S/N)? ");
            String resp = console.nextLine();
            if (resp.equalsIgnoreCase("S")) {
                System.out.print("Insira o nome que gostaria de saber a pontuação no campeonato e sua respectiva classificação: ");
                nome = console.nextLine();
                console.close();
                for (int i = 0; i < vetNome.length; i++) {
                    if (nome.equalsIgnoreCase(vetNome[i])) {
                        pos = i;
                        break;
                    }
                }
                System.out.println("\nEquipe "+nome+" localizada na classificação "+(pos+1)+"!");
            }
        } else {
            System.out.println("\nEquipe "+nome+" localizada na classificação "+(pos+1)+"!");
        }
        if(pos >= 1 && pos <= 4) {
            System.out.println("\nEquipe classificada na Copa Libertadores!!!");
        } else if(pos >= 5 && pos <= 12) {
            System.out.println("\nEquipe classificada na Copa Sul-Americana!!!");
        } else System.out.println("\nEquipe classificada na Rebaixada!!!");
        console.close();
    }
}
