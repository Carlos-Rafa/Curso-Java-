package segundo.modulo.aulas;

import segundo.modulo.aulas.interfaces.DataLoad;
import segundo.modulo.aulas.interfaces.FileLoader;

public class Aula27 {
    public static void main(String[] args) {
        //Aula 87 - Orientação Objetos - Interfaces pt 01 - Introdução
        //Aula 88 - Orientação Objetos - Interfaces pt 02 - Implementando múltiplas interfaces

        FileLoader f = new FileLoader();
        DataLoad d = new DataLoad();

        System.out.println("----------------------------------");
        f.load();
        d.load();
        System.out.println("----------------------------------");
        f.remove();
        d.remove();
        System.out.println("----------------------------------");
        d.checkPermission();
        f.checkPermission();
    }
}
