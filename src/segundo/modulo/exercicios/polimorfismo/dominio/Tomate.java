package segundo.modulo.exercicios.polimorfismo.dominio;
import segundo.modulo.exercicios.polimorfismo.dominio.Produto;

public class Tomate extends Produto{
    private static double taxa = 0.20;
    private String validade;

    public Tomate(String nome, int valor) {
        super(nome, valor);
    }

    @Override
    public double calcularTaxa() {
        return valor * taxa;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public String getValidade() {
        return validade;
    }
}
