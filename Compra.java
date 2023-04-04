public class Compra {
    private double valorPipoca;
    private double valorCoca;
    private Bilhete bilhete;
    
    public Bilhete getBilhete() {
        return bilhete;
    }

    public void setBilhete(Bilhete bilhete) {
        this.bilhete = bilhete;
    }
    
    public Compra(double valorPipoca, double valorCoca, Bilhete bilhete) {
        this.bilhete = bilhete;
        this.valorPipoca = valorPipoca;
        this.valorCoca = valorCoca;
    }
    public double getValorCoca() {
        return valorCoca;
    }

    public void setValorCoca(double valorCoca) {
        this.valorCoca = valorCoca;
    }

    public double getValorPipoca() {
        return valorPipoca;
    }
    public void setValorPipoca(double valorPipoca) {
        this.valorPipoca = valorPipoca;
    }
  
    //metodos
    public double pegarItens(double cocaCola2, double valorPipoca2){
        //soma a quantidade de itens que ele quer e retorna o valor
        double resultadoItens = valorPipoca * valorPipoca2 + valorCoca * cocaCola2;
        return resultadoItens;
    }
    public double valorBilhete(double numsBilhetes){
        //quantidade de bilhetes vezes o valor do ingresso
        return numsBilhetes * bilhete.calcularValor();
        
    }  
    public void valorFinal(double numsBilhetes){
        double somaTotal = pegarItens(valorCoca, valorPipoca)  + valorBilhete(numsBilhetes);
        System.out.println("Preço total:" + somaTotal);
        
    }
}