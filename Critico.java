public class Critico extends Usuario {
    public String origem;
    public double nota;
    public Compra bilhete0Compra  = new Compra();
    public Critico(String user, String CPF, String senha, int idade, char sexo, String email, String nomeDoCartao,
    int numeroDoCartao, int idDoCartao,Compra compra){
        super(user, CPF, senha, idade, sexo, email, nomeDoCartao, numeroDoCartao, idDoCartao, compra);
    }
    
}
