package PRIMEIRO_SEMESTRE.C08;

public class C08EX28_GiovannaPenido {
    public static void main(String[] args) {
        double numeroT, soma = 0;
        int contador = 0;
        System.out.print("Números triangulares entre 1 e 1000 -> ");
        for (int aux1 = 1; aux1 <= 1000; aux1++) {
            numeroT = aux1 * (aux1 + 1) * (aux1 + 2);
            if (numeroT < 1000) {
                System.out.printf(" | %.0f", numeroT);
                soma += numeroT;
                contador++;
            }
        }
        double media = (float) soma / contador;
        System.out.println("\nMédia = "+media);
    }
}
