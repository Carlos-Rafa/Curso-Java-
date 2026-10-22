package segundo.modulo.exercicios.dominio.Enumeracao;

public enum TipoCliente {
    Pessoa_Fisica(1,"Pessoa Fisica"),
    Pessoa_Juridica(2, "Pessoa Juridica");

    private final int VALOR;
    private String tipo_cliente;

    TipoCliente(int valor,String tipo_cliente) {
        this.tipo_cliente = tipo_cliente;
        this.VALOR = valor;
    }

    public int getVALOR() {
        return VALOR;
    }

    public String getTipo_cliente() {
        return tipo_cliente;
    }
}
