package primeiro.modulo.exercicios;

import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int n1 = sc.nextInt();
        System.out.print("Digite um numero: ");
        int n2 = sc.nextInt();
        System.out.print("Digite um numero: ");
        int n3 = sc.nextInt();
        Integer soma = n1+n2;
        Integer subtrs = n1 - n2;
        Integer Multiplicacao = n1*n2;
        Integer divisao = n1/n2;
        Integer media = (n1+n2+n3)/3;
        Integer resto = (n1+n2)%3;
        //System.out.format("Soma: %d, Subtração: %d, Multiplicacao: %d, Divisao: %d" ,soma,subtrs, Multiplicacao,divisao);
        System.out.format("A media entre esses núumeros e: %d" ,media);
        System.out.format("O resto desses núumeros e: %d" ,resto);

    }
}
