package segundo.modulo.exercicios.dominio;

public class Trabalhador {
    private String nome;
    private String cargo;
    private double salario;
    private Departamento departamento;

    public Trabalhador(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public void imprime(){
        System.out.format("O funcionário %s trabalha no departamento %s e ganha R$ %f\n", this.getNome(), departamento.getDepartamento(), this.getSalario());
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
}
