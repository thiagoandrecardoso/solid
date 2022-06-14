package ISP.impl;

import ISP.interfaces.ICalculadorDeImposto;
import ISP.interfaces.IGeradorDeNota;
import ISP.model.Item;
import ISP.model.NotaFiscal;

public class ISS implements ICalculadorDeImposto, IGeradorDeNota {

    @Override
    public double imposto(double valorCheio) {
        return 0;
    }

    @Override
    public double calcula(NotaFiscal nf) {
        double total = 0;
        for (Item item : nf.getItems()) {
            if (item.getValor() > 1000) {
                total += item.getValor() * 0.02;
            } else {
                total += item.getValor() * 0.01;
            }
        }
        return total;
    }

    @Override
    public NotaFiscal geraNota() {
        return null;
    }
}
