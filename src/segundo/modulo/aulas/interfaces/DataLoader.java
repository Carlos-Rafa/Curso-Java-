package segundo.modulo.aulas.interfaces;

public interface DataLoader {
    void load();

    default void checkPermission(){
        System.out.println("Checking permission");
    }
}
