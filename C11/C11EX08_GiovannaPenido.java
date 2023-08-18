package PRIMEIRO_SEMESTRE.C11;

import java.util.Scanner;
public class C11EX08_GiovannaPenido {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int contH = 0, cont1 = 0, cont2 = 0, cont3 = 0;
        String funcao, nomeMaior = "", funcaoMaior = "";
        double quantHoras, premio = 0, valorReceber, somaH = 0, somaP = 0, valorMaior = 0;
        System.out.print("Digite o valor da hora trabalhada no projeto: ");
        double valorHora = console.nextDouble();
        console.nextLine();
        System.out.print("Para finalizar o programa digite FIM!!\nInsira seu nome: ");
        String nome = console.nextLine();
        while (!nome.equalsIgnoreCase("FIM")) {
            System.out.print("Insira sua função na empresa: ");
            funcao = console.nextLine();
            System.out.print("Insira a quantidade de horas trabalhadas: ");
            quantHoras = console.nextDouble();
            somaH += quantHoras;
            if (quantHoras <= 100) {
                premio = 1000;
                cont1++;
            } else if (quantHoras > 100 && quantHoras <= 500) {
                premio = 10 * quantHoras;
                cont2++;
            } else if (quantHoras > 500) {
                premio = (quantHoras / 10.0) * 100;
                cont3++;
            }
            valorReceber = (valorHora * quantHoras) + premio;
            System.out.println();
            System.out.println("Nome: "+nome+"\nValor a receber = R$"+valorReceber);
            System.out.println();
            contH++;
            somaP += valorReceber;
            if (valorMaior < valorReceber) {
                valorMaior = valorReceber;
                nomeMaior = nome;
                funcaoMaior = funcao;
            }
            console.nextLine();
            System.out.print("Para finalizar o programa digite FIM!!\nInsira seu nome: ");
            nome = console.nextLine();
        }
        double media = (float) somaH / contH;
        System.out.printf("Média de horas trabalhadas por pessoa no projeto: %.2f",media);
        System.out.println("\nO nome e a função da pessoa que recebe o maior salário: "+nomeMaior+", "+funcaoMaior);
        System.out.println("A quantidade de pessoas por faixa do prêmio de produtividade >> \n"+"ATÉ 100: "+cont1+"\nENTRE 100 E 500: "+cont2+"\nACIMA DE 500: "+cont3);
        System.out.println("O valor total da folha de pagamento = R$"+somaP);
        console.close();
    }
}