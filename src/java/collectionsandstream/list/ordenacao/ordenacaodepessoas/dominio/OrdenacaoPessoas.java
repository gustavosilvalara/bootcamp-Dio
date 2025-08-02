package java.collectionsandstream.list.ordenacao.ordenacaodepessoas.dominio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas{

    private List<Pessoa> listaPessoas;

    public OrdenacaoPessoas() {
        listaPessoas = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        Pessoa pessoa = new Pessoa(nome, idade, altura);
        listaPessoas.add(pessoa);
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> ordenada = new ArrayList<>(listaPessoas);
        Collections.sort(ordenada);
        return ordenada;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> ordenada = new ArrayList<>(listaPessoas);
        ordenada.sort(new ComparatorPessoaPorAltura());
        return ordenada;
    }

    protected List<Pessoa> getListaPessoas() {
        return listaPessoas;
    }

    protected void setListaPessoas(List<Pessoa> listaPessoas) {
        this.listaPessoas = listaPessoas;
    }

}
