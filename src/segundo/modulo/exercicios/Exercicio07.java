package segundo.modulo.exercicios;

import segundo.modulo.exercicios.dominio.Carro;
import segundo.modulo.exercicios.dominio.Garagem;

public class Exercicio07 {
    public static void main(String[] args) {
        Carro carro = new Carro("Ferrari", "A1B2C3A4");
        Carro carro2 = new Carro("Porcher", "A5rgs3");
        Garagem garagem = new Garagem();

        garagem.estacionar(carro);
        garagem.mostrarVagas();

    }
}
