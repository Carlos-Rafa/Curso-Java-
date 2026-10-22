package segundo.modulo.exercicios;

import segundo.modulo.exercicios.dominio.Departamento;
import segundo.modulo.exercicios.dominio.Trabalhador;

public class Exercicio08 {
    public static void main(String[] args) {
        Trabalhador trabalhador = new Trabalhador("Josival", "Coordenador" ,5000);
        Trabalhador trabalhador2 = new Trabalhador("Rogerio", "Diretor" ,7000);
        Trabalhador trabalhador3 = new Trabalhador("Lucas", "Estagiario" ,750.50);

        Departamento departamento = new Departamento("T.I");
        Trabalhador [] trabalhadores = {trabalhador,trabalhador2,trabalhador3};

        trabalhador.imprime();

        departamento.setFuncionario(trabalhadores);
        departamento.imprime();

        departamento.folhaDePagamento();


    }
}
