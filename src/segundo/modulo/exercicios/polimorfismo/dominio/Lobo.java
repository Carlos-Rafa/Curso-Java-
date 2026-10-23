package segundo.modulo.exercicios.polimorfismo.dominio;

public abstract class Lobo extends Mamifero {

    public Lobo(String corPelo, double peso, int idade, int membros) {
        super(corPelo, peso, idade, membros);
    }

    @Override
    public void alimentar() {}

    public void emitirsom() {
        System.out.println("AUUUUUUUUUUUUUUUUU");
    }

    public abstract void emitirSom();
}
