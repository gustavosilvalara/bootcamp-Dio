package javas.collectionsandstream.set.ordenacao.cadastrodeprodutos.domain;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    private Set<Produto> produtos;

    public CadastroProdutos() {
        this.produtos = new LinkedHashSet<>();
    }

    public void adicionarProdutos(String nome, long cod, double preco, int quantidade){
        Produto produto = new Produto(nome, cod, preco, quantidade);
        produtos.add(produto);
    }

    public Set<Produto> produtosPorNome(){
        Set<Produto> produtosNome = new TreeSet<>(produtos);
        return produtosNome;
    }

    public Set<Produto> produtosPorPreco(){
        Set<Produto> produtosPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPreco.addAll(produtos);
        return produtosPreco;
    }

    public Set<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(Set<Produto> produtos) {
        this.produtos = produtos;
    }
}

class ComparatorPorPreco implements Comparator<Produto>{

    @Override
    public int compare(Produto p1, Produto p2) {

       return Double.compare(p1.getPreco(), p2.getPreco());
    }
}
