package Java.collectionsandstream.listadetarefas.domain;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

    private final List<String> tarefa = new ArrayList<>();

    public ListaTarefas() {

    }

    public void adicionarTarefa(String descricao){
        tarefa.add(descricao);
    }

    public void removerTarefa(String descricao){
        tarefa.remove(descricao);
    }

    public int obterNumeroTotalTarefas(){
        return tarefa.size();
    }

    public List<String> obterDescricoesTarefas(){
        return tarefa;
    }

}
