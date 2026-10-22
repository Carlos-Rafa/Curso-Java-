package primeiro.modulo.exercicios;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        //int[][] matrix = new int[3][3];
        int [][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        /**for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                Scanner input = new Scanner(System.in);
                System.out.print("Digite um valor numerico: ");
                matrix[i][j] = input.nextInt();
            };
        };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }**/

        //Exercicio 04
       /** int soma = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
               if (matrix[i] == matrix[j]){
                   soma = soma +matrix[i][j];

               }
            }

        }
        System.out.println("A soma dos valores da diagonal é: " + soma);
        **/

       //Exercicio 05
        int[][] m = new int[][] {
            {1, 2, 3,4},
            {5, 6,7,8},
            { 9,10,11,12},
            { 13,14,15,16}
        };

        int MaiorValor =0;

        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[i].length; j++){
                MaiorValor = Math.max(MaiorValor, m[i][j]);
            }
        }
        int linha = 0;
        int coluna = 0;
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[i].length; j++){
                if (m[i][j] == MaiorValor){
                    linha = i;
                    coluna = j;
                }
            }
        }
        System.out.printf("O maior valor é %d, e ele ta na linha %d, na coluna %d", MaiorValor,linha,coluna);
    }
}
