package segundo.modulo.exercicios;

import segundo.modulo.exercicios.dominio.Aluno01;
import segundo.modulo.exercicios.dominio.Local;
import segundo.modulo.exercicios.dominio.Professor;
import segundo.modulo.exercicios.dominio.Seminario;

public class Exercicio09 {
    public static void main(String[] args) {
        Aluno01 aluno = new Aluno01("Josenilton", 22);
        Aluno01 aluno2 = new Aluno01("Rinolvado", 20);
        Aluno01 aluno3 = new Aluno01("Joselita", 15);


        Seminario seminario = new Seminario("Tecnologia");
        Seminario seminario2 = new Seminario("Saude");
        Seminario seminario3 = new Seminario("Engenharia");

        Local local = new Local("Rua Jose visco Pereira");


        Seminario[] seminarios = {seminario, seminario3};
        seminario.setLocal(local);

        Professor professor = new Professor("Elinavilmo", "Falar muito fazer nada", seminarios);
        professor.imprime();

        Aluno01[] alunos = {aluno, aluno2, aluno3};
        seminario.setAluno(alunos);
        aluno.setSeminario(seminario);
        aluno.setSeminario(seminario);
        aluno2.setSeminario(seminario);
        aluno3.setSeminario(seminario);

        seminario.imprime();


    }
}
