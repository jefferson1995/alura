package com.e.curso;

import java.util.*;

public class Curso {

    private String nome;
    private String instrutor;
    private List<Aula> aulas = new LinkedList<Aula>();
    private Set<Aluno> alunos = new HashSet<Aluno>();


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

    @Override
    public String toString() {
        return "Curso{" +
                "nome='" + nome + '\'' +
                ", instrutor='" + instrutor + '\'' +
                ", aulas=" + aulas +
                '}';
    }
    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);
    }

    public void matricula(Aluno a1) {
        this.alunos.add(a1);
    }


    public boolean estaMatriculado(Aluno a1) {
        return this.alunos.contains(a1);
    }
}
