package segundo.modulo.exercicios.polimorfismo.dominio;

import segundo.modulo.aulas.Polimorifsmo.Taxa;

public abstract class Produto implements Taxa {
    protected String nome;
    protected double valor;

    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }
}
