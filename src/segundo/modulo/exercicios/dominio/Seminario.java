package segundo.modulo.exercicios.dominio;

public class Seminario {
    private String titulo;
    private Aluno01[] alunos;
    private Local local;

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public void imprime() {
        System.out.println("-----------Classe Seminario-----------");
        System.out.println("Titulo do Seminario: " + titulo);

        if (local == null) return;
        System.out.println("Endereço: " + local.getEndereco());
        System.out.println("Alunos Cadastrados: ");
        if (alunos != null && alunos.length > 0) {
            for (Aluno01 aluno : this.alunos) {
                System.out.println("- " + aluno.getNome());
            }
        } else {
            System.out.println("Nenhum Aluno Cadastrado");
        }
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Aluno01[] getAluno() {
        return alunos;
    }

    public void setAluno(Aluno01[] aluno) {
        this.alunos = aluno;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
