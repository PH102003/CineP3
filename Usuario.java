import java.util.Scanner;

// Representa quem está comprando 

public class Usuario {

    // Atributos - informações de quem está comprando
    private String user;
    private String CPF;
    private String senha;
    private int idade;
    private char sexo;
    private String email;
    private String nomeDoCartao;
    private int numeroDoCartao;
    private int idDoCartao;
    private Compra compra;

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    // Construtor - vazio - para testes
    public Usuario() {
    }

    // Construtor - interação do usuario com a lógica do código
    public Usuario(String user, String CPF, String senha, int idade, char sexo, String email, String nomeDoCartao,
        int numeroDoCartao, int idDoCartao,Compra compra) {
        this.user = user;
        this.CPF = CPF;
        this.senha = senha;
        this.idade = idade;
        this.sexo = sexo;
        this.email = email;
        this.nomeDoCartao = nomeDoCartao;
        this.numeroDoCartao = numeroDoCartao;
        this.idDoCartao = idDoCartao;
        this.compra=compra;
    }

    // GET E SET - para ver e inserir, respectivamente as instruções desejadas
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
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

    public int getNumeroDoCartao() {
        return numeroDoCartao;
    }

    public void setNumeroDoCartao(int numeroDoCartao) {
        this.numeroDoCartao = numeroDoCartao;
    }

    public int getIdDoCartao() {
        return idDoCartao;
    }

    public void setIdDoCartao(int idDoCartao) {
        this.idDoCartao = idDoCartao;
    }

    public void realizarCompra(){
        Scanner in = new Scanner(System.in);
        compra.comprarBilhete();
        double valor = compra.pegarItens();
        System.out.println("O valor dos itens ficou: "+valor);
        System.out.println("Deseja alterar algo? Digite 1 para sim ou 2 para não ou 3 para cancelar!");
        int resposta = in.nextInt();
        if(resposta==1){
            alterarCompra();
        }else if(resposta==2){
            System.out.println("O valor total ficou: "+compra.valorTotal(valor));
        }else{
            cancelarCompra();
        }
    }
    
    public boolean alterarCompra(){
        compra.comprarBilhete();
        double valor= compra.pegarItens();
        System.out.println("Compra alterada com sucesso!");
        System.out.println("Seu novo valor é: "+valor);
        return true; // inserir a lógica de alterar
    }

    public void cancelarCompra() {
        System.out.println("Compra cancelada com sucesso!");
        return; // inserir a lógica de zerar
    }

    // toString - para que possa imprimir as informações dessas classe como String na classe Main.java
    
    @Override
    public String toString() {
        return "Usuario [user=" + user + ", CPF=" + CPF + ", senha=" + senha + ", idade=" + idade + ", sexo=" + sexo
        + ", email=" + email + ", nomeDoCartao=" + nomeDoCartao + ", numeroDoCartao=" + numeroDoCartao
        + ", idDoCartao=" + idDoCartao + "]";
    }
}