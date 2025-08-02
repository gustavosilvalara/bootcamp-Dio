package java.collectionsandstream.set.pesquisa.listadetarefas.teste;

import java.collectionsandstream.set.pesquisa.listadetarefas.dominio.ListaTarefas;

public class Teste {
    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Lavar Louça");
        listaTarefas.adicionarTarefa("Escovar os dentes");
        listaTarefas.adicionarTarefa("Orar");
        listaTarefas.adicionarTarefa("Agradeçer");
        listaTarefas.adicionarTarefa("Estudar 4h");
        listaTarefas.adicionarTarefa("Amar o proximo");
        listaTarefas.adicionarTarefa("Correr");
        listaTarefas.adicionarTarefa("Malhar");
        listaTarefas.adicionarTarefa("Malhar");

        System.out.println(listaTarefas.contarTarefas());
        System.out.println(listaTarefas.exibirTarefas());
        System.out.println(listaTarefas.obterTarefasConcluidas());
        System.out.println(listaTarefas.obterTarefasPendentes());
        System.out.println("==================================================================");
        listaTarefas.marcarTarefaConcluida("Escovar os dentes");
        System.out.println(listaTarefas.obterTarefasPendentes());
        System.out.println(listaTarefas.obterTarefasConcluidas());
    }
}
