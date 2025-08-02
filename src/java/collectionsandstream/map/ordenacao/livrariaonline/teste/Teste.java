package java.collectionsandstream.map.ordenacao.livrariaonline.teste;

import java.collectionsandstream.map.ordenacao.livrariaonline.dominio.LivrariaOnline;

public class Teste {
    public static void main(String[] args) {
        LivrariaOnline livrariaOnline = new LivrariaOnline();

        livrariaOnline.adicionar("123", "Algoritmos", "Gustavo", 20.99);
        livrariaOnline.adicionar("125", "Estruturas de dados", "Isidro", 25.99);
        livrariaOnline.adicionar("127", "Clean Code", "Albert", 110.99);
        livrariaOnline.adicionar("122", "Entendendo Java", "DIO", 50.25);
        livrariaOnline.adicionar("121", "Python", "Victor", 50.26);
        livrariaOnline.adicionar("126", "Desenvolvedor Web", "Curso em video", 120.29);

        livrariaOnline.exibirPorPreco();
    }
}
