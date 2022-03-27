package DIP.good.exe2.services;

import DIP.good.exe2.interfaces.ICalculo;
import DIP.good.exe2.interfaces.IProdutos;

public class Calculo implements ICalculo {
    private IProdutos produtos;

    public Calculo(IProdutos produtos) {
        this.produtos = produtos;
    }

    @Override
    public void calcularPrecoPedido() {

    }

    @Override
    public float total() {
        int[] list = produtos.obterProdutos();
        return 0;
    }
}
