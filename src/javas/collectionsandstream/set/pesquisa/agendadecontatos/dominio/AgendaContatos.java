package javas.collectionsandstream.set.pesquisa.agendadecontatos.dominio;


import java.util.LinkedHashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> contatos;

    public AgendaContatos() {
        this.contatos = new LinkedHashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        Contato contato = new Contato(nome, numero);
        contatos.add(contato);
    }

    public Set<Contato> exibirContatos(){
        return contatos;
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> achados = new LinkedHashSet<>();
        for (Contato contato : contatos) {
            if (contato.getNome().startsWith(nome)) achados.add(contato);
        }
        return achados;
    }

    public void atualizarNumeroContato(String nome, int numero){
        for (Contato contato : contatos) {
            if(contato.getNome().equalsIgnoreCase(nome)){
                contato.setNumero(numero);
            }
        }
    }


    public Set<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(Set<Contato> contatos) {
        this.contatos = contatos;
    }


}
