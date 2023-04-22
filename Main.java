public class Main {
    public static void main(String[] args) {
        Sessao s1 = new Sessao(null);
        s1.horarios();
        Compra c1 = new Compra(2, 2);
        c1.usuarioDiminuir();
        Compra c2 = new Compra(0, 0);
        
        // testar a classe filme e sessao.
        Filme filme1 = new Filme("Matrix", 136,
                "Um hacker é recrutado para lutar contra máquinas que dominaram o mundo", 20.50);
        Sessao sessao = new Sessao(filme1);
        sessao.verCadeirasDisponiveis();
        sessao.reservarCadeira(0, 0);
        sessao.reservarCadeira(0, 1);
        sessao.reservarCadeira(1, 1);
        sessao.verCadeirasDisponiveis();
        // ------------------------- O teste foi um sucesso.
        // -------------------------.

        // testar a classe bilhete
        Sala sala1 = new Sala(1,10);
        Sessao sessao1 = new Sessao(filme1);
        Bilhete bilhete1 = new Bilhete(null, sala1,filme1,sessao1);

        System.out.println(bilhete1.toString());
        // ------------------------- O teste foi um sucesso.
        // -------------------------.
    }
    
}
