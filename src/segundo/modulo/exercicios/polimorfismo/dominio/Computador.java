package segundo.modulo.exercicios.polimorfismo.dominio;

import segundo.modulo.exercicios.polimorfismo.dominio.Produto;

public class Computador extends Produto {
    private static double taxa = 0.20;

    public Computador(String nome, int valor) {
        super(nome, valor);
    }

    @Override
    public double calcularTaxa() {
        return valor * taxa;
    }


}
