package segundo.modulo.exercicios.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private int[] salario;
    private int media ;



    public void getFuncionario(String nome, int idade, int... salarios) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salarios;

        System.out.println("-------Funcionario-------");
        System.out.format("Nome: %s\n", this.nome);
        System.out.format("Idade: %d\n", this.idade);
        if (salarios != null && salarios.length > 0) {
            for (int i : salarios) {
                System.out.format("Salario: %d\n", i);
            }
            mediaSalario();

        } else {
            System.out.println("Salarios nao informado!");
        }


    }

    private void mediaSalario() {

        for (int i : salario) {
            media += i;
        }
        System.out.println("----------------------");

        media /= salario.length;

    }

    public int[] getSalario() {
        return salario;
    }

    public void setSalario(int... salario) {
        this.salario = salario;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getMedia() {
        return ("A media dos salarios e R$:" + media);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}


