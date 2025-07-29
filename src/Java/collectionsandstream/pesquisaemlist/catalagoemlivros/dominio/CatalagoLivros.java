package Java.collectionsandstream.pesquisaemlist.catalagoemlivros.dominio;

import java.util.ArrayList;
import java.util.List;


public class CatalagoLivros {

    private final List<Livro> listaLivros;
    private Livro livro;

    public CatalagoLivros() {
        this.listaLivros = new ArrayList<>();
    }

    public void adicionarLivro(String name, String autor, int anoPublicado){
        livro = new Livro(name, autor, anoPublicado);
        listaLivros.add(livro);
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> autorLivro = new ArrayList<>();
        for (Livro listaLivro : listaLivros) {
            if (listaLivro.autor().equalsIgnoreCase(autor)){
                autorLivro.add(listaLivro);
            }
        }
        return autorLivro;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> intervaloPorAno = new ArrayList<>();
        for (Livro listaLivro : listaLivros) {
            if (listaLivro.anoPublicado() >= anoInicial && listaLivro.anoPublicado() <= anoFinal){
                intervaloPorAno.add(listaLivro);
            }
        }
        return intervaloPorAno;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro pesquisa = null;
        for (Livro listaLivro : listaLivros) {
            if (listaLivro.name().equalsIgnoreCase(titulo)) pesquisa = listaLivro;
        }
        return pesquisa;
    }

    protected List<Livro> getListaLivros() {
        return listaLivros;
    }

    protected void setLivro(Livro livro) {
        this.livro = livro;
    }
}
