package ISP.interfaces;

import ISP.model.NotaFiscal;

public interface Imposto {
    NotaFiscal geraNota();
    double imposto(double valorCheio);
}
