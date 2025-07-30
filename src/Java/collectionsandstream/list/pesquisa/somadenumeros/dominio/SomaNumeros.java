package Java.collectionsandstream.list.pesquisa.somadenumeros.dominio;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    private final List<Integer> numeros;

    public SomaNumeros() {
        numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numeros.add(numero);
    }

    public int calcularSoma(){
        int soma = 0;

        for (Integer numero : numeros) {
            soma += numero;
        }
        return soma;
    }

    public int encontrarMaiorNumero(){
        int maior = 0;
        for (Integer numero : numeros) {
            if (numero > maior){
                maior = numero;
            }
        }
        return maior;
    }

    public int intencontrarMenorNumero(){
        int menor = 9000000;
        for (Integer numero : numeros) {
            if (numero < menor){
                menor = numero;
            }
        }
        return menor;
    }

    public List<Integer> exibirNumeros(){
        return numeros;
    }
}
