package PRIMEIRO_SEMESTRE.C08;

public class C08EX24_GiovannaPenido {
    public static void main(String[] args) {
        double serie, termo, soma = 0;
        for (int aux = 1;aux <= 99;aux+=2) {
            termo = Math.pow(2,aux);
            soma += termo;
        }
        serie = (1 / 3.0) * soma;
        System.out.println("SÉRIE = "+serie);
    }
}
