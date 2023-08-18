package PRIMEIRO_SEMESTRE.C08;
public class C08EX26_GiovannaPenido {
    public static void main(String[] args) {
        for (int aux3 = 1; aux3 <= 10; aux3++) {
            for (int aux1 = 1; aux1 <= 10; aux1++) {
                for (int aux2 = 1; aux2 <= aux1; aux2++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println();
            }
            for (int aux1 = 10; aux1 >= 1; aux1--) {
                for (int aux2 = 1; aux2 <= aux1; aux2++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println();
            }
        }
    }
}

