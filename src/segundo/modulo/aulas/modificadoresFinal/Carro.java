package segundo.modulo.aulas.modificadoresFinal;

public class Carro {
    private String modelo;
    private static final double VELOCIDADE_LIMITE = 250;
    public final Comprador COMPRADOR = new Comprador();

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Comprador getCOMPRADOR() {
        return COMPRADOR;
    }

    public double getVELOCIDADE_LIMITE() {
        return VELOCIDADE_LIMITE;
    }
}
