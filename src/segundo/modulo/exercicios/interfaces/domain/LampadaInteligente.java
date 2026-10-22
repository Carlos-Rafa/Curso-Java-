package segundo.modulo.exercicios.interfaces.domain;

public class LampadaInteligente implements Conectavel {
    public String comodo;
    public boolean ligado;

    public LampadaInteligente(String comodo, boolean ligado) {
        this.comodo = comodo;
        this.ligado = ligado;
    }

    @Override
    public void conectarWifi(){
        System.out.println("CONECTANDO WIFI");
    }

    public void status(){
        System.out.println("Comodo: "  + comodo );
        System.out.println(ligado ? "Lampada ligada" : "Lambada desligada");


    }

}
