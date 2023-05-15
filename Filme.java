public class Filme {


    // Atributos - informação do fime.
    private Critica[] criticas;    
    public String nome;
    public int duracao;
    public String sinopse;
    public double valor;
    public int quantidade_criticos;
    public double [] notas;
       public double mediaNotas;




     
    // Construtor vazio - para teste


    public Filme() {
    }


    // Construtor - adicionar um filme
    public Filme(String nome, int duracao, String sinopse, double valor, int quantidade_criticos) {
        this.nome = nome;
        this.duracao = duracao;
        this.sinopse = sinopse;
        this.valor = valor;
        this.criticas = new Critica[100];
        this.quantidade_criticos = 0;
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
    public void adicionarNota(double nota) {
        notas[quantidade_criticos] = nota;
        quantidade_criticos++;
        mediaNotas = (mediaNotas * (quantidade_criticos - 1) + nota) / quantidade_criticos;
    }
   
    public void adicionarCritica(Critica critica) {
        criticas[quantidade_criticos] = critica;
        quantidade_criticos++;
    }
    // toString para imprimir as informações da classe na classe Main.java


    @Override
    public String toString() {
        return  nome + ", duracao=" + duracao + ", sinopse=" + sinopse;
    }
}
