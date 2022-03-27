package DIP.bad.exe2;

public class NotaFiscal {

    public void gerarNota(int pedidoId){
        Calculo calculo = new Calculo();
        float precoPedido = calculo.calcularPrecoPedido(pedidoId);
    }

}
