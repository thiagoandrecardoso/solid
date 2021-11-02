package OCP.good_example;

import OCP.model.Compra;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculadoraDePrecoTest {

    @Test
    public void calcula() {
        TabelaDePreco simulaTabela = mock(TabelaDePreco.class);
        ServicoDeEntrega simulaServico = mock(ServicoDeEntrega.class);

        when(simulaTabela.descontoPara(50.0)).thenReturn(5.9);
        when(simulaServico.para("SP")).thenReturn(10.0);

        CalculadoraDePreco calculadoraDePreco = new CalculadoraDePreco(simulaTabela, simulaServico);
        Compra cd = new Compra("SP", 50.0);

        double valor = calculadoraDePreco.calcula(cd);
        assertEquals(57.05, valor, 0.0001);
    }
}