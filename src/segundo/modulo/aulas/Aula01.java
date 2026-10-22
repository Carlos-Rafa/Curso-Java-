package segundo.modulo.aulas;
import segundo.modulo.aulas.dominio.Aluno;
import java.util.Scanner;

//Introduçao a orientacao a objetos
public class Aula01 {
    public static void main(String[] args) {

        Aluno p1 = new Aluno();

        Scanner sc =new Scanner(System.in);
        System.out.print("Digite seu nome:  ");
        String nome = sc.next();
        p1.nome = nome;
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        p1.idade = idade;
        System.out.print("Digite seu sexo: ");
        char sexo = sc.next().charAt(0);
        p1.sexo = sexo;

        System.out.println("Nome: " + p1.nome);
        System.out.println("Idade: " + p1.idade);
        System.out.println("sexo: " + p1.sexo);

    }


}
