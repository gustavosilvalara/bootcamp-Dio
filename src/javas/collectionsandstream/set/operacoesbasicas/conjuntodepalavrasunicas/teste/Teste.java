package javas.collectionsandstream.set.operacoesbasicas.conjuntodepalavrasunicas.teste;

import javas.collectionsandstream.set.operacoesbasicas.conjuntodepalavrasunicas.dominio.ConjuntoPalavrasUnicas;

public class Teste {
    public static void main(String[] args) {

        ConjuntoPalavrasUnicas conjuntoPlavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPlavrasUnicas.adicionarPalavra("Salve");
        conjuntoPlavrasUnicas.adicionarPalavra("Cassinooo!!!");
        conjuntoPlavrasUnicas.adicionarPalavra("Lontra");
        conjuntoPlavrasUnicas.adicionarPalavra("Estudar");
        conjuntoPlavrasUnicas.adicionarPalavra("Compreender");
        conjuntoPlavrasUnicas.adicionarPalavra("Compreender");
        conjuntoPlavrasUnicas.adicionarPalavra("Entender");

        System.out.println(conjuntoPlavrasUnicas.exibirPalavras());
        conjuntoPlavrasUnicas.removerPalavra("Entender");
        System.out.println(conjuntoPlavrasUnicas.exibirPalavras());
    }
}
