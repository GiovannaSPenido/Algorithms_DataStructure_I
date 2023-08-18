package PRIMEIRO_SEMESTRE.C13;

public class C13EX02_Metodo_GiovannaPenido {
    public static double fx(double valorX) {
        if (valorX < 4) {
            return (5 * valorX + 3) / (Math.sqrt(16 - Math.pow(valorX, 2)));
        } else if (valorX > 4) {
            return (5 * valorX + 3) / (Math.sqrt(Math.pow(valorX, 2) - 16));
        } else return 0;
    }
}

