package PRIMEIRO_SEMESTRE.C08;

public class C08EX23_GiovannaPenido {
    public static void main(String[] args) {
        int termo1, termo2, termo3, termo4, cont = 0, soma = 0;
        System.out.println("Os palíndromos de 1000 a 1999 são: ");
        for (int aux = 1000; aux <= 9999; aux++) {
           termo1 = aux / 1000;
           termo2 = aux / 100 % 10;
           termo3 = aux % 100 / 10;
           termo4 = aux % 10;
           if (termo1 == termo4 && termo2 == termo3) {
               soma += aux;
               cont++;
           }
        }
        double media = (float) soma / cont;
        System.out.println("Média dos palíndromos pertencentes ao intervalo de 1000 a 9999 = "+media);
    }
}
