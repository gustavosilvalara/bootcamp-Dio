package Java.collectionsandstream.list.ordenacao.ordenacaodepessoas.teste;

import Java.collectionsandstream.list.ordenacao.ordenacaodepessoas.dominio.OrdenacaoPessoas;

public class Teste {
    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
        ordenacaoPessoas.adicionarPessoa("Gustavo", 19, 1.76);
        ordenacaoPessoas.adicionarPessoa("Jão", 18, 1.75);
        System.out.println(ordenacaoPessoas);
    }
}
