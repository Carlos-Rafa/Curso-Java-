package segundo.modulo.aulas;

import segundo.modulo.aulas.Polimorifsmo.Computador;
import segundo.modulo.aulas.Polimorifsmo.Produto;
import segundo.modulo.aulas.Polimorifsmo.Tomate;
import segundo.modulo.aulas.Polimorifsmo.servico.CalculaImposto;

public class Aula28_pt3 {
    public static void main(String[] args) {

        Produto produto = new Computador("Dell", 25);
        Produto produto1 = new Tomate("Tomate Verde", 1);

        Tomate tomate = new Tomate("Tomate Vermelho", 2);
        tomate.setValidade("01/02/2027");
        CalculaImposto.calcularImposto(tomate);


        CalculaImposto.calcularImposto(produto);



        



    }
}
