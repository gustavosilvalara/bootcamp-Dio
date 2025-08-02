package java.collectionsandstream.map.pesquisa.contagempalavras.dominio;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {

    private Map<String, Integer> palavras;

    public ContagemPalavras() {
        this.palavras = new HashMap<>();
    }

    public void adicionar(String palavra, Integer contagem){
        palavras.put(palavra, contagem);
    }

    public void remover(String palavra){
        palavras.remove(palavra);
    }

    public Map<String, Integer> exibir(){
        return palavras;
    }

    public Map<String, Integer> encontrarPalavraMaisFrequente() {
        Map<String, Integer> encontrado = new HashMap<>();
        int frequencia = 0;
        for (Integer p : palavras.values()){
            if (p > frequencia){
                frequencia = p;
            }
        }
        for (Map.Entry<String, Integer> palavra : palavras.entrySet()){
            if (palavra.getValue() == frequencia){
                encontrado.put(palavra.getKey(), palavra.getValue());
            }
        }
        return encontrado;
    }


    public Map<String, Integer> getPalavras() {
        return palavras;
    }

    public void setPalavras(Map<String, Integer> palavras) {
        this.palavras = palavras;
    }
}
