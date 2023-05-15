public class Sessao {
    private int linhas = 10;
    private int colunas = 15;
    private Filme filme;
    private boolean[][] cadeiras; // se está ocupado ou não


    // Construtor vazio - para teste
    public Sessao() {
    }


    // Construtor que irá usara o filme escolhido pelo usuário
    public Sessao(Filme filme) {
        this.filme = filme;
        this.cadeiras = new boolean[linhas][colunas];
        // validar as cadeiras como true == fazia
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                this.cadeiras[i][j] = true;
            }
        }
    }


    // gets e sets
    public int getLinhas() {
        return linhas;
    }




    public void setLinhas(int linhas) {
        this.linhas = linhas;
    }




    public int getColunas() {
        return colunas;
    }




    public void setColunas(int colunas) {
        this.colunas = colunas;
    }




    public Filme getFilme() {
        return filme;
    }




    public void setFilme(Filme filme) {
        this.filme = filme;
    }




    public boolean[][] getCadeiras() {
        return cadeiras;
    }




    public void setCadeiras(boolean[][] cadeiras) {
        this.cadeiras = cadeiras;
    }


    // metodos
   
    public void reservarCadeira(int linha, int coluna) {


        // verificar se tem algum filme
        if (this.filme == null) {
            System.out.println("Não há nenhum filme nesta sessão");
        }


        // verificar se as linha e colunas são validas
        else if (linha < 0 || linha >= linhas || coluna < 0 || coluna >= colunas) {
            System.out.println("Cadeira inválida");
        }


        // escolher lugar
        else if (this.cadeiras[linha][coluna]) {
            // mudar para false == ocupado
            this.cadeiras[linha][coluna] = false;
            System.out.println("Cadeira " + linha + "-" + coluna + " reservada para o filme " + this.filme);
        }
        // informar que o lugar já foi escolhido
        else {
            System.out.println("Cadeira " + linha + "-" + coluna + " já está ocupada");
        }
    }


    public void horarios() {


        String primeiroHorario, segundoHorario, terceiroHorario, quartoHorario, quintoHorario;
        primeiroHorario = "9:00 - 11:00 \n";
        segundoHorario = "11:30 - 13:30 \n";
        terceiroHorario = "14:00 - 16:00 \n";
        quartoHorario = "16:30 - 17:30 \n";
        quintoHorario = "18:00 - 20:00 \n";


        System.out.println("Horários disponíveis: \n" + primeiroHorario + segundoHorario + terceiroHorario
                + quartoHorario + quintoHorario);


    }


    public void verCadeirasDisponiveis() {
       
        // Verificar se tem filme
        if (this.filme == null) {
            System.out.println("Não há nenhum filme nesta sessão");
        }


        // caso tenha um filme
        else {
            System.out.println("Cadeiras disponíveis para o filme " + this.filme + ":");
            for (int i = 0; i < linhas; i++) {
                for (int j = 0; j < colunas; j++) {
                    System.out.print(this.cadeiras[i][j] ? "O " : "X "); // o para vazia == true e x para preenchida == false
                }
                System.out.println(" ");
            }
        }
    }


   
    @Override
    public String toString() {
       
        return ". "+ filme;
    }


}
