package PRIMEIRO_SEMESTRE.C08;

public class C08EX17_GiovannaPenido {
    public static void main(String[] args) {
        double fx;
        for (int aux = 3; aux <= 12; aux++) {
            fx = Math.sqrt(Math.pow(aux,2) - 3);
            System.out.println("x = "+aux+" || f(x) = "+fx);
        }
    }
}
