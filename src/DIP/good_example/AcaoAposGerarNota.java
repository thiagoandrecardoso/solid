package DIP.good_example;

import DIP.bad_example.NotaFiscal;

public interface AcaoAposGerarNota {
    void executa(NotaFiscal nf);
}
