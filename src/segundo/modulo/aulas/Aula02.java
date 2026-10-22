package segundo.modulo.aulas;

import segundo.modulo.aulas.dominio.Professor;

import java.util.Scanner;

//  Aulas 41 e 43 sobre Classes e Referencia a Objetos
public class Aula02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Professor professor = new Professor();

        System.out.print("Informe o nome do professor(a): ");
        String nome = sc.nextLine();
        professor.nome = nome;

        System.out.print("Digite o sexo do professor(a): ");
        char sexo = sc.next().charAt(0);
        professor.sexo = sexo;

        System.out.print("Informe a idade do professor(a): ");
        int idade = sc.nextInt();
        professor.idade = idade;

        System.out.println("--------------Professor(a)--------------");
        System.out.printf("Nome: %s\nidade: %d\nsexo: %s", nome, idade, sexo);

    }
}
