package PRIMEIRO_SEMESTRE.C12;

import java.util.Scanner;
public class C12EX19_GiovannaPenido {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int pos = -1, vetNumeros[] = new int[100], valor;
        for(int aux = 0; aux < vetNumeros.length; aux++) {
            System.out.print("Insira o seu nome: ");
            vetNumeros[aux] = console.nextInt();
        }
        System.out.print("Insira o número do primeiro bilhete sorteado: ");
        valor = console.nextInt();
        console.close();
        for (int aux=0; aux < vetNumeros.length; aux++) {
            if (valor == vetNumeros[aux]) {
                pos = aux;
                break;
            }
        }
        if (pos == -1) {
            System.out.print("Que pena! Você não foi sorteado!");
        } else {
        System.out.print("PARABÉNS!! O seu bilhete de número "+(pos+1)+" foi sorteado!");
        }
    }
}

