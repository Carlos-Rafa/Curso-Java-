package projetos.projetotoutube.dominio;

public class Vizulizacao {
    private Gafanhoto espectador;
    private Video video;

    public Vizulizacao(Gafanhoto espectador, Video video) {
        this.espectador = espectador;
        this.video = video;
        espectador.setTotassistindo(this.espectador.getTotassistindo() + 1);
        video.setViews(video.getViews() + 1);
    }

    public void avaliar(){}

    public void avaliar(int nota){}

    public void avaliar(float porc){}

    @Override
    public String toString() {
        return "Vizulizacao{" +
                "espectador=" + espectador +
                ", video=" + video +
                '}';
    }

    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }
}
