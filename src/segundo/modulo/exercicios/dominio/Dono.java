package segundo.modulo.exercicios.dominio;

public class Dono {
    private String nome;
    Cachorro [] caes = new Cachorro[3];

    public Dono(String nome) {
        this.nome = nome;
    }

    public void AdotarCachorro(Cachorro c, int posicao){
        caes[posicao] = c;
    }

    public void mostrarCachorro(){
        System.out.println("Dono: " + this.nome);
        for (Cachorro i:caes){
            if (i!= null){
                System.out.println("Nome: " + i.getNome() + "\nRaça: " + i.getRaca());
            }
        }
    }
}
