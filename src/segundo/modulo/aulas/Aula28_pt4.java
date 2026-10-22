package segundo.modulo.aulas;

import segundo.modulo.aulas.Polimorifsmo.repositorio.Repositorio;
import segundo.modulo.aulas.Polimorifsmo.servico.RepositorioArquivo;
import segundo.modulo.aulas.Polimorifsmo.servico.RepositorioBD;
import segundo.modulo.aulas.Polimorifsmo.servico.RepositorioMemoria;

public class Aula28_pt4 {
    public static void main(String[] args) {
        //Aula Orientação Objetos - Polimorfismo pt 05 - Programação orientada a interface
        Repositorio repositorio = new RepositorioMemoria();

        repositorio.salvar();
    }
}
