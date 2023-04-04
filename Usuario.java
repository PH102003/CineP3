
public class Usuario{
    private String CPF;
    private int senha;
    private int idade;
    private char sexo;
    private String email;
    private String nomeDoCartao;
    private int cvv;
    private String user;
    private int numCartao;
    
    
    
    public Usuario(String CPF, int senha, int idade, char sexo, String email, String nomeDoCartao, int cvv, String user,
            int numCartao) {
        this.CPF = CPF;
        this.senha = senha;
        this.idade = idade;
        this.sexo = sexo;
        this.email = email;
        this.nomeDoCartao = nomeDoCartao;
        this.cvv = cvv;
        this.user = user;
        this.numCartao = numCartao;
    }
    public void realizarCompra(){
        //realiza a compra 
    }
    public void alterarCompra(){
        //altera a compra do usuario
    }
    public void cancelarCompra(){
        //cancela a compra do usuario
    }

    public String getCPF() {
        return CPF;
    }
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    public int getSenha() {
        return senha;
    }
    public void setSenha(int senha) {
        this.senha = senha;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getNomeDoCartao() {
        return nomeDoCartao;
    }
    public void setNomeDoCartao(String nomeDoCartao) {
        this.nomeDoCartao = nomeDoCartao;
    }
    public int getCvv() {
        return cvv;
    }
    public void setCvv(int cvv) {
        this.cvv = cvv;
    }
    public String getUser() {
        return user;
    }
    public void setUser(String user) {
        this.user = user;
    }
    public int getNumCartao() {
        return numCartao;
    }
    public void setNumCartao(int numCartao) {
        this.numCartao = numCartao;
    }
    

}

