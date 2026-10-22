package primeiro.modulo;

public class Aula08 {
    public static void main(String[] args) {
        //Arrays Miltidimensionais
        int[][] n = new  int[3][3];

        n[0][0] = 1;
        n[0][1] = 2;
        n[0][2] = 3;

        n[1][0] = 4;
        n[1][1] = 5;
        n[1][2] = 6;

        n[2][0] = 7;
        n[2][1] = 8;
        n[2][2] = 9;

       for(int[] i:n){
           for(int j:i){
               System.out.println(j);
           }
       }

    }
}
