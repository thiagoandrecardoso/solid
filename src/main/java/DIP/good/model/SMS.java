package DIP.good.model;

import DIP.good.interfaces.IContato;
import DIP.good.interfaces.IMensagemCelular;

public class SMS implements IMensagemCelular {
    @Override
    public void enviarMensagemCelular(IContato cliente, String mensagem) {
        System.out.println("SMS enviado para " + cliente.getNome());
        System.out.println("Mensagem: " + mensagem);
    }
}
