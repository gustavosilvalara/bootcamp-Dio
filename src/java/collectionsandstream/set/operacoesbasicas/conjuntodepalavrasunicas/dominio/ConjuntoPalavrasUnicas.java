package java.collectionsandstream.set.operacoesbasicas.conjuntodepalavrasunicas.dominio;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<String> palavras;

    public ConjuntoPalavrasUnicas() {
        this.palavras = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        palavras.add(palavra);
    }

    public void removerPalavra(String palavra){
        palavras.remove(palavra);
    }

    public boolean verificarPalavra(String palavra){
        return palavras.contains(palavra);
    }

    public Set<String> exibirPalavras(){
        return palavras;
    }

    public Set<String> getPalavras() {
        return palavras;
    }

    public void setPalavras(Set<String> palavras) {
        this.palavras = palavras;
    }
}
