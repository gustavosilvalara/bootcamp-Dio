package Java.collectionsandstream.set.operacoesbasicas.conjuntodeconvidados.teste;

import Java.collectionsandstream.set.operacoesbasicas.conjuntodeconvidados.dominio.ConjuntoConvidados;

public class Test {
    public static void main(String[] args) {
        ConjuntoConvidados convidados = new ConjuntoConvidados();

        convidados.adicionarConvidado("Jão", 1);
        convidados.adicionarConvidado("Henrique", 2);
        convidados.adicionarConvidado("Lucas", 3);
        convidados.adicionarConvidado("Fernanda", 4);
        convidados.adicionarConvidado("Lyandra", 5);
        convidados.adicionarConvidado("Jão", 1);

        System.out.println(convidados.contarConvidados());
        System.out.println(convidados.exibirConvidados());
        convidados.removerConvidado(1);
        System.out.println(convidados.exibirConvidados());

    }
}
