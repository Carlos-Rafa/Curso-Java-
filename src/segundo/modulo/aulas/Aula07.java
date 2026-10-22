package segundo.modulo.aulas;

import segundo.modulo.aulas.dominio.Estudante;

public class Aula07 {
    public static void main(String[] args) {
        //Aula 49 Orientação Objetos - Parâmetros tipo referência
        Estudante aluno = new Estudante();

        aluno.Cadastro("Rafael", 15,'M');
        String alunos = aluno.imprimirAluno();
        System.out.println("--------------Alunos Cadastrados--------------");
        System.out.println(alunos);
    }
}
