package java.collectionsandstream.set.pesquisa.agendadecontatos.teste;

import java.collectionsandstream.set.pesquisa.agendadecontatos.dominio.AgendaContatos;

public class Teste {
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Jão", 1234);
        agendaContatos.adicionarContato("Jão", 1234);
        agendaContatos.adicionarContato("Jão Silva", 12342);
        agendaContatos.adicionarContato("Maria", 12345);
        agendaContatos.adicionarContato("Rose Mara", 123423);
        agendaContatos.adicionarContato("Maria Goreth", 1199213650);

        System.out.println(agendaContatos.exibirContatos());

        agendaContatos.atualizarNumeroContato("Jão", 123467);

        System.out.println(agendaContatos.exibirContatos());

        System.out.println(agendaContatos.pesquisarPorNome("Maria"));
    }
}
