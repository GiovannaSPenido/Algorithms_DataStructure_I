package PRIMEIRO_SEMESTRE.C10;

import java.util.Scanner;
public class C10EX02_GiovannaPenido {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int cont1 = 0, cont2 = 0;
        double valor, soma = 0;
        System.out.println("Para interromper o programa digite 0!");
        do {
            System.out.print("Informe o valor recebido pelo serviço: R$");
            valor = console.nextDouble();
            if (valor != 0) {
                soma += valor;
                cont1++;
                if (valor >= 1000) {
                     cont2++;
                }
            }
        } while (valor != 0);
        double media = (float) soma / cont1;
        System.out.println("Valor total recebido = "+soma);
        System.out.println("Média dos valores recebidos = "+media);
        System.out.println("Quantidade de valores maiores que 1000 = "+cont2);
        console.close();
    }
}


