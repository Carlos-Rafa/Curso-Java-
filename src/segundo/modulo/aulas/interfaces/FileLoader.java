package segundo.modulo.aulas.interfaces;

public class FileLoader implements DataLoader, RemoveLoader {
    @Override
    public void remove() {
        System.out.println("Removendo Dados");

    }

    @Override
    public void load() {
        System.out.println("Carregando dados dos Arquivos");
    }

}
