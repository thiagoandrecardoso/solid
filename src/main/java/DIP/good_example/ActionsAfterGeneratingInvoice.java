package DIP.good_example;

import DIP.bad_example.Invoice;

public interface ActionsAfterGeneratingInvoice {
    void execute(Invoice nf);
}
