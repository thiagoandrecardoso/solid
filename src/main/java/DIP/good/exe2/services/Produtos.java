package DIP.good.exe2.services;

import DIP.good.exe2.interfaces.IProdutos;

public class Produtos implements IProdutos {
    private int pedidoId;

    @Override
    public void setarPedidoID(int id) {
        pedidoId = id;
    }

    @Override
    public int[] obterProdutos() {
        return this.consultarNoBanco(pedidoId);
    }

    private int[] consultarNoBanco(int id){
        // Implementar qualquer rotina de consulta em banco
        return new int[0];
    }
}
