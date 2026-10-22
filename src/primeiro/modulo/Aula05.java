package primeiro.modulo;

import java.util.Scanner;

public class Aula05 {
    public static void main(String[] args) {
        //Estruturas Condionais

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a sua nota: ");
        float nota = sc.nextFloat();

        System.out.print("Digite sua segunda nota: ");
        float nota2 = sc.nextFloat();

        System.out.print("Digite sua terceira nota: ");
        float nota3 = sc.nextFloat();

        float media = (nota + nota2 + nota3)/3;
        boolean isResultado = media >= 7;
        boolean isRecuperacao = media < 7  && media >= 3;

        if(isResultado){
            System.out.println("Parabens voce passou!!");

        }
        if(isRecuperacao){
            System.out.println("Voce esta em recuperacao");
        }
        else {
            System.out.println("Voce nao passou =(");

        }
    }
}
