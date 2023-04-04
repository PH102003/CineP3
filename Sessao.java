public class Sessao {
    private boolean[][] cadeiras;
    private Filme filme;

    public Sessao(Filme filme) {
        this.cadeiras = new boolean[10][15];
        this.filme = filme;
        // for foi criado pra percorrer numeros de linhas e coluna se a cadeira nessa
        // posição está vazia, está verdadeira
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 15; j++) {
                cadeiras[i][j] = true;

            }
        }

    }

    // gets e sets
    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    // metodos
    
    

    public void mostrarCadeirasDispo() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 15; j++) {
                System.out.println(cadeiras[i][j]); 
            }
        }
    }
    public void pegarCadeira(char linha, int coluna) {
        if (cadeiras[linha][coluna] == true) {
            // vai ser false porque assim que ocupar, não vai ser mais true
            cadeiras[linha][coluna] = false;
            
        } else {
            System.out.println("Cadeira está ocupada");
        }

    }
}
