package segundo.modulo.classesAbstratas;

public  abstract class Funcionario extends Pessoa {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;

    }

    @Override
    public void imprime() {
    System.out.println("Vai se fuder");

    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }


    public abstract void  calculaBonus() ;


}
