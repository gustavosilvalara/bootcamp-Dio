package Java.collectionsandstream.operacoesbasicascomlist.carinhodecompras.domain;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private final List<Item> carrinho = new ArrayList<>();

    public void adicionarItem (String nome, double preco, int quantidade){
        Item item = new Item(nome, preco, quantidade);
        carrinho.add(item);
    }

    public void removerItem(String nome){
        carrinho.removeIf(item1 -> item1.name().equalsIgnoreCase(nome));
    }

    public double calcularValorTotal(){
        double preco = 0;
        for (Item item1 : carrinho) {
            preco += item1.preco();
        }
        return preco;
    }

    public String exibirItens(){
        return carrinho.toString();
    }

}
