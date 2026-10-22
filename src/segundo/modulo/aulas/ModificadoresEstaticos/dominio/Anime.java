package segundo.modulo.aulas.ModificadoresEstaticos.dominio;

//Aula 63 Orientação Objetos - Bloco de inicialização estático

public class Anime {
   private String nome;
    public static int []  episodios ;

    static {
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
        System.out.println("Dentro do bloco de inicializacao estatico 1");
    }

    static {
        System.out.println("Dentro do bloco de inicializacao estatico 2");
    }
    static {
        System.out.println("Dentro do bloco de inicializacao estatico 3");
    }
    {
        System.out.println("Dentro do bloco de inicializacao 4");
    }


    public Anime() {
        for (int episodios : Anime.episodios) {
            System.out.print(episodios);
        }
        System.out.println(" ");

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