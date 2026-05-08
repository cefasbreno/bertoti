public class Instrumento {

    String nome;
    String afinacao;

    public Instrumento (String nome, String afinacao){
        this.nome = nome;
        this.afinacao = afinacao;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAfinacao() {
        return afinacao;
    }
    public void setAfinacao(String afinacao) {
        this.afinacao = afinacao;
    }
}
