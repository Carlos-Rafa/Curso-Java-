package segundo.modulo.aulas.Polimorifsmo;

public class Computador extends Produto{
    private static double taxa = 0.20;

    public Computador(String nome, int valor) {
        super(nome, valor);
    }

    @Override
    public double calcularTaxa() {
        return valor * taxa;
    }


}
