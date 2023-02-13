package OCP.good_example;

import OCP.model.Compra;

/*
A classe agora esta aberta para extenssoes
 */
public class CalculadoraDePreco {
    private final TabelaDePreco tabela;
    private final ServicoDeEntrega entrega;

    public CalculadoraDePreco(TabelaDePreco tabela, ServicoDeEntrega entrega) {
        this.tabela = tabela;
        this.entrega = entrega;
    }

    public double calcula(Compra produto){
        double desconto = tabela.descontoPara(produto.getValor());
        double frete = entrega.para(produto.getCindade());

        return produto.getValor() * (1 - (desconto/100)) + frete;
    }
}
