package java.collectionsandstream.map.operacoesbasicas.dicionario.dominio;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    private Map<String, String> dicionario;

    public Dicionario() {
        this.dicionario = new HashMap<>();
    }

    public void adicionarPalavara(String palavra, String definicao){
        dicionario.put(palavra, definicao);
    }

    public void removerPalavra(String palavra){
        dicionario.remove(palavra);
    }

    public Map<String, String> exibir(){
        return dicionario;
    }

    public String pesquisarPorPalavra(String palavra){
        return dicionario.get(palavra);
    }

    public Map<String, String> getDicionarios() {
        return dicionario;
    }

    public void setDicionarios(Map<String, String> dicionario) {
        this.dicionario = dicionario;
    }
}
