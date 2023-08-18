package PRIMEIRO_SEMESTRE.C08;

public class C08EX16_GiovannaPenido {
    public static void main(String[] args) {
        int soma = 0, cont1 = 0;
        for (int aux = 1000; aux <= 2000; aux++) {
            if (aux % 2 != 0) {
                soma += aux;
                cont1++;
            }
        }
        double media = (float) soma / cont1;
        System.out.println("A média dos números ímpares pertencentes ao intervalo de 1000 a 2000 é = "+media);
    }
}
