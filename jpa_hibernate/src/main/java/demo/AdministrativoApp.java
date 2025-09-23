package demo;

import entities.Pessoa;
import entities.Produto;
import models.PessoaModel;
import models.ProdutoModel;

import java.util.Date;
import java.util.List;

public class AdministrativoApp {
    public static void main(String[] args) {
        ProdutoModel produtoModel = new ProdutoModel();
        PessoaModel pessoaModel = new PessoaModel();

        Produto p1 = new Produto();
        p1.setNome("TV");
        p1.setPreco(300.0);
        p1.setQuantidade(100);
        p1.setStatus(true);

        // 1) Criando um produto
        produtoModel.create(p1);

        // 2) Buscando todos os produtos na base de dados
        List<Produto> produtos = produtoModel.findAll();
        System.out.println("Qtde de produtos encontrados : " + produtos.size());

        // 3) Criando uma pessoa
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Joao da Silva");
        pessoa.setEmail("joao@example.com");
        pessoa.setIdade(30);
        pessoa.setCpf("000.000.000-00");
        pessoa.setDataNascimento(new Date());
        pessoaModel.create(pessoa);

        // 4) Atualizando produto
        if (!produtos.isEmpty()) {
            Produto toUpdate = produtos.get(0);
            toUpdate.setPreco(350.0);
            produtoModel.update(toUpdate);
        }

        // 5) Listando pessoas
        List<Pessoa> pessoas = pessoaModel.findAll();
        System.out.println("Qtde de pessoas encontradas : " + pessoas.size());

        // 6) Excluindo pessoa (exemplo)
        if (!pessoas.isEmpty()) {
            pessoaModel.delete(pessoas.get(0));
        }

        // 7) Excluindo produto (exemplo)
        produtos = produtoModel.findAll();
        if (!produtos.isEmpty()) {
            produtoModel.delete(produtos.get(0));
        }
    }
}

