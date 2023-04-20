public class Sala {
    private Sessao[] sessoes;
    private int numSessoes;

    // construtor
    public Sala(int numSessoes) {
        this.sessoes = new Sessao[numSessoes];
        this.numSessoes = numSessoes;

    }

    // get sets
    public Sessao[] getSessoes() {
        return sessoes;
    }

    public void setSessoes(Sessao[] sessoes) {
        this.sessoes = sessoes;
    }

    public int getNumSessoes() {
        return numSessoes;
    }

    public void setNumSessoes(int numSessoes) {
        this.numSessoes = numSessoes;
    }

    // metodos
    public void mostrarHorariosNaSala() {
        Sessao horario = new Sessao(null);
        horario.horarios();
        
    }

    public void exibirSessao() {
        for (int i = 0; i < sessoes.length; i++) {
            if (sessoes[i] == null) {

            } else {
                System.out.println(i);
            }
        }
    }

}
