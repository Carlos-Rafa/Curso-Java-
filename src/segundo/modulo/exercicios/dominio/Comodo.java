package segundo.modulo.exercicios.dominio;

public class Comodo {
    private String nome;
    private double areaM2;

    public Comodo(double areaM2, String nome) {
        this.areaM2 = areaM2;
        this.nome = nome;
    }

    public double getAreaM2() {
        return areaM2;
    }

    public void setAreaM2(double areaM2) {
        this.areaM2 = areaM2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
