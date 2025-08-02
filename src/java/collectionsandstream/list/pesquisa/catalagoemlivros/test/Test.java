package java.collectionsandstream.list.pesquisa.catalagoemlivros.test;

import java.collectionsandstream.list.pesquisa.catalagoemlivros.dominio.CatalagoLivros;

public class Test {
    public static void main(String[] args) {
        CatalagoLivros catalagoLivros = new CatalagoLivros();

        catalagoLivros.adicionarLivro("HarryPotter", "Michael", 1999);
        catalagoLivros.adicionarLivro("Estrutura de dados", "Loki", 2010);
        catalagoLivros.adicionarLivro("Life In Life", "Killer", 2000);
        catalagoLivros.adicionarLivro("Algoritmos", "Aditya Y. Nhargava", 2014);
        catalagoLivros.adicionarLivro("Como Treinar seu Dragão", "Gustavo", 2001);

        System.out.println(catalagoLivros.pesquisarPorTitulo("Algoritmos"));
        System.out.println(catalagoLivros.pesquisarPorIntervaloAnos(1999, 2010));
        System.out.println(catalagoLivros.pesquisarPorAutor("Michael"));
    }
}
