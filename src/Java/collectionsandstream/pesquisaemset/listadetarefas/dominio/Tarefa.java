package Java.collectionsandstream.pesquisaemset.listadetarefas.dominio;

import java.util.Objects;

public class Tarefa {

    private String descricao;

    private boolean realizado;


    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.realizado = false;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isRealizado() {
        return realizado;
    }

    public void setRealizado(boolean realizado) {
        this.realizado = realizado;
    }

    @Override
    public String toString() {
        return "descricao: " + descricao +
                ", realizado: " + realizado ;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Tarefa tarefa)) return false;
        return realizado == tarefa.realizado && Objects.equals(descricao, tarefa.descricao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(descricao, realizado);
    }
}
