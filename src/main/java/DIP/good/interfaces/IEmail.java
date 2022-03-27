package DIP.good.interfaces;

public interface IEmail {
    void enviarEmail(IContato cliente, String assunto, String mensagem);
}
