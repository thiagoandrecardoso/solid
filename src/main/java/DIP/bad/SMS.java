package DIP.bad;

public class SMS {
    public void enviarSMS(Cliente cliente, String mensagem) {
        System.out.println("SMS enviado para " + cliente.getNome());
        System.out.println("Mensagem: " + mensagem);
    }
}
