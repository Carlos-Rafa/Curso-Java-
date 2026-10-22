package segundo.modulo.exercicios.dominio.classesAbstratas.dominio;



public class Funcionario extends Pessoa {
    private double salario;
    private String cargo;

    public Funcionario(String nome, int idade,String cargo, double salario) {
        super(nome, idade);
        this.cargo = cargo;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cargo='" + cargo + '\'' +
                "salario=" + salario +
                '}';
    }
}
