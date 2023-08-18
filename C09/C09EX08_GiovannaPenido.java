package PRIMEIRO_SEMESTRE.C09;

public class C09EX08_GiovannaPenido {
    public static void main(String[] args) {
        double n1 = 3, n2 = 5, den = 5, conta = 0, serie = 0;
        for (int aux = 1; aux <= 20; aux++) {
        serie += n1 * Math.sqrt(n2) / den;
        n1 += 2;
        n2 += 4;
        den *= 5;
        }
        conta = Math.pow(serie,2);
        System.out.println("Valor da série = "+conta);
    }
}

