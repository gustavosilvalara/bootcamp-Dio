package Java.collectionsandstream.ordenacaoemset.cadastrodeprodutos.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

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
        List<Produto> produtosNome = new ArrayList<>(produtos);
        Collections.sort(produtosNome);
        return new LinkedHashSet<>(produtosNome);
    }

    public Set<Produto> produtosPorPreco(){
        List<Produto> produtosPreco = new ArrayList<>(produtos);
        produtosPreco.sort(new ComparatorPorPreco());
        return new LinkedHashSet<>(produtosPreco);
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
