package segundo.modulo.exercicios;

import segundo.modulo.exercicios.dominio.Animal;
import segundo.modulo.exercicios.dominio.Cachorro;

public class Exercicio10 {
    public static void main(String[] args) {
        Cachorro c1 = new Cachorro("maya","husck");
        Animal animal = new Animal();
        c1.emitirSom();
        animal.emitirSom();
    }
}
