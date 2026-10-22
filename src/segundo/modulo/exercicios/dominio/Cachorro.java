package segundo.modulo.exercicios.dominio;

public class Cachorro extends  Animal {
    private String nome;
    private String raca;

    @Override
    public void emitirSom(){
        System.out.println("AU AU AU AU");
    }

    public  Cachorro(String nome,  String raca) {
        this.nome = nome;
        this.raca = raca;
    }

    public String getNome() {
        return nome;
    }
    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}
