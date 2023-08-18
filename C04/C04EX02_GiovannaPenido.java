package PRIMEIRO_SEMESTRE.C04;

import java.util.Scanner;
public class C04EX02_GiovannaPenido {
        public static void main(String[] args) {
                String nome;
                String cpf;
                String rg;
                String tituloEleitor;
                String carteiraMotorista;
                String empresa;
                String salario;
                Scanner teclado = new Scanner(System.in);
                System.out.print("Informe seu nome: ");
                nome = teclado.nextLine();
                System.out.print("Informe seu CPF: ");
                cpf = teclado.nextLine();
                System.out.print("Informe o número da sua carteira de identidade: ");
                rg = teclado.nextLine();
                System.out.print("Informe o número do seu título de eleitor: ");
                tituloEleitor = teclado.nextLine();
                System.out.print("Informe o número da sua carteira de motorista : ");
                carteiraMotorista = teclado.nextLine();
                System.out.print("Informe qual a sua empresa: ");
                empresa = teclado.nextLine();
                System.out.print("Informe o seu salário: ");
                salario = teclado.nextLine();
                System.out.println("FICHA FUNCIONAL DE: " + nome);
                System.out.println();
                System.out.println("Documentos:");
                System.out.println("CPF ............................................. "+cpf);
                System.out.println("C.I. ............................................ "+rg);
                System.out.println("Título de eleitor ............................... "+tituloEleitor);
                System.out.println("Carteira de motorista ........................... "+carteiraMotorista);
                System.out.println();
                System.out.println("Empresa: "+empresa);
                System.out.println("Salário: R$"+salario);
        }
}
















