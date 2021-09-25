package DIP.good_example;

import DIP.bad_example.Fatura;
import DIP.bad_example.NotaFiscal;

import java.util.List;

public class GeradorNotaFilcal {
    private final List<AcaoAposGerarNota> acoes;

    public GeradorNotaFilcal(List<AcaoAposGerarNota> acoes) {
        this.acoes = acoes;
    }

    public NotaFiscal gera(Fatura fatura){
        double valor = fatura.getValorMensal();
        NotaFiscal nf = new NotaFiscal(
                valor, impostoSimplesSobreO(valor)
        );

        for(AcaoAposGerarNota acao : acoes){
            acao.executa(nf);
        }

        return nf;
    }

    private double impostoSimplesSobreO(double valor) {
        return valor * 0.06;
    }
}
