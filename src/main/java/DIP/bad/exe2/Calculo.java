package DIP.bad.exe2;

public class Calculo {
    public float calcularPrecoPedido(int pedidoId) {
        Produto produto = new Produto();
        int[] listaDeProdutos = produto.obterProdutos(pedidoId);
        return 679;
    }
}
