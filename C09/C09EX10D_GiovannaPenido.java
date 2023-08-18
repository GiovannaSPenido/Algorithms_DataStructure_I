package PRIMEIRO_SEMESTRE.C09;

public class C09EX10D_GiovannaPenido {
        public static void main(String[] args) {
            double num = 1, den = 1, serie = 0;
            for (int aux = 1; aux <= 100; aux++) {
                serie += num / Math.pow(den,2);
                num += 2;
                den ++ ;
            }
            System.out.println("Valor da série = "+serie);
        }
    }


