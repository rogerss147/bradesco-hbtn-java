package Heranca_Exercicios.pedido_livraria.produtos;

public class Livro extends Produto {
    public int paginas;
    public String autor;
    public int edicao;

    public Livro(String titulo, int ano, String pais, double precoBruto, int paginas, String autor, int edicao) {
        super(titulo, ano, pais, precoBruto);
        this.paginas = paginas;
        this.autor = autor;
        this.edicao = edicao;
    }

    @Override
    public double obterPrecoLiquido() {
        return this.getPrecoBruto() + (this.getPrecoBruto() * 0.15);
    }

}