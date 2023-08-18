package PRIMEIRO_SEMESTRE.C08;

import java.util.Scanner;
public class C08EX31_GiovannaPenido {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cont1 = 0, cont2 = 0, cont3 = 0;
        double salarioMin = 0, salario, soma = 0, salarioMenor = 0;
        String nome, codCargo, cargo = "", nomeMenor = "", cargoMenor = "";
        System.out.print("Informe a quantidade de engenheiros = ");
        int numEng = teclado.nextInt();
        teclado.nextLine();
        for (int aux = 1; aux <= numEng; aux++) {
            System.out.print("Informe o seu nome: ");
            nome = teclado.nextLine();
            System.out.print("Informe o código do seu cargo: ");
            codCargo = teclado.nextLine();
            System.out.print("Informe o seu salário: ");
            salario = teclado.nextDouble();
            System.out.println();

            if (codCargo.equalsIgnoreCase("C")) {
                cargo = "Engenheiro Calculista";
                salarioMin = 2500;

            } else if (codCargo.equalsIgnoreCase("P")) {
                cargo = "Engenheiro Projetista";
                salarioMin = 4650;

            } else if (codCargo.equalsIgnoreCase("O")) {
                cargo = "Engenheiro de Obra";
                salarioMin = 3200;

            } else if (codCargo.equalsIgnoreCase("A")) {
                cargo = "Engenheiro Administrador";
                salarioMin = 5100;
                soma += salario;
                cont2++;

            } else if (codCargo.equalsIgnoreCase("X")) {
                cargo = "Outros";
                salarioMin = 0;
            }

            if (salario < salarioMin) {
                    System.out.println("ABAIXO DO SALÁRIO MÍNIMO");
                    System.out.println();
                } else if (codCargo.equalsIgnoreCase("X")) {
                } else {
                cont1++;
            }
            if (codCargo.equalsIgnoreCase("X") && salario > 5000) {
                cont3++;
            }
            if (aux == 1 || salario < salarioMenor) {
                salarioMenor = salario;
                nomeMenor = nome;
                cargoMenor = cargo;
            }
            teclado.nextLine();
        }
        double media = (float) soma / cont2;
        System.out.println("Quantidade de Engenheiros cujo salário está igual ou maior que o salário minimo referente ao seu cargo: "+cont1);
        System.out.printf("Média dos salários dos Engenheiros Administradores: %.2f ", media);
        System.out.println("Quantidade de engenheiros que recebem acima de R$5.000,00 e são do cargo Outros: "+cont3);
        System.out.println("Nome, cargo e salário do engenheiro de menor salário: "+nomeMenor+", "+cargoMenor+", R$"+salarioMenor);
        teclado.close();
    }
}
