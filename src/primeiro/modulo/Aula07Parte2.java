package primeiro.modulo;

import java.util.Arrays;

import static java.util.Arrays.sort;

public class Aula07Parte2 {
    public static void main(String[] args) {
        //Metodos do Array

        //1 - Metodo Sort
        int[] n = new int[]{3, 2, 1};
       Arrays.sort(n);
      for (int i:n){
          System.out.println(i);
      };

      //2 - Metodo BinarySearch
        int posicao = Arrays.binarySearch(n, 2);
        System.out.println(" ");
        System.out.println("O valor ta na posicao"+ posicao);


        // 3 - Metodo Arrays.fill
        int [] numero = new int[3];
        Arrays.fill(numero,2);
        for(int i:numero){
            System.out.println(i);
        }

    }
}
