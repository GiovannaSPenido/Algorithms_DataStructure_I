package PRIMEIRO_SEMESTRE.C09;

public class C09EX10E_GiovannaPenido {
    public static void main(String[] args) {
        double num = 1, den = 6, serie = 0;
        for (int aux = 1; aux <= 100; aux++) {
            serie += num / den;
            num ++;
            den += 6;
        }
        System.out.println("Valor da série = "+serie);
    }
}

