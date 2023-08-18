package PRIMEIRO_SEMESTRE.C08;

import javax.swing.JOptionPane;
public class C08EX11_GiovannaPenido {
    public static void main(String[] args) {
        String[] botoes_sexo = {"M", "F"};
        String[] botoes_estadoCivil = {"C", "S", "O"};
        String[] botoes_corOlho = {"C", "A", "P", "O"};
        String[] botoes_corCabelo = {"C", "R", "P", "L"};
        String[] botoes_grauEscolaridade = {"1", "2", "3", "4"};
        int sexo, estadoCivil, corCabelo, corOlho, grauEscolaridade, cont1 = 0;
        double salarioMaior = 0, salarioMaiorH = 0, salarioMenorH = 0, diferenca;
        String nomeMaior = "";
        for (int aux = 1; aux <= 50; aux++) {
            JOptionPane.showMessageDialog(null,
                    "Seja bem-vindo(a) ao questionário! Por favor responda as perguntas seguintes com muita atenção!",
                    "QUESTIONÁRIO",
                    JOptionPane.INFORMATION_MESSAGE);
            String nome = JOptionPane.showInputDialog(null,
                    "Insira seu nome: ",
                    "QUESTIONÁRIO",
                    JOptionPane.QUESTION_MESSAGE);
            String idadeStr = JOptionPane.showInputDialog(null,
                    "Insira sua idade: ",
                    "QUESTIONÁRIO",
                    JOptionPane.QUESTION_MESSAGE);
            int idade = Integer.valueOf(idadeStr);
            sexo = JOptionPane.showOptionDialog(null,
                    "Qual o seu sexo biológico? Selecione M para Masculino e F para Feminino!",
                    "QUESTIONÁRIO",
                    JOptionPane.INFORMATION_MESSAGE,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    botoes_sexo,
                    "M");
            estadoCivil = JOptionPane.showOptionDialog(null,
                    "Qual o seu estado civil? Selecione C para Casado(a), S para Solteiro (a) e O para Outros!",
                    "QUESTIONÁRIO",
                    JOptionPane.INFORMATION_MESSAGE,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    botoes_estadoCivil,
                    "C");
            corOlho = JOptionPane.showOptionDialog(null,
                    "Qual a cor dos seus olhos? Selecione C para Castanhos, A para Azuis, P para Pretos e O para Outros!",
                    "QUESTIONÁRIO",
                    JOptionPane.INFORMATION_MESSAGE,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    botoes_corOlho,
                    "C");
            corCabelo = JOptionPane.showOptionDialog(null,
                    "Qual a cor do seu cabelo? Selecione C para Castanho, P para Preto, L para Loiro e R para Ruivo!",
                    "QUESTIONÁRIO",
                    JOptionPane.INFORMATION_MESSAGE,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    botoes_corCabelo,
                    "C");
            String salarioStr = JOptionPane.showInputDialog(null,
                    "Insira o seu salário: ",
                    "QUESTIONÁRIO",
                    JOptionPane.QUESTION_MESSAGE);
            double salario = Integer.valueOf(salarioStr);
            grauEscolaridade = JOptionPane.showOptionDialog(null,
                    "Qual o seu grau de escolaridade? Selecione 1 para Analfabetismo, 2 para Ensino Fundamental completo, 3 para Ensino Médio completo e 4 para Ensino Superior completo!",
                    "QUESTIONÁRIO",
                    JOptionPane.INFORMATION_MESSAGE,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    botoes_grauEscolaridade,
                    "1");
            if (aux == 1 || salario > salarioMaior) {
                salarioMaior = salario;
                nomeMaior = nome;
            }
            if (sexo == 1 && corCabelo == 3 && corOlho == 1 && idade > 18 && idade < 25 && estadoCivil == 1 && salario > 10000 && grauEscolaridade == 3) {
                cont1++;
            }
            if (sexo == 0) {
                if (aux == 1 || salario > salarioMaiorH) {
                    salarioMaiorH = salario;
                }
                if (aux == 1 || salario < salarioMenorH) {
                    salarioMenorH = salario;
                }
            }
        }
        diferenca = salarioMaiorH - salarioMenorH;
        JOptionPane.showMessageDialog(null,
                "Quantidade de mulheres loiras, de olhos azuis, com idade entre 18 e 25 anos, solteiras, salário maior que R$10.000,00 e curso superior completo = "+cont1+"\nNome da pessoa com maior salário: "+nomeMaior+"\nDiferença entre o maior e menor salário dos homens: "+diferenca,
                "QUESTIONÁRIO",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
