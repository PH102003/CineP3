public enum Produtos {
    REFRIGERANTE(6), 
    PIPOCA(10),
    CHOCOLATE(8),
    SUCO(5),
    NACHOS(9);
    private double valor;
    Produtos(double valor){
        this.valor=valor;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
}
