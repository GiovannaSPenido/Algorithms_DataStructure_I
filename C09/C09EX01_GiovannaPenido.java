package PRIMEIRO_SEMESTRE.C09;

public class C09EX01_GiovannaPenido {
    public static void main(String[] args) {
        double serie, soma = 0, den;
        for (int aux = 1; aux <= 38; aux++) {
            den = aux;
            serie = (float) (39 - aux) * (38 - aux) / den;
            soma += serie;
        }
        System.out.println("Valor da série: "+soma);
    }
}
