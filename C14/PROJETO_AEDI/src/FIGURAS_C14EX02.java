import java.util.Scanner;

public class FIGURAS_C14EX02 {
        static Scanner scanner = new Scanner(System.in);
        public static double quadrado(double area) {
                System.out.print("Informe o valor do lado do quadrado: ");
                double lado = scanner.nextDouble();
                area = Math.pow(lado,2);
                System.out.println("Àrea = "+area);
                return area;
        }

        public static double retangulo(double area) {
                System.out.print("Informe o comprimento do retângulo: ");
                double comprimento = scanner.nextDouble();
                System.out.print("Informe a largura do retângulo: ");
                double largura = scanner.nextDouble();
                area = comprimento * largura;
                System.out.println("Àrea = "+area);
                return area;
        }

        public static double triangulo_retangulo(double area) {
                System.out.print("Informe o valor da base do triângulo: ");
                double base = scanner.nextDouble();
                System.out.print("Informe o valor da altura do triângulo: ");
                double altura = scanner.nextDouble();
                area = (base * altura) / 2.0;
                System.out.println("Àrea = "+area);
                return area;
        }

        public static double circulo(double area) {
                System.out.print("Informe o raio do círculo: ");
                double raio = scanner.nextDouble();
                area = 3.1416 * Math.pow(raio,2);
                System.out.println("Àrea = "+area);
                return area;
        }
}
