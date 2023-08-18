package PRIMEIRO_SEMESTRE.C12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C12EX28_GiovannaPenido {
    public static void main(String[] args) {
        String nome = "", ra;
        Scanner console = new Scanner(System.in);
        List<String> listaRA = new ArrayList<String>();
        List<String> listaNomes = new ArrayList<String>();

        // ENTRADA DE DADOS //
        for (int i = 0; i < 5; i++) {
            System.out.print("Insira o seu nome: ");
            nome = console.nextLine();
            listaNomes.add(nome);
            System.out.print("Insira o seu registro acadêmico: ");
            ra = console.nextLine();
            listaRA.add(ra);
            System.out.println();
        }

        // ORDENA EM ORDEM CRESCENTE DESCONSIDERANDO MAÍUSCULO-MINÚSCULO //
        listaNomes.sort(String.CASE_INSENSITIVE_ORDER);

        System.out.print("Insira um nome para consultar a posição e seu respectivo registro acadêmico: ");
        nome = console.nextLine();
        console.close();
        int pos = listaNomes.indexOf(nome);
        if (pos == -1) {
            System.out.println("Nome NÃO encontrado!!!");
        } else {
                System.out.println("Nome encontrado na posição " + (pos + 1) + "!\nDados gerados: \nALUNO(A) -> " + listaNomes.get(pos)+"\nREGISTRO ACADÊMICO -> "+listaRA.get(pos));
            }
        }
    }

