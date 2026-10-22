package segundo.modulo.exercicios.dominio;

public class Garagem {
    private String endereço;
    Carro[] vagas = new Carro[3];

    public void estacionar(Carro carro) {
        int posicao = 0;
        for (Carro c : vagas ) {
            if (vagas[posicao] == null && carro != vagas[posicao]) {
                vagas[posicao] = carro;

            }else {
                System.out.println("Todas as vagas estap preenchidas");
            }
            posicao++;
        }
    }
    public void mostrarVagas() {
        for (Carro c : vagas) {
            if (c != null) {
                System.out.println(c.placa);
            }
            else {
                System.out.println("Vaga vazia");
            }
        }
    }

}


