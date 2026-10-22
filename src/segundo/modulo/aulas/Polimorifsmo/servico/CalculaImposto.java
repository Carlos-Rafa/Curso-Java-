package segundo.modulo.aulas.Polimorifsmo.servico;

import segundo.modulo.aulas.Polimorifsmo.Computador;
import segundo.modulo.aulas.Polimorifsmo.Produto;
import segundo.modulo.aulas.Polimorifsmo.Tomate;
import segundo.modulo.aulas.Polimorifsmo.VideoGame;

public class CalculaImposto {


    public static void calcularImposto(Produto produto) {
        double imposto = produto.calcularTaxa();
        System.out.println("---------RELATORIO DE IMPOSTO----------");
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor: " + produto.getValor());
        System.out.println("Imposto: " + imposto);
        if (produto instanceof Tomate) {
            //Tomate tomate = (Tomate) produto;
            System.out.println("Validade: " + ((Tomate)produto).getValidade()); //Maneira simplificada da linha 18
        }
    }
}