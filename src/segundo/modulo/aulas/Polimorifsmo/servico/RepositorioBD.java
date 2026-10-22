package segundo.modulo.aulas.Polimorifsmo.servico;

import segundo.modulo.aulas.Polimorifsmo.repositorio.Repositorio;

public class RepositorioBD implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando no Banco de Dados");
    }
}
