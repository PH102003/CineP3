public enum Cupons {
    BLACK(0.50),
    FUNCIONARIO(0.15),
    IDOSO(0.20);
    private double valor;
    Cupons(double valor){
        this.valor=valor;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
}
