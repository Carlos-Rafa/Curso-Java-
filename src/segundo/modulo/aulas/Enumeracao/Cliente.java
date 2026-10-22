package segundo.modulo.aulas.Enumeracao;

public class Cliente {

    private String nome;
    Tipo_Cliente tipo;
    Tipo_Pagamento tipoPagamento;


    public Cliente(String nome, Tipo_Cliente tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public Cliente(String nome, Tipo_Cliente tipo, Tipo_Pagamento tipoPagamento) {
        this.nome = nome;
        this.tipo = tipo;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente\n" +
                "ID: " + tipo.getVALOR() +
                "\nnome: " + nome +
                "\nTipo: " + tipo.getNomeRelatorio() +
                "\nTipo de Pagamento: " + tipoPagamento  ;
    }

    public Tipo_Pagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(Tipo_Pagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Tipo_Cliente getTipo() {
        return tipo;
    }

    public void setTipo(Tipo_Cliente tipo) {
        this.tipo = tipo;
    }
}
