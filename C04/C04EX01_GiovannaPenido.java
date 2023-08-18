package PRIMEIRO_SEMESTRE.C04;

import java.util.Scanner;
   public class C04EX01_GiovannaPenido {
       public static void main(String[] args) {
           Scanner teclado = new Scanner(System.in);
           String sobrenome;
           String primeiroNome;
           String segundoNome;
           byte idade;
           System.out.print("Informe seu sobrenome: ");
           sobrenome = teclado.nextLine();
           System.out.print("Informe seu primeiro nome: ");
           primeiroNome = teclado.nextLine();
           System.out.print("Informe seu segundo nome: ");
           segundoNome = teclado.nextLine();
           System.out.print("Informe sua idade: ");
           idade = teclado.nextByte();
           System.out.println();
           System.out.println(sobrenome+ ", " +primeiroNome+" " +segundoNome);
           System.out.println("Idade: "+idade);
           teclado.close();
       }
   }

