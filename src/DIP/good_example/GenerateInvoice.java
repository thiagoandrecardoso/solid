package DIP.good_example;

import DIP.bad_example.CommercialInvoice;
import DIP.bad_example.Invoice;

import java.util.List;

public class GenerateInvoice {
    private final List<ActionsAfterGeneratingInvoice> actions;

    public GenerateInvoice(List<ActionsAfterGeneratingInvoice> actions) {
        this.actions = actions;
    }

    public Invoice generate(CommercialInvoice commercialInvoice){
        double value = commercialInvoice.getValorMensal();
        Invoice invoice = new Invoice(
                value, impostoSimplesSobreO(value)
        );

        for(ActionsAfterGeneratingInvoice action : actions){
            action.execute(invoice);
        }

        return invoice;
    }

    private double impostoSimplesSobreO(double valor) {
        return valor * 0.06;
    }
}
