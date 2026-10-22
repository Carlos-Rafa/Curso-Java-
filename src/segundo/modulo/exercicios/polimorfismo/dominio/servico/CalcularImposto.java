package segundo.modulo.exercicios.polimorfismo.dominio.servico;

import segundo.modulo.exercicios.polimorfismo.dominio.Produto;
import segundo.modulo.exercicios.polimorfismo.dominio.Tomate;

public class CalcularImposto {

    public static void CalcularImposto(Produto produto) {
        System.out.println("-----CALCULANDO IMPOSTO-----");
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor: " + produto.getValor());
        System.out.println("Imposto: " + produto.calcularTaxa());

            if (produto instanceof Tomate) {

            System.out.println("Validade: " + ((Tomate) produto).getValidade());
        }
    }
}
