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
        return total;
    }

    public double calcularDesconto() {
        double total = calcularTotal();
        total = percentualDesconto > 0 ? (total * (percentualDesconto / 100)) : percentualDesconto;
        return total;
    }

    public void apresentarResumoPedido() {
        String cabecalho = "------- RESUMO PEDIDO -------";
        String separador = "----------------------------";
        String desconto = String.format("DESCONTO: %.2f", (this.calcularDesconto()));
        String totalProdutos = String.format("TOTAL PRODUTOS: %.2f", (this.calcularTotal()));
        String totalPedido = String.format("TOTAL PEDIDO: %.2f", (this.calcularTotal() - this.calcularDesconto()));
        System.out.println(cabecalho);
        for (int i = 0; i < itens.length; i++) {
            System.out.println(itens[i].toString());
        }
        System.out.println(separador + "\n" +
                desconto + "\n" +
                totalProdutos + "\n" +
                separador + "\n" +
                totalPedido + "\n" + separador);

    }
}