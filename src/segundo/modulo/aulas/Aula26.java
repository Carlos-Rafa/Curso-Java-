package segundo.modulo.aulas;


import segundo.modulo.classesAbstratas.Estagiario;
import segundo.modulo.classesAbstratas.Gerente;

public class Aula26 {
    public static void main(String[] args) {
        //Aula 84 - Orientação Objetos - Classes abstratas pt 01


        Gerente g1 = new Gerente("Josenilton", 5000);


        Estagiario e1 = new Estagiario("Tonivaldo", 1500);

        e1.imprime();


        System.out.println("------GERENTE------");
        g1.calculaBonus();
        System.out.println(g1.toString());
        System.out.println("-----ESTAGIARIO-----");
        e1.calculaBonus();
        System.out.println(e1.toString());
    }
}
