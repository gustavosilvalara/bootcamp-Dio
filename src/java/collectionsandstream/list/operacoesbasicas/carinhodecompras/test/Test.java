package java.collectionsandstream.list.operacoesbasicas.carinhodecompras.test;

import java.collectionsandstream.list.operacoesbasicas.carinhodecompras.domain.CarrinhoDeCompras;

public class Test {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Maça", 10.05, 6);
        carrinhoDeCompras.adicionarItem("Azeite", 20.50, 1);
        carrinhoDeCompras.adicionarItem("Computador", 2000.99, 1);
        carrinhoDeCompras.adicionarItem("Mouse", 50.89, 1);
        carrinhoDeCompras.adicionarItem("Mouse", 50.89, 1);
        System.out.println(carrinhoDeCompras.exibirItens());
        System.out.println(carrinhoDeCompras.calcularValorTotal());
        carrinhoDeCompras.removerItem("Mouse");
        System.out.println(carrinhoDeCompras.exibirItens());
        System.out.println(carrinhoDeCompras.calcularValorTotal());
    }
}
