package java.collectionsandstream.map.operacoesbasicas.dicionario.teste;

import java.collectionsandstream.map.operacoesbasicas.dicionario.dominio.Dicionario;

public class Teste {
    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

         dicionario.adicionarPalavara("Salve", "Dizer ola");
         dicionario.adicionarPalavara("Obrigado", "agradecer");

        System.out.println(dicionario.exibir());
        System.out.println(dicionario.pesquisarPorPalavra("Obrigado"));
        dicionario.removerPalavra("Salve");
        System.out.println(dicionario.exibir());

    }
}
