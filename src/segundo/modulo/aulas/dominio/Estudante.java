package segundo.modulo.aulas.dominio;


public class Estudante {
        private String name;
        private int idade;
        private char sexo;


    public void Cadastro(String nome, int idade, char sexo) {
        this.name = nome;
        this.idade = idade;
        this.sexo = sexo;

        System.out.println("Cadastro realizado com sucesso!");
    }

    public String imprimirAluno(){
        return  "Nome: " + this.name + "\nIdade: " + this.idade + "\nSexo: " + this.sexo;


    }
}

