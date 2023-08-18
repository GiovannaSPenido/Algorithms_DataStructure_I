package PRIMEIRO_SEMESTRE.C11;

public class C11EX14_GiovannaPenido {
    public static void main(String[] args) {
        double num, den, soma = 1, serie = 0, pi;
        int cont = 0;
        do {
            num = 1;
            den = soma;
            if (cont % 2 == 0){
                serie += num / den;
            } else {
                serie -= num / den;
            }
            soma += 2;
            pi = 4 * serie;
            cont++;
            if (pi > 3.1416 && pi < 3.1417) {
                break;
            }
        } while (pi != 0);
        System.out.println("NÚMERO DE TERMOS = "+cont);
    }
}


