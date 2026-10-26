package projetos.projetotoutube;

import projetos.projetotoutube.dominio.Gafanhoto;
import projetos.projetotoutube.dominio.Video;
import projetos.projetotoutube.dominio.Vizulizacao;

public class principal {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        Gafanhoto g[] = new Gafanhoto[2];


        v[0] = new Video("Aula JAVA POO");
        v[1] = new Video("Aula Spring Boot");
        v[2] = new Video("Aula Python");

        g[0] = new Gafanhoto("Rafael",24, 'M',"Rafinha");
        g[1] = new Gafanhoto("Arthur",17, 'M',"Rei_Arthur");

        //System.out.println(v[0].toString());
        //System.out.println(g[0].toString());

        Vizulizacao viz = new Vizulizacao(g[0],v[0]);
        System.out.println(viz.toString());
    }
}
