public class Pedido {
    public double percentualDesconto;
    public ItemPedido[] itens;

    public Pedido(double percentualDesconto, ItemPedido[] itens) {
        this.percentualDesconto = percentualDesconto;
        this.itens = itens;
    }

    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < itens.length; i++) {
            total += itens[i].getQuantidade() * itens[i].getProduto().obterPrecoLiquido();
        }
        total = percentualDesconto > 0 ? total - (total * (percentualDesconto / 100)) : total;
        return total;
    }
}