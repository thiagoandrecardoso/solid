package DIP.bad_example;

public class GeradorDeNotaFiscal {

    private final EnviardorDeEmail email;
    private final NotaFiscalDao dao;

    public GeradorDeNotaFiscal(EnviardorDeEmail email, NotaFiscalDao dao) {
        this.email = email;
        this.dao = dao;
    }

    public Invoice gera(CommercialInvoice fatura) {
        double valor = fatura.getValorMensal();

        Invoice nf = new Invoice(
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
