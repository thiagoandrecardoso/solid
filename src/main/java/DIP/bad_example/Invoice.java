package DIP.bad_example;

public class Invoice {
    private double imposto;
    private double valor;

    public Invoice(double imposto, double valor) {
        this.imposto = imposto;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "imposto=" + imposto +
                ", valor=" + valor +
                '}';
    }
}
