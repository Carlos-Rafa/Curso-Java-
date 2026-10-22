package segundo.modulo.aulas;

import segundo.modulo.aulas.Polimorifsmo.Computador;
import segundo.modulo.aulas.Polimorifsmo.Produto;

public class Aula28_pt2 {
    public static void main(String[] args) {

        Produto produto = new Computador("Dell", 25);

        System.out.println(produto.getNome());
    }
}
