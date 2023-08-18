package PRIMEIRO_SEMESTRE.C09;

public class C09EX11A_GiovannaPenido {
    public static void main(String[] args) {
        double num = 2, n1 = 0, serie = 0;
        for (int aux = 1; aux <= 100; aux++) {
            serie += num / Math.pow(4,n1) ;
            num += 8 ;
            n1 ++;
        }
        double conta = Math.cbrt(serie);
        System.out.println("Valor da série = "+conta);
    }
}
