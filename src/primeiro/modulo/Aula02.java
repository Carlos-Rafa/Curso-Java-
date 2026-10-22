package primeiro.modulo;

//AULA DE TIPOS PRIMITIVOS

import java.util.Scanner;

public class Aula02 {
    public static void main(String[] args) {

        int idade = 10;
        long numeroGrande=100000;
        double salarioDouble = 1500;
        float salarioFloat = 1500;
        byte idadeByte = -128;

        boolean verdadeiro = true;
        boolean falso = false;

        short idadeShort = 20;
        char caracter = 64;
        String nome = "Rafael";

        Scanner scan = new Scanner(System.in);


        System.out.println("Digite seu nome: ");
        String name = scan.nextLine();


        System.out.println("Nome: " + name);
        System.out.println("Idade: " + idade);
        System.out.println(verdadeiro);
        System.out.println(falso);
        System.out.println(caracter);
    }
}
