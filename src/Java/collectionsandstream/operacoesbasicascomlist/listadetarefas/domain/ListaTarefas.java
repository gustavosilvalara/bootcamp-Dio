package Java.collectionsandstream.operacoesbasicascomlist.listadetarefas.domain;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

    private final List<String> tarefa;

    public ListaTarefas() {
        this.tarefa = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefa.add(descricao);
    }

    public void removerTarefa(String descricao){
        List<String> remover = new ArrayList<>();
        for (String s : tarefa) {
            if (s.equalsIgnoreCase(descricao)){
                remover.add(s);
            }
        }
        tarefa.removeAll(remover);
    }

    public int obterNumeroTotalTarefas(){
        return tarefa.size();
    }

    public List<String> obterDescricoesTarefas(){
        return tarefa;
    }

}
