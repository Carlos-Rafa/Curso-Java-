package segundo.modulo.exercicios.interfaces.domain;

public interface Conectavel {

    void conectarWifi();

    default void verificarConcexao(){
        System.out.println("Verificando conexãao de rede");

    }
}
