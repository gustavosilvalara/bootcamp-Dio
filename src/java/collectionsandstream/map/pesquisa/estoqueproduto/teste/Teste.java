package java.collectionsandstream.map.pesquisa.estoqueproduto.teste;

import java.collectionsandstream.map.pesquisa.estoqueproduto.dominio.EstoqueProdutos;

public class Teste {
    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.adicionarProduto(1, "mouse", 200, 100.50);
        estoqueProdutos.adicionarProduto(2, "lousa", 100, 200.50);
        estoqueProdutos.adicionarProduto(3, "controle de xbox", 150, 80.59);
        estoqueProdutos.adicionarProduto(4, "mouse pad", 50, 110.99);

        System.out.println(estoqueProdutos.exibirProdutos());
        System.out.println(estoqueProdutos.calcularValorTotalEstoque());
        System.out.println(estoqueProdutos.obterProdutoMaisBarato());
        System.out.println(estoqueProdutos.obterProdutoMaisCaro());
        System.out.println(estoqueProdutos.obterProdutoMaiorQuantidadeValorTotalNoEstoque());

    }
}
