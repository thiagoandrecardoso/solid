package DIP.bad_example;

public class GeradorDeNotaFiscal {

    private final EnviardorDeEmail email;
    private final NotaFiscalDao dao;

    public GeradorDeNotaFiscal(EnviardorDeEmail email, NotaFiscalDao dao) {
        this.email = email;
        this.dao = dao;
    }

    public NotaFiscal gera(Fatura fatura) {
        double valor = fatura.getValorMensal();

        NotaFiscal nf = new NotaFiscal(
                valor,
                impostoSimplesSobreO(valor)
        );

        email.enviaEmail(nf);
        dao.persiste(nf);

        return nf;
    }

    private double impostoSimplesSobreO(double valor) {
        return valor * 0.08;
    }
}
