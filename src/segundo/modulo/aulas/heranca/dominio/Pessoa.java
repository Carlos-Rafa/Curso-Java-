package segundo.modulo.aulas.heranca.dominio;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    static {
        System.out.println("dentro do boloco estatico Pessoa");
    }

    {
        System.out.println("dentro do boloco nao estatico Pessoa");
    }

    {
        System.out.println("dentro do boloco nao estatico Pessoa");
    }

    public Pessoa(String nome) {
        System.out.println("Dentro do construtor Pessoa");
        this.nome = nome;
    }

    public void imprime() {
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        if (this.endereco == null ) return;
        System.out.println("ENDERECO: " + this.endereco.getEndenreco());
        System.out.println("CEP: " + this.endereco.getCep());
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
