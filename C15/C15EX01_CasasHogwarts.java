package PRIMEIRO_SEMESTRE.C15;

public class C15EX01_CasasHogwarts {
   private String cor, emblema, qualidade, nome, pontos;

   // NOVO CONSTRUTOR
   public C15EX01_CasasHogwarts(String cor, String emblema, String qualidade, String nome, String pontos) {
       this.cor = cor;
       this.emblema = emblema;
       this.qualidade = qualidade;
       this.nome = nome;
       this.pontos = pontos;
   }
   // MÉTODOS SETTER E GETTER
   public String getCor() {
       return this.cor;
   }
   public void setCor(String cor) {
       this.cor = cor;
   }
   //
    public String getEmblema() {
        return this.emblema;
    }
    public void setEmblema(String emblema) {
        this.emblema = emblema;
    }
    //
    public String getQualidade() {
        return this.qualidade;
    }
    public void setQualidade(String qualidade) {
        this.qualidade = qualidade;
    }
    //
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    //
    public String getPontos() {
        return this.pontos;
    }
    public void setPontos(String pontos) {
        this.pontos = pontos;
    }
    //
    public void ImprimeCuriosidade() {
        System.out.println("Seus membros são conhecidos por seu/sua: "+this.qualidade);
        System.out.println("Pontuação na disputa pela Taça das Casas: "+this.pontos);
        System.out.println();
    }
    public void ImprimeCasa() {
        System.out.println();
        System.out.println("Casa: "+this.nome);
        System.out.println("Cores: "+this.cor);
        System.out.println("Mascote presente no emblema: "+this.emblema);
    }

    public static void main(String[] args) {
        C15EX01_CasasHogwarts c0 = new C15EX01_CasasHogwarts("Vermelho e dourado","Grifo","Coragem","Grifinória","75");
        C15EX01_CasasHogwarts c1 = new C15EX01_CasasHogwarts("Verde e prata","Serpente","Ambição","Sonserina","70");
        C15EX01_CasasHogwarts c2 = new C15EX01_CasasHogwarts("Amarelo e preto","Texugo","Lealdade","Lufa-Lufa","80");
        //
        c0.ImprimeCasa(); c0.ImprimeCuriosidade();
        c1.ImprimeCasa(); c1.ImprimeCuriosidade();
        c2.ImprimeCasa(); c2.ImprimeCuriosidade();
    }
}
