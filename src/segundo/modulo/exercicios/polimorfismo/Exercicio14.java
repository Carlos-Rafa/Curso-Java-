package segundo.modulo.exercicios.polimorfismo;

;
import segundo.modulo.exercicios.polimorfismo.dominio.Computador;
import segundo.modulo.exercicios.polimorfismo.dominio.Produto;
import segundo.modulo.exercicios.polimorfismo.dominio.Tomate;
import segundo.modulo.exercicios.polimorfismo.dominio.servico.CalcularImposto;

public class Exercicio14 {
    public static void main(String[] args) {
        Produto produto = new Computador("Computador Dell", 5000);
        Produto produto2 = new Tomate("TOmate Verde", 1);

        Tomate tomate = new Tomate("Tomate Vermelho", 2);
        tomate.setValidade("15/01/2026");
        
        CalcularImposto.CalcularImposto(tomate);
        CalcularImposto.CalcularImposto(produto);

    }
}
