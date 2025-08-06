package javas.collectionsandstream.map.operacoesbasicas.agendacontatos.teste;

import javas.collectionsandstream.map.operacoesbasicas.agendacontatos.dominio.AgendaContatos;

public class Teste {
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("João", 11924532);
        agendaContatos.adicionarContato("Gustavo", 11924553);
        agendaContatos.adicionarContato("João", 11924532);

        System.out.println(agendaContatos.exibirContatos());
        agendaContatos.removerContato("João");
        System.out.println(agendaContatos.exibirContatos());

    }
}
