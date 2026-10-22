package segundo.modulo.aulas.ModificadoresEstaticos.dominio;

public class Carro {
    private String marca;
    private double VelocidadeMaxima;
    public static final double VelocidadeLimite = 250; // final: impede que o valor seja alterado acidentalmente

    public Carro(String marca, double velocidadeMaxima) {
        this.marca = marca;
        VelocidadeMaxima = velocidadeMaxima;

    }

    public void imprime(){
        System.out.println("-----------------");
        System.out.println("Marca: " + this.marca);
        System.out.println("Velocidade Maxima: " + this.VelocidadeMaxima);
        System.out.println("Velocidade Limite: " + Carro.VelocidadeLimite);
    }


    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        VelocidadeMaxima = velocidadeMaxima;
    }



    public String getMarca() {
        return marca;
    }

    public double getVelocidadeMaxima() {
        return VelocidadeMaxima;
    }


}
