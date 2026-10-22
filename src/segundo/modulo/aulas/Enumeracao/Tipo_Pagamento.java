package segundo.modulo.aulas.Enumeracao;

public enum Tipo_Pagamento {
        CREDITO{
            @Override
            public double calcularDesconto(double valor) {
                return valor*0.05;
            }
        },
        DEBITO{
            @Override
            public double calcularDesconto(double valor) {
                return valor*0.1;
            }
        };

        public abstract double calcularDesconto(double desconto);
    }