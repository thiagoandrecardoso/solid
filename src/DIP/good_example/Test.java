package DIP.good_example;

import DIP.bad_example.CommercialInvoice;
import DIP.bad_example.Invoice;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        ActionsAfterGeneratingInvoice mail = new SendMail();
        ActionsAfterGeneratingInvoice dao = new NFDao();
        List<ActionsAfterGeneratingInvoice> actions = new ArrayList<>();
        actions.add(mail);
        actions.add(dao);

        GenerateInvoice generateInvoice = new GenerateInvoice(actions);
        Invoice invoice = generateInvoice.generate(new CommercialInvoice());
    }
}
