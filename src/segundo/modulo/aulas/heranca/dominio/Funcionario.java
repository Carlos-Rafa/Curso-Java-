package segundo.modulo.aulas.heranca.dominio;

public class Funcionario extends Pessoa {
    private double salario;

    static {
        System.out.println("dentro do boloco estatico Funcionario");
    }

    {
        System.out.println("dentro do boloco nao estatico Funcionario");
    }

    {
        System.out.println("dentro do boloco nao estatico Funcionario");
    }


    public Funcionario(String nome){
        super(nome);
        System.out.println("Dentro do construtor Funcionario");
    }



    public void imprime(){
        super.imprime();
        System.out.println("Salario: " + this.salario);
    }

    public void relatorio(){
        System.out.println("Eu" + this.nome +"Recebe um salario de " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
