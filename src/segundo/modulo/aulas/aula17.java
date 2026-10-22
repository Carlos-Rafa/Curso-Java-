package segundo.modulo.aulas;

import segundo.modulo.Assosicao.dominio.Jogador;
import segundo.modulo.Assosicao.dominio.Time;
// Aula 65 - Associação pt 02 - Associação unidirecional um para muitos
public class aula17 {
    public static void main(String[] args) {

        Jogador jogador = new Jogador("Ronaldinho");
        Time time = new Time("Brasil");
        Jogador jogador2 = new Jogador("Romario");
        Time time2 = new Time("Brasil");
        jogador2.setTime(time2);
        jogador2.imprime();
        jogador.setTime(time );
        jogador.imprime();

    }
}
