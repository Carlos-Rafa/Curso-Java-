package segundo.modulo.exercicios.dominio.Enumeracao;

public class Pessoa {
    protected String nome;
    protected int idade;
    protected String endereco;
    protected String cidade;

    public Pessoa(String nome, int idade, String endereco, String cidade) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.cidade = cidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
