package PRIMEIRO_SEMESTRE.C09;

public class C09EX11E_GiovannaPenido {
    public static void main(String[] args) {
        double n1 = 0, n2 = 3, n3 = 1, n4 = 0, serie = 0;
        for (int aux = 1; aux <= 100; aux++) {
            serie += Math.pow(n1,2) * Math.sqrt(n2)/ Math.pow(n3,n4);
            n1 ++;
            n2 += 2;
            n3 ++;
            n4 ++;
        }
        double conta = (2 / 3.0) * serie;
        System.out.println("Valor da série = "+conta);
    }
}

