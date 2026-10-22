package segundo.modulo.exercicios.interfaces.domain;

public class NotificacaoSMS implements Notificador {
    public int numero;

    public NotificacaoSMS(int numero) {
        this.numero = numero;
    }

    @Override
    public void enviarNotificacao(String mensagem) {
        System.out.println("Mensagem: " + mensagem + "\nSMS enviado para: " + numero);

    }
}
