package segundo.modulo.aulas;

import segundo.modulo.Assosicao.dominio.Escola;
import segundo.modulo.Assosicao.dominio.Materia;
import segundo.modulo.Assosicao.dominio.Professor;
//Aula 66 - Orientação Objetos - Associação pt 03 - Associação unidirecional muitos para um

public class Aula18 {
    public static void main(String[] args) {

        Materia materia = new Materia("Portugues" );
        Materia materia2 = new Materia("Matematica" );

        Materia[] materias = {materia, materia2};

        Professor  professor = new Professor("Pedro",  materias);
        Professor [] professores = {professor};

        Escola escola = new Escola("Maria Antonieita Joseval Pereira Dos Santos Costa", professores);

        escola.imprime();

    }
}
