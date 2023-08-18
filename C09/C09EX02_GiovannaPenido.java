package PRIMEIRO_SEMESTRE.C09;

public class C09EX02_GiovannaPenido {
    public static void main(String[] args) {
        double serie = 0, soma, den;
        for (int aux = 1; aux <= 100; aux++) {
            den = Math.pow(aux,2) + (aux - 1);
            soma = (float) aux / den;
            serie += soma;
        }
        System.out.println("Valor da série = "+serie);
    }
}
