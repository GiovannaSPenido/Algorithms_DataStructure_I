package PRIMEIRO_SEMESTRE.C09;

public class C09EX12_GiovannaPenido {
    public static void main(String[] args) {
        double num, den, serie = 0;
        for (int aux = 1; aux <= 10000; aux++) {
            num = 1;
            den = (aux + 1 * (aux - 1));
            if (aux % 2 == 0){
                serie -= num / den;
            } else {
                serie += num / den;
            }
        }
        double conta = 4 * serie;
        System.out.println("Valor da série = "+conta);
    }
}


