package primeiro.modulo.exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = teclado.nextLine();

        System.out.println("Digite seu endereço: ");
        String endereco = teclado.nextLine();

        System.out.println("Digite a data que voce recebe salario:");
        String dataRecebimentoSalario = teclado.nextLine();

        System.out.println("Digite seu salario: ");
        float salario = teclado.nextFloat();




        System.out.format("Eu %s, morando no %s " ,nome, endereco);
        System.out.format("confirmo que recebe o sálario de R$: %.2f, na data: %s" ,salario, dataRecebimentoSalario);
    }
}
