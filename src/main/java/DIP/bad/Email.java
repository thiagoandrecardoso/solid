package DIP.bad;

public class Email {
    public void enviarEmail(Cliente cliente, String assunto, String mensagem) {
        System.out.println("E-mail enviado para " + cliente.getNome());
        System.out.println("Assunto: " + assunto);
        System.out.println("Mensagem " + mensagem);
    }
}
