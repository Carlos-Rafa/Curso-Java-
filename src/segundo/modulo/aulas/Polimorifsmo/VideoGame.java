package segundo.modulo.aulas.Polimorifsmo;

public class VideoGame extends Produto {
    private static double taxa = 0.15;
    private String marca;

    public VideoGame(String nome, int valor) {

        super(nome, valor);
    }

    @Override
    public double calcularTaxa() {
        System.out.println("Calcular taxa do VideoGame");
        return valor * taxa;
    }
}
