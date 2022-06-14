package ISP.impl;

import ISP.interfaces.ICalculadorDeImposto;
import ISP.model.NotaFiscal;

public class IXMX implements ICalculadorDeImposto {
    @Override
    public double imposto(double valorCheio) {
        return 0;
    }

    @Override
    public double calcula(NotaFiscal nf) {
        return 0;
    }
}
