package segundo.modulo.exercicios.polimorfismo;

import segundo.modulo.exercicios.polimorfismo.dominio.Cachorro;
import segundo.modulo.exercicios.polimorfismo.dominio.Mamifero;

public class Exercicio13 {
    public static void main(String[] args) {
        Mamifero m1 = new Mamifero("Pelo", 12.5f,10,5);
        System.out.println(m1.toString());
        m1.locomover();
        m1.alimentar();

        System.out.println("------------------------");

        Cachorro maya = new Cachorro("Preto e Branco",19,4,4);


    }
}
