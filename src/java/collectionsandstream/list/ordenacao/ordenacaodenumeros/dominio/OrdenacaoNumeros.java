package java.collectionsandstream.list.ordenacao.ordenacaodenumeros.dominio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros implements Comparable<Integer>{

    private List<Integer> numeros;

    public OrdenacaoNumeros() {
        numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numeros.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> ordenado = new ArrayList<>(numeros);
        Collections.sort(ordenado);
        return ordenado;
    }

    public List<Integer> ordenarDescendente(){
        List<Integer> ordenado = new ArrayList<>(numeros);
        ordenado.sort(Collections.reverseOrder());
        return ordenado;
    }

    public List<Integer> getNumeros() {
        return numeros;
    }

    public void setNumeros(List<Integer> numeros) {
        this.numeros = numeros;
    }

    @Override
    public int compareTo(Integer n) {
        return Integer.compare(numeros.getFirst(),n);
    }
}
