package PRIMEIRO_SEMESTRE.C09;

public class C09EX06_GiovannaPenido {
    public static void main(String[] args) {
        double num = 1, den = 2, serie = 0, conta = 0;
        for (int aux = 1; aux <= 20; aux++) {
            serie += num / Math.sqrt(den);
            num ++;
            den += 2;
        }
        conta = 10 + serie;
        System.out.println("Valor da série = "+conta);
    }
}
