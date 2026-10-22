package segundo.modulo.exercicios.interfaces.domain;

public interface DataBaseLoader {


    void imprime();

    default void checkpermission(){
        System.out.println("CHECKING PERMISSION");
    }

}
