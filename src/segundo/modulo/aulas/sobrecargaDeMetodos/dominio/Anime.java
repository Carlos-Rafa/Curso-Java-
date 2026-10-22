package segundo.modulo.aulas.sobrecargaDeMetodos.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int paginas;
    private String genero;




    public void init(String nome, String tipo, int paginas) {
        this.nome = nome;
        this.tipo = tipo;
        this.paginas = paginas;
    }

    public void init(String nome, String tipo, int paginas, String genero) {
        this.init(nome, tipo, paginas);
        this.genero = genero;
    }

    public void imprimi(){
        System.out.println("-----------------Iniciando anime-----------------");
        System.out.format("Nome do anime: %s\nTipo: %s\nPaginas: %d \nGenero: %s",  nome.trim(),tipo.trim(),paginas,genero);
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }
}
