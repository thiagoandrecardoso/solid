package ISP.impl;

import ISP.interfaces.Imposto;
import ISP.model.NotaFiscal;

public class ISS implements Imposto {
    @Override
    public NotaFiscal geraNota() {
        return new NotaFiscal("0001");
    }

    @Override
    public double imposto(double valorCheio) {
        return 0.1 * valorCheio;
    }
}
