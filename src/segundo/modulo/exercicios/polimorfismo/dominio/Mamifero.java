package segundo.modulo.exercicios.polimorfismo.dominio;

public class Mamifero extends Animal {
    protected String corPelo;

    public Mamifero(String corPelo,double peso, int idade, int membros) {
        super();
        this.peso = peso;
        this.idade = idade;
        this.membros = membros;
        this.corPelo = corPelo;

    }

    @Override
    public String toString() {
        return "Mamifero{" +
                "corPelo='" + corPelo + '\'' +
                ", peso=" + peso +
                ", idade=" + idade +
                ", membros=" + membros +
                '}';
    }

    @Override
    public void locomover() {
        System.out.println("Correndo");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamando");
    }

    @Override
    public void fazersom() {
        System.out.println("UAAAAAAAAAAA");
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
}
