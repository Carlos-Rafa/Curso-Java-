package segundo.modulo.exercicios.interfaces.domain;

public class FileLoader implements DataBaseLoader, RemoveLoader {

    @Override
    public void imprime() {
        System.out.println("Buscando Dados dos Arquivos");
    }

    @Override
    public void remove(){
        System.out.println("Removendo Dados dos Arquivos");
    }
}
