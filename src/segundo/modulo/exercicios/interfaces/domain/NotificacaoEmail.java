package segundo.modulo.exercicios.interfaces.domain;

public class NotificacaoEmail implements Notificador{
    public String destinatario;

    public NotificacaoEmail(String destinatario) {
        this.destinatario = destinatario;
    }

    @Override
    public void enviarNotificacao(String mensagem) {
        System.out.println("Mensagem: " + mensagem + "\nEmail enviado para: " + destinatario);
    }
}
