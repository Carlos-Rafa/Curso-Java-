package segundo.modulo.exercicios;

import segundo.modulo.exercicios.dominio.Casa;
import segundo.modulo.exercicios.dominio.Comodo;

public class Exercicio06 {
    public static void main(String[] args) {
        Comodo comodo = new Comodo(50,"Quarto" );
        Comodo comodo2 = new Comodo(27.75,"sala" );
        Comodo comodo3 = new Comodo(178.55,"Quintal");

        Casa casa = new Casa();
        casa.adicionarComodo(comodo,0);
        casa.adicionarComodo(comodo2,1);
        casa.adicionarComodo(comodo3,2);

        casa.calcularAreaTotal();

    }
}
