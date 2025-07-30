package Java.collectionsandstream.set.ordenacao.listadealunos.dominio;

import java.util.Comparator;
import java.util.Objects;

public class Alunos implements Comparable<Alunos>{

    private String nome;
    private long matricula;
    private double nota;

    public Alunos(String nome, long matricula, double nota) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Alunos alunos)) return false;
        return nome.equals(alunos.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula);
    }

    @Override
    public String toString() {
        return "Alunos{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", nota=" + nota +
                '}';
    }

    @Override
    public int compareTo(Alunos a) {
        return this.nome.compareTo(a.nome);
    }
}

class ComparatorNota implements Comparator<Alunos>{

    @Override
    public int compare(Alunos a1, Alunos a2) {
        return Double.compare(a1.getNota(), a2.getNota());
    }
}
