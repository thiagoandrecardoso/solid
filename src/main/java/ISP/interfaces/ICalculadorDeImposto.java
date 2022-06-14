package ISP.interfaces;

import ISP.model.NotaFiscal;

public interface ICalculadorDeImposto {
    double imposto(double valorCheio);
    double calcula(NotaFiscal nf);
}
