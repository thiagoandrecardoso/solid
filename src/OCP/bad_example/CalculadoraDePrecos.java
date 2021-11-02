package OCP.bad_example;

import OCP.model.Compra;
import OCP.model.Frete;

public class CalculadoraDePrecos {
    /*
    O problema se da quando fomos ter diferentes regras para os descontos
    teriamos que ter varios IF's, mesmo eles estando dentros das classes corretas
    Exemplo: varios if para regras diferentes dentro da classe Frete.
     */

    public double calcula(Compra produto) {
        TabelaDePrecoPadrao tabela = new TabelaDePrecoPadrao();
        Frete correios = new Frete();

        double desconto = tabela.descontoPara(produto.getValor());
        double frete = correios.para(produto.getCindade());

        return produto.getValor() * (1 - desconto) + frete;
    }
}
