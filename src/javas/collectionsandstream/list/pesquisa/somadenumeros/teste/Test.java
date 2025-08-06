package javas.collectionsandstream.list.pesquisa.somadenumeros.teste;

import javas.collectionsandstream.list.pesquisa.somadenumeros.dominio.SomaNumeros;

public class Test {
    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(1);
        somaNumeros.adicionarNumero(4);
        somaNumeros.adicionarNumero(3);
        somaNumeros.adicionarNumero(2);
        somaNumeros.adicionarNumero(10);

        System.out.println(somaNumeros.intencontrarMenorNumero());
        System.out.println(somaNumeros.encontrarMaiorNumero());
        System.out.println(somaNumeros.calcularSoma());
        System.out.println(somaNumeros.exibirNumeros());
    }
}
