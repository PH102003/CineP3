

public class Bilhete {
    // instancie as classes que irei utilizar para extrair informações(protegido)
    private Usuario usuario = new Usuario();
    private Sala sala = new Sala();
    private Filme filme = new Filme();
    private Sessao sessao = new Sessao();


    // Construtor vazio - teste
    public Bilhete() {
    }

    // Construtor - informações da escolha do usuario
    public Bilhete(Usuario usuario, Sala sala, Filme filme, Sessao sessao) {
        this.usuario = usuario;
        this.sala = sala;
        this.filme = filme;
        this.sessao = sessao;
    }

    // GET E SET - vê e inserir informações:
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public Sessao getSessao() {
        return sessao;
    }

    public void setSessao(Sessao sessao) {
        this.sessao = sessao;
    }

    // Método valor
    public double valor() {
        double valorTotal = filme.getValor() + sala.getValor();
        return valorTotal;
    }
    

    // imprimir as informações na classe Main.java
    @Override
    public String toString() {
        return   usuario.getUser() +".  CPF:" + usuario.getCPF() +".  " + sessao.toString() + " ValorTotal: " + valor()+" $.";
    }
    }
