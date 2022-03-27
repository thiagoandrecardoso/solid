package DIP.good.exe1.model;

import DIP.good.exe1.interfaces.IContato;
import DIP.good.exe1.interfaces.IEmail;

public class Email implements IEmail {
    @Override
    public void enviarEmail(IContato cliente, String assunto, String mensagem) {
        System.out.println("E-mail enviado para " + cliente.getNome());
        System.out.println("Assunto: " + assunto);
        System.out.println("Mensagem " + mensagem);
    }
}
