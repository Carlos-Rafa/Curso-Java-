package primeiro.modulo;

import java.util.Scanner;

public class Aula05Parte2 {
    public static void main(String[] args) {
        // Estruturas condicionas com SWITCH
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma data: ");
        int dia = sc.nextInt();
        System.out.print("Essa data é um, ");


        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Data invalida");
        }
    }
}
