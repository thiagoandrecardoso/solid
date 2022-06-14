package ISP.impl;

import ISP.interfaces.ICalculadorDeImposto;
import ISP.interfaces.IGeradorDeNota;
import ISP.model.NotaFiscal;

public class ISS implements ICalculadorDeImposto, IGeradorDeNota {

    @Override
    public double imposto(double valorCheio) {
        return 0;
    }

    @Override
    public NotaFiscal geraNota() {
        return null;
    }
}
