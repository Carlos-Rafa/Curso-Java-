package segundo.modulo.exercicios;

import segundo.modulo.exercicios.dominio.Cadastro;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Cadastro cadastro = new Cadastro();


       /** System.out.println("-----------Cadastro de Carro-----------");
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o modelo do carro: ");
        String modelo = input.nextLine();

        System.out.print("Digite o marca do carro: ");
        String marca = input.nextLine();

        System.out.print("Digite o ano do carro: ");
        String ano = input.nextLine();**/

        cadastro.adicionar("Corsa", "Chervolet", "2004");


    }
}
