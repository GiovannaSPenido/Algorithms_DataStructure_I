package PRIMEIRO_SEMESTRE.C04;

import javax.swing.JOptionPane;
public class C04EX04_GiovannaPenido {
    public static void main(String[] args) {
        String primeiroNome = JOptionPane.showInputDialog(null,
                "Qual o seu primeiro nome?",
                "C03EX04",
               JOptionPane.QUESTION_MESSAGE);
        String segundoNome = JOptionPane.showInputDialog(null,
                "Qual o seu segundo nome?",
                "C03EX04",
                JOptionPane.QUESTION_MESSAGE);
        String sobrenome = JOptionPane.showInputDialog(null,
                "Qual o seu sobrenome?",
                "C03EX04",
                JOptionPane.QUESTION_MESSAGE);
        String idadeStr = JOptionPane.showInputDialog(null,
                "Quantos anos você tem??",
                "C03EX04",
                JOptionPane.QUESTION_MESSAGE);
        int idade = Integer.valueOf(idadeStr);
        JOptionPane.showMessageDialog(null,
                sobrenome+", "+primeiroNome+" "+segundoNome+"\n"+idadeStr,
                "CO4EX04",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
