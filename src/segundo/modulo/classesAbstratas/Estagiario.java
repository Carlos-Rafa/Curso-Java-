package segundo.modulo.classesAbstratas;

public class Estagiario extends Funcionario {

    public Estagiario(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void calculaBonus(){
        this.salario = this.salario + salario* 0.1;
    }

}
