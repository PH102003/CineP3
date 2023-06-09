import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Compra{
    
private Produtos produto;
private Bilhete bilhete;

public Bilhete getBilhete() {
    return bilhete;
}

public void setBilhete(Bilhete bilhete) {
    this.bilhete = bilhete;
}

public Produtos getProduto() {
    return produto;
}

public void setProduto(Produtos produto) {
    this.produto = produto;
}

private List<Bilhete> bilhetes;

public Compra(Produtos produto2, Bilhete bilhete2) {
    this.bilhetes = new ArrayList<Bilhete>();
    this.produto = produto2;

}

public List<Bilhete> getBilhetes() {
    return bilhetes;
}

public double comprarBilhete(int quantidade) {
    double valorBilhetes = bilhete.valor();
    return valorBilhetes;
}

/*public void comprarItem(String item, int quantidade) {
    double valorItem = 0;
    switch (item.toLowerCase()) {
        case "pipoca":
            valorItem = valorPipoca;
            break;
        case "refrigerante":
            valorItem = valorCoca;
            break;
        default:
            System.out.println("Desculpe, esse item não está disponível.");
            return;
    }
    double valorTotal = valorItem * quantidade;
    System.out.println(quantidade + " " + item + "(s) adicionado(s) à compra. Valor total: R$" + valorTotal);
}*/



public double pegarItens() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Adicionar itens à compra? (sim/não)");
    String resposta = scanner.nextLine().toLowerCase();
    double valorTotal = 0;
    while (resposta.equals("sim")) {
        System.out.println("Qual item deseja adicionar? (pipoca, refrigerante,suco,chocolate,nachos)");
        String item = scanner.nextLine();
        System.out.println("Quantidade:");
        int quantidade = scanner.nextInt();
    
        switch (item.toLowerCase()) {
            case "pipoca":
                valorTotal += produto.PIPOCA.getValor() * quantidade;
                break;
            case "refrigerante":
                valorTotal += produto.REFRIGERANTE.getValor() * quantidade;
                break;
            case "suco":
                valorTotal += produto.SUCO.getValor() *quantidade;
                break;
            case "chocolate":
                valorTotal += produto.CHOCOLATE.getValor() *quantidade;
                break;
            case "nachos":
                valorTotal += produto.NACHOS.getValor() *quantidade;
            default:
                System.out.println("Desculpe, esse item não está disponível.");
        }
        System.out.println("Adicionar mais itens? (sim/não)");
        resposta = scanner.next().toLowerCase();
    }
    scanner.close();
    return valorTotal;
}
public double valorTotal(double valorItens){
    return bilhete.valor()+valorItens;
}
/*public void usuarioDiminuir() {
    Scanner sc = new Scanner(System.in);
    //verifica se o valorCoca é maior q 1, se for, faz a operaçao

    if (valorCoca > 0) {
        System.out.println("Deseja remover quantas unidades de Coca-Cola? Digite um número entre 1.0 e " + valorCoca);
        int unidadeCoca = sc.nextInt();
        if (unidadeCoca > 0 && unidadeCoca <= valorCoca) {
            diminuirUnidadeCoca(unidadeCoca);
            System.out.println("Você agora tem: " + valorCoca + " unidade(s) de Coca-Cola");
        }
    }
    //mesma coisa aqui
    if (valorPipoca > 0) {
        System.out.println("Deseja remover quantas unidades de Pipoca? Digite um número entre 1.0 e " + valorPipoca);
        int unidadePipoca = sc.nextInt();
        if (unidadePipoca > 0 && unidadePipoca <= valorPipoca) {
            diminuirUnidadePipoca(unidadePipoca);
            System.out.println("Você agora tem: " + valorPipoca + " unidade(s) de Pipoca");
        }
    }
}



public void diminuirUnidadePipoca(int unidade) {
    this.valorPipoca -= unidade;
}

public void diminuirUnidadeCoca(int unidade) {
    this.valorCoca -= unidade;
}*/


}
