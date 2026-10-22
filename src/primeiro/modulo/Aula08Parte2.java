package primeiro.modulo;

public class Aula08Parte2 {
    public static void main(String[] args) {
        //Arrays Multidimensionais - Inicialização
        int [][] matriz = new int [3][];
        matriz[0] = new int [2];
        matriz[1] = new int [3];
        matriz[2] = new int []{1,2,3};

        int[][] matriz2 = {{0},{1,2},{1,2,3,4,5,6}};


        for(int[] i:matriz2){
            System.out.println("\n                                                                                                                                                                                                          ------------");
            for (int  j:i){
                System.out.print(j);
            }
        }
    }
}
