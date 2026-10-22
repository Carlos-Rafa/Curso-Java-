package segundo.modulo.aulas.sobrescrita;

public class Anime {
    private String nome;
    private int numero;

    public Anime(String nome) {
        this.nome = nome;

    }

    public Anime(String nome, int numero) {
        this(nome);
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Numero: " +  this.numero;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
