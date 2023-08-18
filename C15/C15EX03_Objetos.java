package PRIMEIRO_SEMESTRE.C15;

public class C15EX03_Objetos extends C15EX02_Corvinal {
    public C15EX03_Objetos(String cor, String emblema, String qualidade, String nome, String pontos, String resposta, String charada) {
        super(cor, emblema, qualidade, nome, pontos, resposta, charada);
    }
    public static void main(String[] args) {
        C15EX03_Objetos o0 = new C15EX03_Objetos("Azul e bronze", "Corvo","Sabedoria","Corvinal","90", "Minerva: Para o não ser, ou seja, o todo.","Para onde vão os objetos desaparecidos?");
        C15EX03_Objetos o1 = new C15EX03_Objetos("Azul e bronze", "Corvo","Sabedoria","Corvinal","90", "Luna Lovegood: Acho que a resposta é que um círculo não tem princípio.", "O que veio primeiro, a fênix ou a chama?");
        C15EX03_Objetos o3 = new C15EX03_Objetos("Azul e bronze", "Corvo","Sabedoria","Corvinal","90","Giovanna: Sal", "Na água nasce, na água se nutre, mas ao ver a água desaparece. Quem ou o que?");
        System.out.println("Damos as boas vindas á todos os novos corvinos! Seguem algumas informações sobre a casa: ");
        o0.ImprimeCasa();
        o0.ImprimeCuriosidade();
        System.out.println("Em busca de promover costume, Hogwarts promove esse exemplar para os membros da Corvinal\nComo um(a) corvino(a), é notório que a entrada na sala comunal não é uma das mais fáceis tarefas.\nDito isso, seguem alguns exemplos de charadas já feitas pela aldrava e suas devidas respostas!");
        System.out.println();
        o0.ImprimeCharada();
        o1.ImprimeCharada();
        o3.ImprimeCharada();
        System.out.println("Espero que a exemplificação tenha trago clareza e maior tranquilidade.\nAté o jantar!");
    }
}
