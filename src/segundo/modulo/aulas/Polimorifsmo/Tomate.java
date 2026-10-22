package segundo.modulo.aulas.Polimorifsmo;

public class Tomate extends Produto {
    private static double taxa = 0.5;
    private String validade;

    public Tomate(String nome, int valor) {
        super(nome, valor);
    }


    @Override
    public double calcularTaxa() {
        return valor * taxa;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }
}
