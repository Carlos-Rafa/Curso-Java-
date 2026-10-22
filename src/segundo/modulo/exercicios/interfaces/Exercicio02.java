package segundo.modulo.exercicios.interfaces;

import segundo.modulo.exercicios.interfaces.domain.NotificacaoEmail;
import segundo.modulo.exercicios.interfaces.domain.NotificacaoSMS;

public class Exercicio02 {
    public static void main(String[] args) {
        NotificacaoEmail m1 = new NotificacaoEmail("Rafael@gmail");
        m1.enviarNotificacao("Hello My friend");
        System.out.println("------------------------------------");
        NotificacaoSMS m2 = new NotificacaoSMS(71458615);
        m2.enviarNotificacao("Hello My friend");


    }
}
