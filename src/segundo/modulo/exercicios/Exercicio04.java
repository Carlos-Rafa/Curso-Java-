package segundo.modulo.exercicios;

import segundo.modulo.exercicios.dominio.Cachorro;
import segundo.modulo.exercicios.dominio.Dono;

public class Exercicio04 {
    public static void main(String[] args) {

        Dono dono = new Dono("Rafael");
        Cachorro cachorro = new Cachorro("Maya", "Husk");

        dono.AdotarCachorro(cachorro,0);
        dono.mostrarCachorro();
    }
}
