package PRIMEIRO_SEMESTRE.C15;

public class C15EX02_Corvinal extends C15EX01_CasasHogwarts {
    private String resposta, charada;
    public C15EX02_Corvinal(String cor, String emblema, String qualidade, String nome, String pontos, String resposta, String charada) {
       super(cor, emblema, qualidade, nome, pontos);
       this.resposta = resposta;
       this.charada = charada;
    }
    //
    public String getCharada() {
        return charada;
    }
    public void setCharada(String charada) {
        this.charada = charada;
    }
    //
    public String getResposta() {
        return resposta;
    }
    public void setResposta(String resposta) {
        this.resposta = resposta;
    }
    //
    public void ImprimeCharada() {
        System.out.println("Charada: "+this.charada);
        System.out.println(" -> "+this.resposta);
        System.out.println();
    }
}
