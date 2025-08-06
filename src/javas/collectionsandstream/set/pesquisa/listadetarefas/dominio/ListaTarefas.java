package javas.collectionsandstream.set.pesquisa.listadetarefas.dominio;

import java.util.LinkedHashSet;
import java.util.Set;

public class ListaTarefas {

   private Set<Tarefa> tarefas;

    public ListaTarefas() {
        this.tarefas = new LinkedHashSet<>();
    }

    public void adicionarTarefa(String descricao){
        Tarefa tarefa = new Tarefa(descricao);
        tarefas.add(tarefa);
    }

    public void removerTarefa(String descicao){
        tarefas.removeIf(a -> a.getDescricao().equalsIgnoreCase(descicao));
    }

    public Set<Tarefa> exibirTarefas(){
        return tarefas;
    }

    public int contarTarefas(){
        return tarefas.size();
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> concluidas = new LinkedHashSet<>();
        for (Tarefa tarefa : tarefas) {
            if (tarefa.isRealizado()) concluidas.add(tarefa);
        }
        return concluidas;
    }

    public Set<Tarefa>obterTarefasPendentes(){
        Set<Tarefa> naoConcluidas = new LinkedHashSet<>();
        for (Tarefa tarefa : tarefas) {
            if (!tarefa.isRealizado()) naoConcluidas.add(tarefa);
        }
        return naoConcluidas;
    }

    public void marcarTarefaConcluida(String descricao){
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) tarefa.setRealizado(true);
        }
    }

    public void marcarTarefaPendente(String descricao){
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) tarefa.setRealizado(false);
        }
    }

    public void limparListaTarefas(){
        tarefas.clear();
    }

    protected Set<Tarefa> getTarefas() {
        return tarefas;
    }

    protected void setTarefas(Set<Tarefa> tarefas) {
        this.tarefas = tarefas;
    }
}
