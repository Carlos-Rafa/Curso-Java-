package segundo.modulo.aulas.interfaces;

public class DataLoad implements DataLoader,RemoveLoader {

    @Override
    public void load() {
        System.out.println("Carregando dados do BD");
    }

    @Override
    public void remove() {
        System.out.println("Removendo Dados");
    }
}
