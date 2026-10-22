package segundo.modulo.exercicios.dominio;

public class Casa {
    Comodo[] comodo = new Comodo[3];

    public void adicionarComodo(Comodo c, int posicao ){
        comodo[posicao] = c ;
    }

    public void calcularAreaTotal(){
        double total =0 ;
        for(Comodo i : comodo){

            total += i.getAreaM2();
        }
        System.out.format("A doma de total de todos os comodos cadastrado é de %.2f " ,total);
    }
}
