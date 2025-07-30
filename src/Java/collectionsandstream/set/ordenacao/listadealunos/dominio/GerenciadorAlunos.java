package Java.collectionsandstream.set.ordenacao.listadealunos.dominio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class GerenciadorAlunos {

    private Set<Alunos> alunos;

    public GerenciadorAlunos() {
        this.alunos = new LinkedHashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double nota){
        Alunos aluno = new Alunos(nome, matricula, nota);
        alunos.add(aluno);
    }

    public void removerAluno(long matricula){
        alunos.removeIf(a -> a.getMatricula() == matricula);
    }

    public List<Alunos> exibirAlunosPorNome(){
        List<Alunos> alunosNome = new ArrayList<>(alunos);
        Collections.sort(alunosNome);
        return alunosNome;
    }

    public List<Alunos> exibirAlunosPorNota(){
        List<Alunos> alunosNota = new ArrayList<>(alunos);
        alunosNota.sort(new ComparatorNota());
        return alunosNota;
    }

    public Set<Alunos> exibirAlunos(){
        return alunos;
    }

    protected Set<Alunos> getAlunos() {
        return alunos;
    }

    protected void setAlunos(Set<Alunos> alunos) {
        this.alunos = alunos;
    }
}
