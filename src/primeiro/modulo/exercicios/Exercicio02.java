package primeiro.modulo.exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = input.nextLine();

        System.out.print("Informe seu salário: ");
        float salario = input.nextFloat();

        System.out.format("%s tem um salário de %.2f " ,nome, salario);

    }
}
