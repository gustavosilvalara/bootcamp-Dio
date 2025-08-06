package javas.collectionsandstream.map.pesquisa.estoqueproduto.dominio;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Long, Produto> estoque;

    public EstoqueProdutos() {
        this.estoque = new HashMap<>();;
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        Produto produto = new Produto(nome, quantidade, preco);
        estoque.put(cod, produto);
    }

    public Map<Long, Produto> exibirProdutos(){
        return estoque;
    }

    public double calcularValorTotalEstoque(){
        double valorTotal = 0;
        for (Produto produto : estoque.values()){
            if (produto.getQuantidade() > 1){
                valorTotal += produto.getPreco() * produto.getQuantidade();
            }else {
                valorTotal += produto.getPreco();
            }
        }
        return valorTotal;
    }

    public double obterProdutoMaisCaro(){
        double maisCaro = 0;
        for (Produto produto : estoque.values()){
            if (produto.getPreco() > maisCaro) maisCaro = produto.getPreco();
        }
        return maisCaro;
    }

    public double obterProdutoMaisBarato(){
        double maisBarato = 9999999;
        for (Produto produto : estoque.values()){
            if (produto.getPreco() < maisBarato) maisBarato = produto.getPreco();
        }
        return maisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque(){
        Produto produtoRetorno = new Produto(null, 0, 0);
        for (Produto produto : estoque.values()){
            if (produto.getQuantidade() > produtoRetorno.getQuantidade()) produtoRetorno = produto;
        }
        produtoRetorno.setPreco(produtoRetorno.getQuantidade() * produtoRetorno.getPreco());
        return produtoRetorno;
    }

    protected Map<Long, Produto> getEstoque() {
        return estoque;
    }

    protected void setEstoque(Map<Long, Produto> estoque) {
        this.estoque = estoque;
    }
}
