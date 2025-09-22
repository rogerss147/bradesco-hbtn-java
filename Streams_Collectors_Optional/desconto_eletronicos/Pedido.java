import java.util.List;

public class Pedido {
    private Integer codigo;
    private List<Produto> produtos;
    private Cliente cliente;

    public Pedido(Integer codigo, List<Produto> produtos, Cliente cliente) {
        this.codigo = codigo;
        this.produtos = produtos;
        this.cliente = cliente;
    }

    // Getters e Setters
    public Integer getCodigo() {
        return codigo;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public String toString() {
        return String.format("[%d] %s", codigo, cliente.getNome());
    }
}