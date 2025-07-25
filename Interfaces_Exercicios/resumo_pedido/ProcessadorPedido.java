import provedores.ProvedorFrete;

public class ProcessadorPedido {
    public ProvedorFrete provedorFrete;

    public ProcessadorPedido(ProvedorFrete provedorFrete) {
        this.provedorFrete = provedorFrete;
    }

    public void processar(Pedido pedido) {
        pedido.frete = provedorFrete.calcularFrete(pedido.peso, pedido.total);
    }
}