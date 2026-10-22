package segundo.modulo.exercicios.interfaces;

import segundo.modulo.exercicios.interfaces.domain.LampadaInteligente;

public class Exercicio {
    public static void main(String[] args) {
        LampadaInteligente l1 = new LampadaInteligente("Sala",false);
        l1.conectarWifi();
        l1.verificarConcexao();
        l1.status();
    }
}
