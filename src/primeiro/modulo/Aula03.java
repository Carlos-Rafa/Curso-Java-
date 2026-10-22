package primeiro.modulo;

import java.util.Scanner;

//Tipos de Entrada de dados

public class Aula03 {
    public static void main(String[] args) {
        int idade = 20;
        String valor = Integer.toString(idade); //Transformando um valor int em String

        String id = "20";
        Double valor_id = Double.parseDouble(id);
        System.out.println(valor_id);

        System.out.println("Digite o seu nome: ");
        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();
        System.out.format("É um prazer te conhecer %s" ,nome);
    }
}
