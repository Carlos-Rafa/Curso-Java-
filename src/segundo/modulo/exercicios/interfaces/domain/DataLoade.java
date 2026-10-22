package segundo.modulo.exercicios.interfaces.domain;

public class DataLoade implements DataBaseLoader, RemoveLoader {

    @Override
    public void imprime() {
        System.out.println("Buscando Dados do BD");
    }

    @Override
    public void remove(){
        System.out.println("Removendo Dados do BD");
    }
}
