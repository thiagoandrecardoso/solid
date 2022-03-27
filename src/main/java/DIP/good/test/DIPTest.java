package DIP.good.test;

import DIP.good.factory.Factory;
import DIP.good.interfaces.IContato;
import DIP.good.interfaces.IEmail;
import DIP.good.interfaces.IMensagemCelular;

public class DIPTest {
    public static void main(String[] args) {
        IContato cliente = Factory.getCliente();
        cliente.setNome("Thiago");
        cliente.setEmail("thi@gmail.com");
        cliente.setCelular("99220099");

        IEmail email = Factory.getEmail();
        email.enviarEmail(cliente, "Fatura", "Sua fatura chegou!");

        IMensagemCelular sms = Factory.getMensageiroCelular();
        sms.enviarMensagemCelular(cliente, "Mensagem não lida!");
    }
}
