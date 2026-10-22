package segundo.modulo.aulas.dominio;

//Aula 54 - Modificador de acesso private
public class Pessoa {
    private String nome;
    private int idade;

    public void setNome(String nome){
        this.nome = nome.trim(); //Essa funcao e pra tirar o espaço extra
    }
    public void setIdade(int idade){
        this.idade = idade;
    }

    public String getNome(){
        return  this.nome;
    }

    public int getIdade(){
        return this.idade;
    }
}
