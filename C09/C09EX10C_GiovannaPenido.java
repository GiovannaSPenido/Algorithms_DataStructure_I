package PRIMEIRO_SEMESTRE.C09;

public class C09EX10C_GiovannaPenido {
    public static void main(String[] args) {
        double num = 1, den = 2, serie = 0;
        for (int aux = 1; aux <= 100; aux++) {
            serie += num / den;
            num += 2;
            den += 2;
        }
        double conta = (1/3.0) * Math.pow(serie,2);
        System.out.println("Valor da série = "+conta);
    }
}

