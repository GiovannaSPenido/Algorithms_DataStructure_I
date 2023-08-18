package PRIMEIRO_SEMESTRE.C08;

public class C08EX19_GiovannaPenido {
    public static void main(String[] args) {
        double pa, soma = 0;
        for (int aux = 0; aux <= 100; aux++) {
            pa = Math.pow(aux,2);
            soma += pa;
        }
        System.out.println("Soma dos termos da PA = "+soma);
    }
}
