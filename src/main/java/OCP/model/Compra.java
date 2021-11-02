package OCP.model;

public class Compra {
    private double valor;
    private String cindade;

    public Compra(String cidade, double valor) {
        this.valor = valor;
        this.cindade = cidade;
    }

    public String getCindade() {
        return cindade;
    }

    public void setCindade(String cindade) {
        this.cindade = cindade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
