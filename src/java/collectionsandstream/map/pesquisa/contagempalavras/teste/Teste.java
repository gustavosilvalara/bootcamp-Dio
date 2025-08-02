package java.collectionsandstream.map.pesquisa.contagempalavras.teste;

import java.collectionsandstream.map.pesquisa.contagempalavras.dominio.ContagemPalavras;

public class Teste {
    public static void main(String[] args) {
        ContagemPalavras contagemPalavras = new ContagemPalavras();

        contagemPalavras.adicionar("Legal", 2);
        contagemPalavras.adicionar("Chato", 5);
        contagemPalavras.adicionar("Saldo", 10);
        contagemPalavras.adicionar("Mouse", 20);

        System.out.println(contagemPalavras.exibir());

        System.out.println(contagemPalavras.encontrarPalavraMaisFrequente());
    }
}
