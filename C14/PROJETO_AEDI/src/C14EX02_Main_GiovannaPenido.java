import java.util.Scanner;

public class C14EX02_Main_GiovannaPenido {
    public Scanner console = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int opcao = 0;
        double area = 0;
        while (opcao != 9) {
            System.out.println("Escolha a figura que quer calcular a área: \nOpção 1 -> Quadrado\nOpção 2 -> Retângulo\nOpção 3 -> Triângulo Retângulo\nOpção 4 -> Círculo\nOpção 9 -> SAIR");
            System.out.print(">>> ");
            opcao = console.nextInt();
            switch (opcao) {
                case 1 : FIGURAS_C14EX02.quadrado(area); break;
                case 2 : FIGURAS_C14EX02.retangulo(area); break;
                case 3 : FIGURAS_C14EX02.triangulo_retangulo(area); break;
                case 4 : FIGURAS_C14EX02.circulo(area); break;
                case 9 : break;
                default: System.out.println("OPÇÃO INVÁLIDA"); break;
            }
            System.out.println();
        }
        console.close();
        System.out.println("FIM DO PROGRAMA");
    }
}
