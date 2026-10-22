package segundo.modulo.exercicios.dominio;

public class Professor {
    private String nome;
    private String especializacao;
    private Seminario [] seminarios;

    public Professor(String nome, String especializacao, Seminario [] seminarios) {
        this.nome = nome;
        this.especializacao = especializacao;
        this.seminarios = seminarios;
    }

    public void imprime(){
        System.out.println("----------CLASSE PROFESSOR----------");
        System.out.println("Nome do palestrante: " + nome);
        System.out.println("Especializacao: " + especializacao);
        if (seminarios == null) return;
        System.out.println("SEMINARIOS A APRESENTAR:");
        for (Seminario seminario : seminarios) {
            System.out.println("- "+seminario.getTitulo());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }
}
