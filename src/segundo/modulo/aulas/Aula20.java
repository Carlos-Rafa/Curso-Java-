package segundo.modulo.aulas;

import java.util.Scanner;

public class Aula20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Infrome seu Sexo [M/F]: ");
        char sexo = sc.next().charAt(0);
        System.out.format("Seja Bem-vindo Senhor(a) %s, do sexo %c",  nome , sexo);
    }
}
