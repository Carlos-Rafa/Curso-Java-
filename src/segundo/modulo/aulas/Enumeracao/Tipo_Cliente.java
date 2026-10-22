package segundo.modulo.aulas.Enumeracao;

public enum Tipo_Cliente {
    Pessoa_Juridica(1, "Pessoa Juridica"),
    Pessoa_Fisica(2, "Pessoa Fisica");

    private final int VALOR;
    private String nomeRelatorio;

    Tipo_Cliente(int valor, String nomeRelatorio) {
        this.VALOR = valor;
        this.nomeRelatorio = nomeRelatorio;

    }

    public static Tipo_Cliente ClienteporRelatorio(String relatorio) {
        for (Tipo_Cliente tipo : values()) {
            if (tipo.getNomeRelatorio().equals(relatorio)) {
                return tipo;
            }
        }
        return null;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }

    public int getVALOR() {
        return VALOR;
    }
}
