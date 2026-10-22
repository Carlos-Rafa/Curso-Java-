package segundo.modulo.exercicios.dominio;

public class Turma {
    private String nomeDaDiciplina;
    Aluno[] alunos = new Aluno[5];

    public Turma(String nomeDaDiciplina) {
        this.nomeDaDiciplina = nomeDaDiciplina;
    }

    public void adicionarAluno(Aluno aluno, int posicao) {
        alunos[posicao] = aluno;
    }

    public void listarApeovados() {
        for (Aluno i : alunos) {
            if (i != null) {

            }
        }
    }
}
