public class Sala {
   
    private int tamanhoLista;
    private Sessao[] sessoes;
    private double valor;
   
   
    public Sala() {
    }
   
   
    public Sala(int tamanhoLista, double valor) {
        this.tamanhoLista = tamanhoLista;
        this.valor = valor;
        this.sessoes = new Sessao[tamanhoLista];
    }
   
   
       // get sets
       public int getTamanhoLista() {
           return tamanhoLista;
       }
   
   
       public void setTamanhoLista(int tamanhoLista) {
           this.tamanhoLista = tamanhoLista;
       }
   
   
       public Sessao[] getSessoes() {
           return sessoes;
       }
   
   
       public void setSessoes(Sessao[] sessoes) {
           this.sessoes = sessoes;
   
   
       }
   
   
       public double getValor() {
           return valor;
       }
   
   
       // metodos
       public void mostrarSessoes() {
           for (int i = 0; i < tamanhoLista; i++) {
               if (sessoes[i] != null) {
                   System.out.println("Horário " + i + ": " + sessoes[i].getFilme().getNome());
               } else {
                   System.out.println("Horário " + i + ": não há sessão");
               }
           }
       }
   
   
   
   
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
   