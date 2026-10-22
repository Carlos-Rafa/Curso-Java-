package segundo.modulo.aulas.Polimorifsmo;

public class Televisao extends Produto {
    private static double imposto = 0.20;

    public Televisao(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularTaxa() {
        return valor * imposto;
    }
}
