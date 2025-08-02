package java.collectionsandstream.map.ordenacao.livrariaonline.dominio;




import java.util.HashMap;
import java.util.Map;


public class LivrariaOnline {

    private Map<String, Livro> livros;

    public LivrariaOnline() {
        this.livros = new HashMap<>();
    }

    public void adicionar(String link, String titulo, String autor, double preco){
        Livro livro = new Livro(titulo, autor, preco);
        livros.put(link, livro);
    }

    public void remover(String titulo){
        for (Map.Entry<String, Livro> entry : livros.entrySet()){
            if (entry.getValue().getTitulo().equalsIgnoreCase(titulo)){
                livros.remove(entry.getKey());
                break;
            }
        }
    }

    public void exibirPorPreco(){

    }



    public Map<String, Livro> getLivros() {
        return livros;
    }

    public void setLivros(Map<String, Livro> livros) {
        this.livros = livros;
    }

}

class Comparator implements java.util.Comparator<LivrariaOnline>{

    @Override
    public int compare(LivrariaOnline o1, LivrariaOnline o2) {
        for (Map.Entry<String, Livro> entry : o1.getLivros().entrySet()){
            for (Map.Entry<String, Livro> entry1 : o2.getLivros().entrySet()){
                if (entry.getValue().getPreco() > entry1.getValue().getPreco()){
                    return -1;
                } else if (entry.getValue().getPreco() < entry1.getValue().getPreco()) {
                    return 1;
                }
            }
        }
        return 0;
    }
}
