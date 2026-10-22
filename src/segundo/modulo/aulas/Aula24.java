package segundo.modulo.aulas;

import segundo.modulo.aulas.modificadoresFinal.Carro;
import segundo.modulo.aulas.modificadoresFinal.Comprador;

public class Aula24 {
    public static void main(String[] args) {
        //78 - Orientação Objetos - Modificador final pt 02 - Tipo referência



        Carro carro = new Carro();
        carro.setModelo("Corsa");

        carro.COMPRADOR.setNome("Rafa");

        System.out.println(carro.getModelo() + carro.getVELOCIDADE_LIMITE());
        System.out.println(carro.COMPRADOR.getNome());


    }
}
