package PRIMEIRO_SEMESTRE.C09;

public class C09EX11D_GiovannaPenido {
    public static void main(String[] args) {
        double num = 0, n2 = -1, serie = 0;
        for (int aux = 1; aux <= 100; aux++) {
            serie += Math.pow(num,3)/ Math.pow(10,n2);
            n2 ++;
            num ++;
            System.out.println(Math.pow(10,n2));
        }
        System.out.println("Valor da série = "+ serie);
    }
}
