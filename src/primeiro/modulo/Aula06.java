package primeiro.modulo;

import java.util.Scanner;

public class Aula06 {
    public static void main(String[] args) {
      int count = 0;
        while(count <= 3) {
            count++;
            if (count == 7 || count == 5){
                continue;
            }
            System.out.println(count);

            /**
         int n= 0;
         do {
         System.out.println("Dentro do do-while "+ ++n);
         }while(n < 3);}}**/

        /**
        for(int i = 0; i <= 50; i++) {
            if ( i > 25){
                System.out.println(i);
                break;
            }**/
        }
    }
}
