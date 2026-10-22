package segundo.modulo.Assosicao.dominio;

public class Escola {
    private String nome;
    Professor[] professores;


    public Escola(String nome, Professor[] professores) {
        this.nome = nome;
        this.professores = professores;

    }

    public void imprime() {
        System.out.println("----------Escola---------- ");
        System.out.println(this.nome);
        if (professores != null) {
            System.out.println("----------Professor---------- ");
            for (Professor i : professores) {
                System.out.println("Professor: " + i.getNome());
                if (i.getMaterias() != null) {
                    System.out.println("----------Materia---------- ");
                    for (Materia m : i.getMaterias()) {
                        System.out.println("Materia: " + m.getNome());

                    }
                }
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
