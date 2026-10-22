package segundo.modulo.exercicios.polimorfismo.dominio;

public class Cachorro extends Lobo {

    public Cachorro(String corPelo, double peso, int idade, int membros) {
        super(corPelo, peso, idade, membros);
    }

    public void reagir(String frase) {
        if (frase == "Toma Comdida" || frase == "Ola") {
            System.out.println("Cachorro abanando o rabo e latindo");
        } else {
            System.out.println("Cachorro rosnando");
        }
    }

    public void reagir(int hora) {
        if (hora < 12) {
            System.out.println("Cachorro abanando o rabo");
        }
        if (hora >= 18) {
            System.out.println("Cachorro Ignorando");
        } else {
            System.out.println("Cachorro rosnando");
        }
    }

    public void reagir(boolean dono) {
        if (dono) {
            System.out.println("Cachorro abanando o rabo e latindo");
        } else {
            System.out.println("Cachorro rosnando");
        }
    }


}
