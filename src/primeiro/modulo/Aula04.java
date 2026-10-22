package primeiro.modulo;

import java.util.Scanner;

public class Aula04 {
    // AULA SOBRE OPERADORES
    public static void main(String[] args) {
        // OPERADORES ARITIMETICOS ( +, -, *, /)
        int n1 = 10;
        int n2 = 20;

        Double resultado = (double) n1/n2;
        System.out.println(resultado);
        System.out.printf("Resultado: %d", n1 + n2);

        //OPERADORES LOGICO (%)
        int resto = 20%10;
        System.out.println(resto);

        //OPERADORES BOLEANOS (<, >, <=, >=, !=, ==)
        boolean isNumber = 10 < 20 ;

       //System.out.println(isNumber);

        //OPERADORES LÓGICOS AND(&&),OR(||), NOT(!)
        int idade = 30 ;
        float salario = 1000.0f;
        boolean isDentroDaLei = idade > 30 && salario >= 4612 ;


        double valorTotalConta = 200;
        double valorTotalConta2 = 10000;
        Integer valorDoPlasytation =5000;
        boolean isPlayCinco = valorTotalConta > valorDoPlasytation || valorTotalConta2 > valorDoPlasytation ;


        //OPERADORES DE ATRIBUIÇÃO (+=, -=, *=, /=, %=)
        int valor = 1 ;
        valor += 1;
        valor -= 1;
        valor *= 1;
        valor /= 1;
        valor %= 1;
        System.out.println(valor);

        //OPERADORES TERNARIOS
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um núumero: ");
        int n = sc.nextInt();
        String isNumberPar = n % 2 == 0? "Esse numero e par": "Esse numero e impar";
        System.out.println(isNumberPar);

    }
}
