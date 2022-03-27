package DIP.bad;

public class DIPTest {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Thiago", "thi@icloud.com", "99273805");

        Email email = new Email();
        email.enviarEmail(cliente, "Fatura", "Sua fatura chegou!");

        SMS sms = new SMS();
        sms.enviarSMS(cliente, "Mensagem não lida!");
    }
}
