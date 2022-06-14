package ISP.impl;

import ISP.interfaces.Imposto;
import ISP.model.NotaFiscal;

/*
A classe IXMX nao lanca uma nota fiscal e por isso nao eh necessario
implementar geraNota()
 */
public class IXMX implements Imposto {
    @Override
    public NotaFiscal geraNota() {
        // lanca uma excecao
        return null;
    }

    @Override
    public double imposto(double valorCheio) {
        return 0.2 * valorCheio;
    }
}
