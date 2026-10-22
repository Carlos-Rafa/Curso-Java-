package segundo.modulo.aulas;

import segundo.modulo.aulas.dominio.Calculadora;

public class Aula08 {
    public static void main(String[] args) {

        //52 - Orientação Objetos - Métodos pt 09 - Varargs
        Calculadora calculadora = new Calculadora();
        int [] a = {1,2,3,4,5};
        calculadora.somaArry(a);

        calculadora.somaVarargs(1,2,3,4,5);
    }
}
