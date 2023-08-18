package PRIMEIRO_SEMESTRE.C12;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class C12EX27_GiovannaPenido {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String endereco, cpf, resposta;
        List<String> listaCPF = new ArrayList<String>();
        List<String> listaEndereco = new ArrayList<String>();
        do {
            System.out.print("Digite seu CPF (0 para encerrar): ");
            cpf = console.nextLine();
            if (!cpf.equalsIgnoreCase("0")) {
                listaCPF.add(cpf);
                System.out.print("Digite seu endereço: ");
                endereco = console.nextLine();
                listaEndereco.add(endereco);
            }
        } while (!cpf.equalsIgnoreCase("0"));
        System.out.print("\nInforme um cpf para pesquisar na lista: ");
        cpf = console.nextLine();
        int pos = listaCPF.indexOf(cpf);
        if (pos == -1) {
            System.out.println("CPF não encontrado!");
            System.out.println("Gostaria de incluí-lo na lista (S/N)?");
            resposta = console.nextLine();
            listaCPF.add(cpf);
            System.out.print("\nDigite seu endereço: ");
            endereco = console.nextLine();
            listaEndereco.add(endereco);
        } else {
            System.out.println("CPF encontrado na posição " + (pos + 1) + "!");
            System.out.println("Gostaria de atualizar o endereço referente a esse CPF ou remove-lo da lista (A/R)?");
            resposta = console.nextLine();
            if (resposta.equalsIgnoreCase("R")) {
                listaCPF.remove(pos);
                        listaEndereco.remove(pos);
                    } else {
                        System.out.println("Informe o novo endereço: ");
                        endereco = console.nextLine();
                        listaEndereco.add(pos, endereco);
                    }
                }
                console.close();
        for (int aux=0; aux < listaCPF.size(); aux++) {
            System.out.println("\nCPF | " + listaCPF.get(aux));
            System.out.println("END | " + listaEndereco.get(aux));
        }
    }
}
