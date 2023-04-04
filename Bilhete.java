

public class Bilhete {
    private String CPF;
    private Sala sala;
    private Sessao sessao;
    private Filme filme;
    private double valor;
    public Bilhete(String CPF, Sala sala, Sessao sessao, Filme filme, double valor) {
        this.CPF = CPF;
        this.sala = sala;
        this.sessao = sessao;
        this.filme = filme;
        this.valor = valor;
        
    }
    
    public String getCPF() {
        return CPF;
    }
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    public Sala getSala() {
        return sala;
    }
    public void setSala(Sala sala) {
        this.sala = sala;
    }
    public Sessao getSessao() {
        return sessao;
    }
    public void setSessao(Sessao sessao) {
        this.sessao = sessao;
    }
    public Filme getFilme() {
        return filme;
    }
    public void setFilme(Filme filme) {
        this.filme = filme;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    //metodo
    public double calcularValor(){
        //calcula o valor de cada ingresso por sala e filme
        double valorIngresso = getValor()+filme.getValor()+getValor();
        return valorIngresso;
    }   
    public void imprimirBilhete(){
        //imprime as informações no bilhete
        System.out.println();   
    }
    
    


    }
