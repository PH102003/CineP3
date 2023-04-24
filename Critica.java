public class Critica{
   public String nome;
   public String origem;
   public String comentarioDoCritico;
   public double nota;
   public int quantidade_criticos;
   
   public Critica(String nome, String origem, String comentarioDoCritico, int quantidadeCriticos){
       this.nome = nome;
       this.origem = origem;
       this.comentarioDoCritico = comentarioDoCritico;
       this.quantidade_criticos = 0;
   }
   public String getNome() {
       return nome;
   }
   
   public String getOrigem() {
       return origem;
   }
   public String getComentarioDoCritico() {
    return comentarioDoCritico;
   }
   
public void atribuirNota(double nota, Filme filme) {
    filme.adicionarNota(nota);
}

/*public void atribuirCritica(String critica, Filme filme) {
    filme.adicionarCritica(critica);
}*/ 
}

