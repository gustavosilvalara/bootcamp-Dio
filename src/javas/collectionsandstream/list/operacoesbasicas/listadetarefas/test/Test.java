package javas.collectionsandstream.list.operacoesbasicas.listadetarefas.test;

import javas.collectionsandstream.list.operacoesbasicas.listadetarefas.domain.ListaTarefas;

public class Test {
    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Estudar");
        listaTarefas.adicionarTarefa("Ler");
        listaTarefas.adicionarTarefa("Estudar");
        System.out.println(listaTarefas.obterDescricoesTarefas());
        System.out.println(listaTarefas.obterNumeroTotalTarefas());
        listaTarefas.removerTarefa("Estudar");
        System.out.println(listaTarefas.obterDescricoesTarefas());
        System.out.println(listaTarefas.obterNumeroTotalTarefas());

    }
}
