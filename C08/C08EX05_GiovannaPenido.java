package PRIMEIRO_SEMESTRE.C08;

import java.util.Scanner;
public class C08EX05_GiovannaPenido {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cont1 = 0, cont2 = 0, cont3 = 0;
        for (int aux = 1; aux <= 100; aux++) {
            System.out.print("Insira a codificação do seu candidato: ");
            int codCandidato = teclado.nextInt();
            if (codCandidato == 1) {
                cont1++;
            } else if (codCandidato == 2) {
                cont2++;
            } else if (codCandidato == 3) {
                cont3++;
            } else {
                break;
            }
            teclado.nextLine();
        }
        if (cont1 > cont2 && cont1 > cont3) {
            System.out.println("Fulano venceu a eleição!");
        } else if (cont2 > cont3 && cont2 > cont1) {
            System.out.println("Ciclano venceu a eleição!");
        } else if (cont3 > cont2 && cont3 > cont1) {
            System.out.println("Beltrano venceu a eleição!");
        } else {
            System.out.println("Há necessidade da realização de uma nova votação."); }
        System.out.println("Fulano = " + cont1 + " votos" + "\nCiclano = " + cont2 + " votos" + "\nBeltrano = " + cont3 + " votos");
        teclado.close();
    }
}
