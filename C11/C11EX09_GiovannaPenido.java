package PRIMEIRO_SEMESTRE.C11;
import java.util.Scanner;
public class C11EX09_GiovannaPenido {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String setor, maiorNome = "", menorNome = "";
        int registroF, dezena, codSetor, contG = 0, contO = 0, contP = 0, contA = 0, contA10 = 0, admissao, menorRegistro = 1000000, maiorRegistro = 0;
        System.out.print("Para finalizar o programa digite FIM!!\nInsira seu nome: ");
        String nome = console.nextLine();
        while (!nome.equalsIgnoreCase("FIM")) {
            System.out.print("Insira o seu registro funcional: ");
            registroF = console.nextInt();
            System.out.println();
            dezena = registroF / 10000;
            codSetor = registroF / 1000 % 10;
            if (dezena != 10 && dezena != 11 && dezena != 12 && dezena != 13 && dezena != 14 | codSetor > 4 | codSetor == 0 || registroF > 999999 | registroF < 100000) {
                System.out.println("REGISTRO INVÁLIDO!");
                System.out.println();
            } else {
                if (codSetor == 1) {
                    contG++;
                } else if (codSetor == 2) {
                    contA++;
                } else if (codSetor == 3) {
                    contP++;
                } else if (codSetor == 4) {
                    contO++;
                }
                if (dezena == 10 && codSetor == 2) {
                    contA10++;
                }
                if (menorRegistro > registroF) {
                    menorRegistro = registroF;
                    menorNome = nome;
                }
                if (maiorRegistro < registroF) {
                    maiorRegistro = registroF;
                    maiorNome = nome;
                }
            }
            console.nextLine();
            System.out.print("Para finalizar o programa digite FIM!!\nInsira seu nome: ");
            nome = console.nextLine();
        }
        if (contA > contG && contA > contO && contA > contP) {
            setor = "Administração";
        } else if (contG > contA && contG > contO && contG > contP) {
            setor = "Gerência";
        } else if (contP > contG && contP > contO && contP > contA) {
            setor = "Pesquisa";
        } else
            setor = "Obras";
        System.out.println();
        System.out.println("Funcionários por setor: \n" + "Gerência = " + contG + "\nAdministração = " + contA + "\nPesquisa = " + contP + "\nObras = " + contO);
        System.out.println("Entraram em 2010 na Administração = " + contA10);
        System.out.println("Setor que tem mais funcionários = "+setor);
        System.out.println("Funcionário mais antigo = "+menorNome+"\nFuncionário mais novo = "+maiorNome);
        console.close();
    }
}
