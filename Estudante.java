import java.util.Scanner;

public class Estudante extends Usuario{
   public Estudante(String user, String CPF, String senha, int idade, char sexo, String email, String nomeDoCartao,
    int numeroDoCartao, int idDoCartao,Compra compra){
        super(user, CPF, senha, idade, sexo, email, nomeDoCartao, numeroDoCartao, idDoCartao, compra);
    }
    @Override
    public void realizarCompra(){
        Scanner in = new Scanner(System.in);
        super.getCompra().getBilhete();
        double valor = super.getCompra().pegarItens();
        System.out.println("O valor dos itens ficou: "+valor);
        System.out.println("Deseja alterar algo? Digite 1 para sim ou 2 para não ou 3 para cancelar!");
        int resposta = in.nextInt();
        if(resposta==1){
            alterarCompra();
        }else if(resposta==2){
            System.out.println("O valor total ficou: "+super.getCompra().valorTotal(valor)/2);
        }else{
            cancelarCompra();
        }
    }
}
