package DIP.good.model;

import DIP.good.interfaces.IContato;
import DIP.good.interfaces.IEmail;

public class Email implements IEmail {
    @Override
    public void enviarEmail(IContato cliente, String assunto, String mensagem) {
        System.out.println("E-mail enviado para " + cliente.getNome());
        System.out.println("Assunto: " + assunto);
        System.out.println("Mensagem " + mensagem);
    }
}
