package segundo.modulo.aulas;

import segundo.modulo.Assosicao.dominio.Jogador;


import java.util.Scanner;

public class Aula16 {
    public static void main(String[] args) {
        //Aula  64 - Orientação Objetos - Associação pt 01 - Arrays com Objetos

        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String n1 = input.nextLine();
        System.out.println("Digite seu nome: ");
        String n2 = input.nextLine();
        System.out.println("Digite seu nome: ");
        String n3 = input.nextLine();

        Jogador jogador = new Jogador(n1);
        Jogador jogador2 = new Jogador(n2);
        Jogador jogador3 = new Jogador(n3);

        Jogador[] jogadores = {jogador, jogador2, jogador3};

        for (Jogador i : jogadores) {
            i.imprime();
        }


    }
}
