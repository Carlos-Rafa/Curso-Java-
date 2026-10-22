package segundo.modulo.exercicios;

import segundo.modulo.exercicios.dominio.Aluno;
import segundo.modulo.exercicios.dominio.Turma;

public class Exercicio05 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Rafael", 5.0);
        Aluno aluno2 = new Aluno("Arthur", 9.0);
        Turma turma = new Turma("Matematica");

        turma.adicionarAluno(aluno,0);
        turma.adicionarAluno(aluno2,1);

        turma.listarApeovados();

    }

}
