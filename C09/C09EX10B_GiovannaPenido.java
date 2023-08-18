package PRIMEIRO_SEMESTRE.C09;

public class C09EX10B_GiovannaPenido {
    public static void main(String[] args) {
        double num = 2, den = 3, serie = 0;
        for (int aux = 1; aux <= 100; aux++) {
            serie += num / den;
            num += 2;
            den += 3;
        }
        double conta = 1 + Math.sqrt(serie);
        System.out.println("Valor da série = "+conta);
    }
}

