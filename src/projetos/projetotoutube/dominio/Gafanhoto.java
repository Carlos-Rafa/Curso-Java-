package projetos.projetotoutube.dominio;

public class Gafanhoto extends Pessoa {
    private String login;
    private int totassistindo;

    public Gafanhoto(String nome, int idade, char sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totassistindo = 0;
    }

    @Override
    public String toString() {
        return "Gafanhoto{" +
                "login='" + login + '\'' +
                ", totassistindo=" + totassistindo +
               "\n" +super.toString() +
                '}';
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotassistindo() {
        return totassistindo;
    }

    public void setTotassistindo(int totassistindo) {
        this.totassistindo = totassistindo;
    }
}
