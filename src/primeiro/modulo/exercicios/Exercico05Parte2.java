package primeiro.modulo.exercicios;

import java.util.Scanner;

public class Exercico05Parte2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe uma data de 1 a 7: ");
        byte data =  sc.nextByte();

        switch (data) {
            case 1:
                System.out.println("Doimgo não é um dia util");
                break;
            case 2:
                System.out.println("Sabado não é um dia util");
                break;
            case 3:
                System.out.println("Segunda É um dia util");
                break;
            case 4:
                System.out.println("Terça É um dia util");
                break;
            case 5:
                System.out.println("Quarta É um dia util");
                break;
            case 6:
                System.out.println("Quinta É um dia util");
                break;
            case 7:
                System.out.println("Sexta É um dia util");
                break;
            default:
                System.out.println("Data Invalida");

        }
    }
}
