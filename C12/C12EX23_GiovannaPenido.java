package PRIMEIRO_SEMESTRE.C12;

import java.util.Scanner;

public class C12EX23_GiovannaPenido {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String vetPlaca[] = new String[3], vetNome[] = new String[3], nome, placa = "";
        int pos = -1;
        for (int aux = 0; aux < vetPlaca.length; aux++) {
            System.out.print("Insira a placa do veículo: ");
            vetPlaca[aux] = console.nextLine();
            System.out.print("Insira o nome do dono do veículo: ");
            vetNome[aux] = console.nextLine();
        }
        System.out.print("Você gostaria de buscar o carro através do nome do dono ou da placa (N/P)? ");
        String resp = console.nextLine();
        if(resp.equalsIgnoreCase("N")) {
            System.out.print("\nInsira o nome que gostaria de procurar: ");
            nome = console.nextLine();
            for (int aux=0; aux < vetPlaca.length; aux++) {
                if (nome.equalsIgnoreCase(vetNome[aux])) {
                    pos = aux;
                    break;
                }
            }
        } else if (resp.equalsIgnoreCase("P")) {
            System.out.print("Insira a placa que gostaria de procurar: ");
            placa = console.nextLine();
            for (int aux=0; aux < vetPlaca.length; aux++) {
                if (placa.equalsIgnoreCase(vetPlaca[aux])) {
                    pos = aux;
                    break;
                }
            }
        }
        console.close();
        if (pos == -1) {
            System.out.println("Nome ou Placa não encontrados!");
        } else {
            System.out.println("Nome ou Placa encontrados na vaga "+(pos+1)+"!");
        }
    }
}