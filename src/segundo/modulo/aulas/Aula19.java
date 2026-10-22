package segundo.modulo.aulas;

import segundo.modulo.Assosicao.dominio.Jogador;
import segundo.modulo.Assosicao.dominio.Time;

public class Aula19 {
    public static void main(String[] args) {
        //Aula67 - Orientação Objetos - Associação pt 04 - Associação bidirecional

        Jogador jogador = new Jogador("Pele");
        Time time = new Time("Brasil");

        jogador.setTime(time);

        Jogador[] jogadores = {jogador};
        time.setJogadores(jogadores);

        System.out.println("----Jogador----");
        jogador.imprime();

        System.out.println("----Time----");
        time.imprimir();

    }
}
