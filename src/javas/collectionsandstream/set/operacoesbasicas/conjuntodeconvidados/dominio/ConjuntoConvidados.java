package javas.collectionsandstream.set.operacoesbasicas.conjuntodeconvidados.dominio;


import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidados;

    public ConjuntoConvidados() {
        convidados = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        Convidado convidado = new Convidado(nome, codigoConvite);
        convidados.add(convidado);
    }


    public void removerConvidado(int codigoConvidado){
        convidados.removeIf(convidado -> convidado.getCodigoConvite() == codigoConvidado);
    }

    public int contarConvidados(){
        return convidados.size();
    }

    public Set<Convidado> exibirConvidados(){
        return convidados;
    }



    public Set<Convidado> getConvidados() {
        return convidados;
    }

    public void setConvidados(Set<Convidado> convidados) {
        this.convidados = convidados;
    }

    @Override
    public String toString() {
        return "ConjuntoConvidados{" +
                "convidados=" + convidados +
                '}';
    }
}
