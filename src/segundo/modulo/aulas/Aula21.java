package segundo.modulo.aulas;

import segundo.modulo.aulas.heranca.dominio.Endereco;
import segundo.modulo.aulas.heranca.dominio.Funcionario;
import segundo.modulo.aulas.heranca.dominio.Pessoa;

public class Aula21 {
    public static void main(String[] args) {
        //Aula 71 - Orientação Objetos - Herança pt 01

        Endereco endereco = new Endereco();

        endereco.setEndenreco("Rua Antonio Dantas");
        endereco.setCep(154862656);

        Pessoa pessoa = new Pessoa("Rafael");

        pessoa.setCpf("1254846");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        System.out.println("-----------------------");

        Funcionario funcionario = new Funcionario("Carlos");
        funcionario.setSalario(5000.50);
        funcionario.setCpf("123456789");
        funcionario.setEndereco(endereco);

        funcionario.imprime();

        funcionario.relatorio();

    }
}
