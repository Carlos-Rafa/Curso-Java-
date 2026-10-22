package segundo.modulo.aulas.sobrecargaDeMetodos.dominio;

import segundo.modulo.aulas.heranca.dominio.Funcionario;
//Aula 75 - Orientação Objetos - Herança pt 05 - Sequência de inicialização

public class Aula22 {
    public static void main(String[] args) {
        //0 - Bloco de Inicialização estático da superclasse é executado quando a JVM carregar a superclasse
        //1 - Bloco de Inicialização estático da subclasse é executado quando a JVM carregar a subclasse
        //2 - Alocando espaço de memoria pro objeto da superclasse
        //3 - Cada atributo da classe pai é criado e inicializado com default ou o que for passado
        //4 - Bloco de inicialização da superclasse é executado na ordem em que aparece
        //5 - Construtor da superclasse é executado
        //6 - Alocando espaço de memoria pro objeto da subclasse
        //7 - Cada atributo da subclasse é criado e inicializado com default ou o que for passado
        //8 - Bloco de inicialização da subclasse é executado na ordem em que aparece
        //9 - Construtor da subclasse é executado

        Funcionario funcionario = new Funcionario("Fulano");


    }
}
