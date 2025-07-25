import provedores.Frete;

public class Pedido {
    public int codigo;
    public double peso;
    public double total;
    public Frete frete;

    public Pedido(int codigo, double peso, double total) {
        this.codigo = codigo;
        this.peso = peso;
        this.total = total;
    }

    public Frete getFrete() {
        return frete;
    }
}