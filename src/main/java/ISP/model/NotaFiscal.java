package ISP.model;

import DIP.good.exe1.model.Cliente;

import java.util.List;

public class NotaFiscal {
    private Cliente cliente;
    private List<Item> items;
    private List<Descontos> descontos;
    private Endereco entrega;
    private Endereco cobranca;
    private FormaDePagamento pagamento;
    private double valorTotal;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public List<Descontos> getDescontos() {
        return descontos;
    }

    public void setDescontos(List<Descontos> descontos) {
        this.descontos = descontos;
    }

    public Endereco getEntrega() {
        return entrega;
    }

    public void setEntrega(Endereco entrega) {
        this.entrega = entrega;
    }

    public Endereco getCobranca() {
        return cobranca;
    }

    public void setCobranca(Endereco cobranca) {
        this.cobranca = cobranca;
    }

    public FormaDePagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(FormaDePagamento pagamento) {
        this.pagamento = pagamento;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}
