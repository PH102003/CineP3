public class Funcionario extends Base implements GerenciaFilmes{
    private double salario;

    public Funcionario(String nome, String email, int idade, double salario) {
        super(nome, email, idade);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public void addUsuario() {
        // TODO Auto-generated method stub
    }

    @Override
    public void alterarUsuario() {
        // TODO Auto-generated method stub
    }

    @Override
    public void incluirFilme() {
        // TODO Auto-generated method stub
    }

    @Override
    public void excluirFilme() {
        // TODO Auto-generated method stub
    }

    @Override
    public void alterarFilme() {
        // TODO Auto-generated method stub
    }
}
