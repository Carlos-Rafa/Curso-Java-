package primeiro.modulo.exercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        /**for(int i =0; i <=10; i++){
            if(i%2==0){
                System.out.println(" O numero " + i + " e par");
            }else{
                System.out.println(" O numero " + i + " e impar");
            }
        }**/
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor do carro que quer comprar: ");
        double valor_total = sc.nextDouble();

        for (int parcela = (int) valor_total; parcela >= 1; parcela--){
            double valor_parcela = valor_total/parcela;
            if (valor_parcela <1000) {
                continue;
            }
            System.out.format("Voce pode parcelar em %d de R$ %.2f" ,parcela,valor_parcela);
            System.out.println(" ");
        }
    }
}
