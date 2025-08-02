package java.collectionsandstream.set.ordenacao.cadastrodeprodutos.teste;

import java.collectionsandstream.set.ordenacao.cadastrodeprodutos.domain.CadastroProdutos;

public class Teste {
    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProdutos("Maca", 1, 20.50, 50);
        cadastroProdutos.adicionarProdutos("Lavadoura", 2, 1000.50, 1);
        cadastroProdutos.adicionarProdutos("Notebook Amd", 65, 2519.90, 1);
        cadastroProdutos.adicionarProdutos("Controle", 3, 100.50, 1);
        cadastroProdutos.adicionarProdutos("MousePad Ace Fallen", 4, 110.50, 1);
        cadastroProdutos.adicionarProdutos("Oculos", 6, 2000, 1);
        cadastroProdutos.adicionarProdutos("Bolacha", 7, 5.50, 1);

        System.out.println(cadastroProdutos.produtosPorNome());
        System.out.println(cadastroProdutos.produtosPorPreco());
    }
}
