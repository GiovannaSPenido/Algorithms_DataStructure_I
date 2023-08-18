package PRIMEIRO_SEMESTRE.C13;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class C13EX03_EXTRA_GiovannaPenido {
    static String nome, tempNome;
    static double salario, faixaSalarial = 0, aliquota, imposto = 0, tempIRPF;
    static int dependentes;
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        List<String> NOMES = new ArrayList<String>();
        List<Double> IRPF = new ArrayList<Double>();
        do {
            System.out.println("Olá, vamos calcular seu imposto de renda?!\n(Insira X para interromper a repetição!)");
            System.out.print("\nInsira seu nome: ");
            nome = console.nextLine();
            if(!nome.equalsIgnoreCase("x")) {
                NOMES.add(nome);
                System.out.print("Insira o valor do salário: R$");
                salario = console.nextDouble();
                System.out.print("Agora insira a quantidade de dependentes: ");
                dependentes = console.nextInt();
                console.nextLine();
                imposto = C13EX02_EXTRA_GiovannaPenido.calculoImposto(dependentes, salario);
                IRPF.add(imposto);
                System.out.println("Imposto = " + imposto);
                System.out.println();
            }
        } while (!nome.equalsIgnoreCase("x"));
        console.close();
        for(int aux=0; aux < NOMES.size()-1; aux++) {
            for(int x = 0; x < NOMES.size()-1; x++) {
                if (NOMES.get(x).compareToIgnoreCase(NOMES.get(x+1)) > 0) {
                    tempNome = NOMES.get(x);
                    NOMES.set(x, NOMES.get(x+1));
                    NOMES.set(x+1,tempNome);
                    tempIRPF = IRPF.get(x);
                    IRPF.set(x, IRPF.get(x+1));
                    IRPF.set(x+1,tempIRPF);
                }
            }
        }
        for(int aux = 0; aux < NOMES.size(); aux++) {
            System.out.println("N = "+NOMES.get(aux));
            System.out.println("I = "+IRPF.get(aux));
            System.out.println();
        }
    }
}
