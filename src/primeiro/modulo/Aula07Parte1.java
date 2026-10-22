package primeiro.modulo;

import java.util.Scanner;
//Aulas de arrays
public class Aula07Parte1 {
    public static void main(String[] args) {
        int [] n = new int[3];
        n [0]= 1;


        //Aulas de arrays pt2
        int [] idade ;
        idade = new int[3];
        idade [0]= 1;


        //Aulas de arrays pt2
        int[] numeros = {1,2,3,4,5};
        int[] numeros2 = new int[]{1,2,3,4,5};
        int nota= 0;
        while(numeros2.length > nota){
            System.out.println(numeros2[nota]);
            nota++;
        }


        String [] nome= new String[3];
        nome [0] = "Rafael";
        nome [1] = "Talita";
        nome [2] = "Everaldo";


        for (String i:nome){
            System.out.println(i);
        }
    }
}