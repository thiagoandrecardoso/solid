package ISP;

import ISP.impl.ISS;
import ISP.model.NotaFiscal;

public class MainTest {
    public static void main(String[] args) {
        ISS iss = new ISS();

        NotaFiscal notaFiscal = new NotaFiscal();

        double total = iss.calcula(notaFiscal);
    }
}
