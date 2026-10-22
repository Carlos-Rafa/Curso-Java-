package segundo.modulo.aulas;

import segundo.modulo.aulas.Enumeracao.Cliente;
import segundo.modulo.aulas.Enumeracao.Tipo_Cliente;
import segundo.modulo.aulas.Enumeracao.Tipo_Pagamento;


public class Aula25 {
    public static void main(String[] args) {
        //Aula 80 e 81 - Orientação Objetos - Enumeração pt 01 - Introdução
        Cliente cliente = new Cliente("Josival", Tipo_Cliente.Pessoa_Fisica, Tipo_Pagamento.CREDITO);
        Cliente cliente2 = new Cliente("Pedro", Tipo_Cliente.Pessoa_Juridica, Tipo_Pagamento.DEBITO);

        System.out.println(cliente.toString());
        System.out.println("----------------------------------------------------");
        System.out.println(cliente2.toString());
        System.out.println("----------------------------------------------------");
        System.out.println(Tipo_Pagamento.DEBITO.calcularDesconto(100));
        System.out.println(Tipo_Pagamento.CREDITO.calcularDesconto(100));
        System.out.println("----------------------------------------------------");


        Tipo_Cliente pessoaFisica2 = Tipo_Cliente.ClienteporRelatorio("Pessoa Juridica");
        System.out.println(pessoaFisica2.toString());

        System.out.println("ID do relatorio: "+pessoaFisica2.getVALOR());
        System.out.println("ID do relatorio: "+pessoaFisica2.getNomeRelatorio());


    }
}
