package segundo.modulo.exercicios.dominio.Enumeracao;

public class Cliente extends Pessoa {
    public enum  TipoPagamento{
        DEBITO,
        CREDITO
    }

    private String tipo_cliente;
    TipoCliente tipo;
    TipoPagamento TipoPagamento;


    public Cliente(String nome, int idade, String endereco, String cidade, TipoCliente tc,TipoPagamento tp) {
        super(nome, idade, endereco, cidade);
        this.tipo = tc;
        this.TipoPagamento = tp;

    }

    @Override
    public String toString() {
        return "Cliente\n" +
                "ID: " + tipo.getVALOR() +
                "\nnome: " + this.nome +
                "\nTipo CLinete: " + tipo.getTipo_cliente() +
                "\nIdade: " + this.idade +
                "\nCidade: " + this.cidade +
                "\nRua: " + this.endereco +
                "\nTipo: " + tipo.getVALOR()+
                "\nTipo de Pagamento: " + TipoPagamento;
    }

    public String getTipo_cliente() {
        return tipo_cliente;
    }

    public void setTipo_cliente(String tipo_cliente) {
        this.tipo_cliente = tipo_cliente;
    }
}
