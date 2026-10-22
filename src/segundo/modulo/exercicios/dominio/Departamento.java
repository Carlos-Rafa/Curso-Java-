package segundo.modulo.exercicios.dominio;

public class Departamento {
    private String departamento;
    Trabalhador[] trabalhadores;


    public Departamento(String nome) {
        this.departamento = nome;
    }

    // CORREÇÃO em Departamento.java:
    public void imprime() {
        System.out.println("-----DEPARTAMENTO-----");
        System.out.println(this.departamento);
        if (this.trabalhadores == null) return;

        for (Trabalhador trabalhador : this.trabalhadores) {
            System.out.println("-----FUNCIONARIO-----");
            System.out.println("Nome: " + trabalhador.getNome());
            System.out.println("Salario: " + trabalhador.getSalario());
            System.out.println("Cargo: " + trabalhador.getCargo());
        }
    }

    public void folhaDePagamento() {
        if (this.trabalhadores == null) return;

        double folha = 0;


        for (Trabalhador trabalhador : trabalhadores) {
            folha += trabalhador.getSalario();
        }

        System.out.println("-----FOLHA-----");
        System.out.format("Departamento: %s\nFolha: %d",  departamento, folha);
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Trabalhador[] getFuncionario() {
        return trabalhadores;
    }

    public void setFuncionario(Trabalhador[] funcionario) {
        this.trabalhadores = funcionario;
    }
}
