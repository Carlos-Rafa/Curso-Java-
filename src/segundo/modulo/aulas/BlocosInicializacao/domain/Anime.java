package segundo.modulo.aulas.BlocosInicializacao.domain;
//60 - Orientação Objetos - Blocos de inicialização

public class Anime {
    String nome;
    int [] episodios ;

    {
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }

        for (int episodios : this.episodios) {
            System.out.println(episodios);
        }


    }


    public Anime() {
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }


}
