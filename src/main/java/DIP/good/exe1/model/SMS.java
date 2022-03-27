package DIP.good.exe1.model;

import DIP.good.exe1.interfaces.IContato;
import DIP.good.exe1.interfaces.IMensagemCelular;

public class SMS implements IMensagemCelular {
    @Override
    public void enviarMensagemCelular(IContato cliente, String mensagem) {
        System.out.println("SMS enviado para " + cliente.getNome());
        System.out.println("Mensagem: " + mensagem);
    }
}
