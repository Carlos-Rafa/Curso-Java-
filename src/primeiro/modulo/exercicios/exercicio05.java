package primeiro.modulo.exercicios;

import java.sql.SQLOutput;
import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {

/**

        Scanner sc =new Scanner(System.in);

        System.out.print("Informe a sua idade: ");
        int idade = sc.nextInt();

        boolean isCategoriaInfantil = idade < 15;
        boolean isCategoriaJuvenil = idade >= 15 && idade < 18;

        if (isCategoriaInfantil){
            System.out.println("Sua categoria e infantil ");
        }
        else if (isCategoriaJuvenil){
            System.out.println("Sua categoria e Juvenil ");
        }
        else  {
            System.out.println("Sua categoria e Adulto");
        }
**/

        //Faixa 1: R$ 4.190,84 a R$ 8.157,41: 14%
        //Faixa 2: R$ 3.751,06 a R$ 4.664,68: 22,5%
        // Faixa 3: R$ 0,00 a R$ 3.750,00: 0%

        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o valor do seu salario: ");
        int Salario = sc.nextInt();
        boolean istaxa = Salario > 0 && Salario <= 3.750 ;
        boolean istaxa2 = Salario >= 3.751 && Salario <= 4.664;
        boolean istaxa3 = Salario >= 4.190 && Salario <= 8.157;
        float ValorAnual = Salario * 12;
        System.out.format("O valor anual do seu salario é R$: %.2f",ValorAnual);
        if (istaxa){
            System.out.println(", Você pagar 0% de imposto");
        } else if (istaxa2){
            System.out.println(", Você pagar 22,5% de imposto");
        }else {
            System.out.println(", Você pagar 14% de imposto");
        }
    }
}