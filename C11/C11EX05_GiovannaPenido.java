package PRIMEIRO_SEMESTRE.C11;

import java.util.Scanner;
public class C11EX05_GiovannaPenido {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Insira o seu nome (FIM para interromper): ");
        String nome = console.nextLine();
        int codigo, contI = 0, contT = 0;
        double mensalidade = 0, somaI = 0, somaF = 0, somaE = 0;
        while (!nome.equalsIgnoreCase("FIM")) {
        System.out.print("Insira o código da opção: ");
        codigo = console.nextInt();
        System.out.println();
        if (codigo == 1) {
            // INGLÊS
            mensalidade = 100;
            contI++;
            somaI += mensalidade;
        } else if (codigo == 2) {
            // FRANCÊS
            mensalidade = 150;
            somaF += mensalidade;
        } else if (codigo == 3) {
            // ESPANHOL
            mensalidade = 120;
            somaE += mensalidade;
        }
        contT++;
            System.out.println("Nome: "+nome+"\nValor da Mensalidade: "+mensalidade);
            System.out.println();
            console.nextLine();
            System.out.print("Insira o seu nome (FIM para interromper): ");
            nome = console.nextLine();
        }
        double media = (float) (somaE + somaF + somaI) / contT;
        System.out.println("A quantidade de alunos matriculados nas turmas de Inglês = "+contI);
        System.out.printf("A mensalidade média da escola = R$%.2f", media);
        System.out.println("\nO valor total das mensalidades por opção: "+"\nINGLÊS = R$"+somaI+"\nFRANCÊS = R$"+somaF+"\nESPANHOL = R$"+somaE);
        console.close();
    }
}
