package PRIMEIRO_SEMESTRE.C09;

public class C09EX11F_GiovannaPenido {
    public static void main(String[] args) {
        double n1 = 1, n2 = 4, den = 2, serie = 0;
        for (int aux = 1; aux <= 100; aux++) {
            serie += ((n1 * n2) / (Math.pow(den,2)));
            n1 += 2;
            n2 *= 2;
            den += 5;
            System.out.println(serie);
        }
        double conta = (float) 5 * (Math.sqrt(serie));
        System.out.println("Valor da série = "+conta);
    }
}


