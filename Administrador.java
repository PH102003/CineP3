public class Administrador extends Base implements GerenciaFilmes{
    private String id;
    private double salario;
    public Administrador(String nome, String email, int idade, String id, double salario) {
        super(nome, email, idade);
        this.id = id;
        this.salario = salario;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public void addUsuario() {
        // TODO Auto-generated method stub
    }

    @Override
    public void alterarUsuario() {
        // TODO Auto-generated method stub
    }
    public void excluirUsuario(){

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
