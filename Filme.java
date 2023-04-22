public class Filme {

    // Atributos - informação do fime.

    public String nome;
    public int duracao;
    public String sinopse;
    public double valor;
     
    // Construtor vazio - para teste

    public Filme() {
    }

    // Construtor - adicionar um filme
    public Filme(String nome, int duracao, String sinopse, double valor) {
        this.nome = nome;
        this.duracao = duracao;
        this.sinopse = sinopse;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    // toString para imprimir as informações da classe na classe Main.java

    @Override
    public String toString() {
        return  nome + ", duracao=" + duracao + ", sinopse=" + sinopse;
    }
}