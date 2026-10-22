package segundo.modulo.aulas;

import segundo.modulo.aulas.dominio.Calculadora;

public class Aula05 {
    public static void main(String[] args) {
        //Aula 46
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divisao(20,0);
        System.out.println((int) result);
        System.out.println("-------------------------");
    }
}
