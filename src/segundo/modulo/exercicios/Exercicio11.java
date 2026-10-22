package segundo.modulo.exercicios;

import segundo.modulo.exercicios.dominio.Enumeracao.Cliente;
import segundo.modulo.exercicios.dominio.Enumeracao.TipoCliente;


public class Exercicio11 {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Rafael",25,"Rua Dos D'La Marca", "Mexico", TipoCliente.Pessoa_Juridica,Cliente.TipoPagamento.DEBITO);

        System.out.println( c1.toString());
    }
}
