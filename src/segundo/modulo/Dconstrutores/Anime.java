package segundo.modulo.Dconstrutores;



public class Anime {
    private String nome;
    private int pagina;
    private String genero;

    {

    }



    public Anime(String nome, int paginas) {

        this.nome = nome;
        this.pagina = paginas;

    }

    public Anime(String nome, int paginas,String genero) {
        this(nome, paginas);
        this.genero = genero;
    }
    public void imprimi(){
        System.out.println("Nome: " +nome + "\nPagina:  " + pagina + "\nGenero: "+ genero);
    }


}
