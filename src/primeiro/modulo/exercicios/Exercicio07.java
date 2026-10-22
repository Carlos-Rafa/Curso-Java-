package primeiro.modulo.exercicios;

import java.util.Arrays;
import java.util.Scanner;


public class Exercicio07 {
    public static void main(String[] args) {

        int [] numeros = new int [3];
        int cont = 0;
        while (cont < 3){
            Scanner sc =new Scanner(System.in);
            System.out.print("Digite um numero: ");
            numeros[cont] = sc.nextInt();
            cont++;
        };

        Arrays.sort(numeros);
        for  (int i:numeros){
            System.out.println(i);
            }
        }
}

