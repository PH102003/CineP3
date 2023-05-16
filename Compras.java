import java.util.Scanner;
public class Compras extends Compra{
    private Cupons cupom;
    public Compras(Cupons cupom,Produtos produto,Bilhete bilhete) {
        super(produto, bilhete);
        this.cupom = cupom;
    }
    public Cupons getCupom() {
        return cupom;
    }

    public void setCupom(Cupons cupom) {
        this.cupom = cupom;
    }
    public double comprarBilhete(int quantidade) {
        Scanner in = new Scanner(System.in);
        double valorBilhetes=super.getBilhete().valor();
        double valorComDesconto=0;
        System.out.println("Deseja usar algum cupom?");
        String resposta = in.next().toLowerCase();
        if(resposta.equals("sim")){
            System.out.println("Digite 1 para cupom black, 2 para Funcionario, 3 para idoso");
            int num=in.nextInt();
            switch(num){
                case 1:
                valorComDesconto=valorBilhetes*this.cupom.BLACK.getValor();
                break;
                case 2:
                valorComDesconto=valorBilhetes*this.cupom.FUNCIONARIO.getValor();
                break;
                case 3:
                valorComDesconto=valorBilhetes*this.cupom.IDOSO.getValor();
                break;
                default:
                System.out.println("ERRO");
            }
            if(quantidade>1){
                return valorBilhetes*(quantidade-1)+valorComDesconto;
            }else{
                return valorComDesconto*quantidade;
            }
        }else{
            return valorBilhetes*quantidade;
        }
    }
    public double pegarItens() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adicionar itens à compra? (sim/não)");
        String resposta = scanner.nextLine().toLowerCase();
        double valorTotal = 0;
        while (resposta.equals("sim")) {
            System.out.println("Qual item deseja adicionar? (pipoca, refrigerante,suco,chocolate,nachos)");
            String item = scanner.next();
            System.out.println("Quantidade:");
            int quantidade = scanner.nextInt();
            switch (item.toLowerCase()) {
                case "pipoca":
                    valorTotal += super.getProduto().PIPOCA.getValor() * quantidade;
                    break;
                case "refrigerante":
                    valorTotal += super.getProduto().REFRIGERANTE.getValor() * quantidade;
                    break;
                case "suco":
                    valorTotal += super.getProduto().SUCO.getValor() *quantidade;
                    break;
                case "chocolate":
                    valorTotal += super.getProduto().CHOCOLATE.getValor() *quantidade;
                case "nachos":
                    valorTotal += super.getProduto().NACHOS.getValor() *quantidade;
                    break;
                default:
                    System.out.println("Desculpe, esse item não está disponível.");
            }
            System.out.println("Adicionar mais itens? (sim/não)");
            resposta = scanner.nextLine().toLowerCase();
        }
        System.out.println("Deseja usar algum cupom?");
        String pergunta = scanner.next().toLowerCase();
        if(pergunta.equals("sim")){
            System.out.println("Digite 1 para cupom black, 2 para Funcionario, 3 para idoso");
            int num=scanner.nextInt();
            switch(num){
                case 1:
                valorTotal=valorTotal*this.cupom.BLACK.getValor();
                case 2:
                valorTotal=valorTotal*this.cupom.FUNCIONARIO.getValor();
                case 3:
                valorTotal=valorTotal*this.cupom.IDOSO.getValor();
                default:
                System.out.println("ERRO");
            }
    }
    scanner.close();
    return valorTotal;
}
}
