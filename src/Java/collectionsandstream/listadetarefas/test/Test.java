package Java.collectionsandstream.listadetarefas.test;

import Java.collectionsandstream.listadetarefas.domain.ListaTarefas;

public class Test {
    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Estudar");
        listaTarefas.adicionarTarefa("Ler");
        System.out.println(listaTarefas.obterDescricoesTarefas());
        System.out.println(listaTarefas.obterNumeroTotalTarefas());
        listaTarefas.removerTarefa("Estudar");
        System.out.println(listaTarefas.obterDescricoesTarefas());
        System.out.println(listaTarefas.obterNumeroTotalTarefas());

    }
}
