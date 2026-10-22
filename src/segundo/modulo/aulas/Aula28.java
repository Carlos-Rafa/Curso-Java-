package segundo.modulo.aulas;

import segundo.modulo.aulas.Polimorifsmo.Computador;
import segundo.modulo.aulas.Polimorifsmo.Televisao;
import segundo.modulo.aulas.Polimorifsmo.VideoGame;
import segundo.modulo.aulas.Polimorifsmo.servico.CalculaImposto;

public class Aula28 {
    public static void main(String[] args) {
        Computador computador = new Computador("Dell I9", 1200);
        VideoGame videoGame = new VideoGame("Xbox Series X", 3500);
        Televisao televisao = new Televisao("Sansung", 10000);

        CalculaImposto.calcularImposto(computador);
        System.out.println("------------------------------------------------");
        CalculaImposto.calcularImposto(videoGame);
        System.out.println("------------------------------------------------");
        CalculaImposto.calcularImposto(televisao);
    }

}
