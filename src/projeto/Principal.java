package projeto;

import projeto.dominios.Carro;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        String[] garagem;
        boolean s = false;
        while (s == false) {
            Scanner sc = new Scanner(System.in);


            System.out.println("---------------");
            System.out.println("[1] CADASTRAR\n[2] LISTAR\n[3] EXIT");
            System.out.print("Escolha uma opcao: ");

            int resp = sc.nextInt();

            switch (resp) {
                case 1:

                    System.out.print("Digite a marca do carro: ");
                    String marca = sc.nextLine();

                    System.out.print("Informe o modelo do carro: ");
                    String modelo = sc.nextLine();

                    System.out.print("Informe o ano do carro: ");
                    int ano = sc.nextInt();
                    Carro carro = new Carro(marca,modelo,ano);
                    break;
                case 2:

                    break;
                case 3:
                    s = true;

            }
        }

    }
}

