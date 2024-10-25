package com.e.curso;

import java.util.*;

public class Curso {

    private String nome;
    private String instrutor;
    private List<Aula> aulas = new LinkedList<Aula>();
    private Set<Aluno> alunos = new HashSet<Aluno>();
    private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();
    private Map<Integer, Set<Aluno>> matriculaParaAlunos = new HashMap<>();


    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public void adicionaAula(Aula aula) {
        this.aulas.add(aula);
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
    }

    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);
    }

    public void matricula(Aluno a1) {
        this.alunos.add(a1);
        this.matriculaParaAluno.put(a1.getMatricula(), a1);
        this.matriculaParaAlunos.computeIfAbsent(a1.getMatricula(), k -> new HashSet<>()).add(a1);
    }


    public boolean estaMatriculado(Aluno a1) {
        return this.alunos.contains(a1);
    }

    public Aluno buscaMatriculado(int matricula) {
        if(!matriculaParaAluno.containsKey(matricula)) {
            throw new NoSuchElementException("Aluno não encontrado!");
        }
        return this.matriculaParaAluno.get(matricula);
    }

    public Set<Aluno> buscaMatriculados(int matricula) {
        return this.matriculaParaAlunos.get(matricula);
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nome='" + nome + '\'' +
                ", instrutor='" + instrutor + '\'' +
                ", aulas=" + aulas +
                ", alunos=" + alunos +
                ", matriculaParaAluno=" + matriculaParaAluno +
                ", matriculaParaAlunos=" + matriculaParaAlunos +
                '}';
    }
}
