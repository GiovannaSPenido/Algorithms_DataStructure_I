package PRIMEIRO_SEMESTRE.C09;

public class C09EX10F_GiovannaPenido {
    public static void main(String[] args) {
        double num = 1, den = 2, serie = 0;
        for (int aux = 1; aux <= 100; aux++) {
            serie += Math.pow(num,2)/Math.pow(den,2);
            num ++ ;
            den += 2 ;
        }
        System.out.println("Valor da série = "+serie);
    }
}

