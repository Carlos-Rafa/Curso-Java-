package segundo.modulo.exercicios;


import java.util.Scanner;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void Cadastrar() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a marca do carro: ");
        String marca = sc.nextLine();

        System.out.print("Informe o modelo do carro: ");
        String modelo = sc.nextLine();

        System.out.print("Informe o ano do carro: ");
        int ano = sc.nextInt();



    }

    public void imprime() {

        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
    }
}
