package Java.collectionsandstream.ordenacaoemset.listadealunos.teste;

import Java.collectionsandstream.ordenacaoemset.listadealunos.dominio.GerenciadorAlunos;

public class Teste {
    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno("João", 12346L, 5);

        gerenciadorAlunos.adicionarAluno("Gustavo", 1234L, 10);

        gerenciadorAlunos.adicionarAluno("Henrique", 12345L, 7);

        System.out.println(gerenciadorAlunos.exibirAlunosPorNome());
        System.out.println(gerenciadorAlunos.exibirAlunosPorNota());
        System.out.println(gerenciadorAlunos.exibirAlunos());
    }
}
