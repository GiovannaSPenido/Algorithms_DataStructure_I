package PRIMEIRO_SEMESTRE.C08;

public class C08EX27_GiovannaPenido {
    public static void main(String[] args) {
        for (int aux3 = 1; aux3 <= 2; aux3++) {
            for (int aux1 = 0; aux1 <= 7; aux1++) {
                for (int aux2 = 1; aux2 <= Math.pow(2, aux1); aux2++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            for (int aux1 = 6; aux1 >= 0; aux1--) {
                for (int aux2 = 1; aux2 <= Math.pow(2, aux1); aux2++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
