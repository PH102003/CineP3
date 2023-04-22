import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Compra{
    
private double valorPipoca;
private double valorCoca;
private List<Bilhete> bilhetes;

public Compra(double valorPipoca, double valorCoca) {
    this.valorPipoca = valorPipoca;
    this.valorCoca = valorCoca;
    this.bilhetes = new ArrayList<Bilhete>();
}

public List<Bilhete> getBilhetes() {
    return bilhetes;
}

public void comprarBilhete(Bilhete bilhete) {
    bilhetes.add(bilhete);
}

public void comprarItem(String item, int quantidade) {
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
}



private double pegarItens() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Adicionar itens à compra? (sim/não)");
    String resposta = scanner.nextLine().toLowerCase();
    double valorTotal = 0;
    while (resposta.equals("sim")) {
        System.out.println("Qual item deseja adicionar? (pipoca, refrigerante)");
        String item = scanner.nextLine();
        System.out.println("Quantidade:");
        int quantidade = scanner.nextInt();
        scanner.nextLine();
        switch (item.toLowerCase()) {
            case "pipoca":
                valorTotal += valorPipoca * quantidade;
                break;
            case "refrigerante":
                valorTotal += valorCoca * quantidade;
                break;
            default:
                System.out.println("Desculpe, esse item não está disponível.");
        }
        System.out.println("Adicionar mais itens? (sim/não)");
        resposta = scanner.nextLine().toLowerCase();
    }
    scanner.close();
    return valorTotal;
}
public void usuarioDiminuir() {
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
}


}