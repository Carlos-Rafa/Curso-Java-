package segundo.modulo.aulas;

import segundo.modulo.aulas.dominio.Pessoa;

public class Aula09 {
    public static void main(String[] args) {
        //Aula 54 - Modificador de acesso private
        Pessoa pesssoa =new Pessoa();

        pesssoa.setNome("       Fred");
        pesssoa.setIdade(25);

        String n =pesssoa.getNome();
        int i = pesssoa.getIdade();

        System.out.format("Nome: %s \nIdade %d", n,i);
    }
}
