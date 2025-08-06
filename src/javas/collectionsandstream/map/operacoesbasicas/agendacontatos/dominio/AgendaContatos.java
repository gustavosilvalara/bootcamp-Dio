package javas.collectionsandstream.map.operacoesbasicas.agendacontatos.dominio;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> contatos;

    public AgendaContatos() {
        this.contatos = new HashMap<>();
    }

    public void adicionarContato(String nome, int numero){
        contatos.put(nome, numero);
    }

    public void removerContato(String nome){
        contatos.remove(nome);
    }

    public Map<String, Integer> exibirContatos(){
        return contatos;
    }

    public int pesquisarPorNome(String nome){
        return contatos.get(nome);
    }

    public Map<String, Integer> getContatos() {
        return contatos;
    }

    public void setContatos(Map<String, Integer> contatos) {
        this.contatos = contatos;
    }
}
