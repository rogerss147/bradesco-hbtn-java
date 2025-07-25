
import produtos.Produto;

public class ItemPedido {
    private Produto produto;
    private int quantidade;

    public ItemPedido(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {

        return String.format("Tipo: %s  Titulo: %s  " +
                "Preco: %.2f  " +
                "Quant: %d  " +
                "Total: %.2f", this.getProduto().tipo(), this.getProduto().getTitulo(),
                this.getProduto().obterPrecoLiquido(), this.getQuantidade(),
                this.getProduto().obterPrecoLiquido() * this.getQuantidade());
    }
}