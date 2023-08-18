package PRIMEIRO_SEMESTRE.C09;

public class C09EX11B_GiovannaPenido {
    public static void main(String[] args) {
        double num = 1, den = 7, serie = 0;
        for (int aux = 1; aux <= 100; aux++) {
            serie += num / Math.sqrt(den);
            num += 3;
            den += 3 ;
        }
        double conta = (5 / 3.0) * serie;
        System.out.println("Valor da série = "+conta);
    }
}

