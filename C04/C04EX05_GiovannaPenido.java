package PRIMEIRO_SEMESTRE.C04;

import javax.swing.JOptionPane;
import java.util.Scanner;
public class C04EX05_GiovannaPenido {
    public static void main(String[] args) {
        Scanner arquivo = new Scanner(
                C04EX05_GiovannaPenido.class.getResourceAsStream("FICHA_FUNCIONAL.txt"));
        String nome = arquivo.nextLine();
        String cpf = arquivo.nextLine();
        String rg = arquivo.nextLine();
        String tituloEleitor = arquivo.nextLine();
        String cartMotorista = arquivo.nextLine();
        String empresa = arquivo.nextLine();
        String salario = arquivo.nextLine();
        JOptionPane.showMessageDialog(null,
                "FICHA FUNCIONAL DE " + nome +"\n"+"CPF .......................................................... " + cpf + "\n" + "C.I. ............................................................ " + rg + "\n" + "Título de eleitor ..................................... " + tituloEleitor + "\n" + "Carteira de motorista .......................... " + cartMotorista + "\n" + "Empresa: " + empresa + "\n" + "Salário: " + salario,
                "FICHA FUNCIONAL",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
