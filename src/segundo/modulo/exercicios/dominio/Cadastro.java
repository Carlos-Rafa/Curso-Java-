package segundo.modulo.exercicios.dominio;

public class Cadastro {
    private String modelo;
    private String marca;
    private String ano;
    private String[] Banco;


    public void adicionar(String modelo, String marca, String ano){

        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;

       // System.out.println(modelo + " " + marca + " " + ano);
        for (int i =0; i <this.Banco.length; i++){

        }



    }

    public void ListarCadastro(){
        for(String i:Banco){
            System.out.println(i);
        }
    }


}