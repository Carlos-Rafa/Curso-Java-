package segundo.modulo.aulas.Polimorifsmo.servico;

import segundo.modulo.aulas.Polimorifsmo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando na Memoria");
    }
}
