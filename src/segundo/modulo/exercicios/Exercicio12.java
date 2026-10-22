package segundo.modulo.exercicios;

import segundo.modulo.exercicios.interfaces.domain.DataLoade;

import segundo.modulo.exercicios.interfaces.domain.FileLoader;

public class Exercicio12 {
    public static void main(String[] args) {
        DataLoade d = new DataLoade();
        FileLoader f = new FileLoader();

        System.out.println("-----------------------");
        d.imprime();
        f.imprime();

        System.out.println("-----------------------");
        f.remove();
        d.remove();

        System.out.println("-----------------------");
        f.checkpermission();
        d.checkpermission();
    }
}
