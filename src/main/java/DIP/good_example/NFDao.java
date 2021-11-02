package DIP.good_example;

import DIP.bad_example.Invoice;

public class NFDao implements ActionsAfterGeneratingInvoice {
    @Override
    public void execute(Invoice invoice) {
        System.out.println("Persisting invoice...");
    }
}
