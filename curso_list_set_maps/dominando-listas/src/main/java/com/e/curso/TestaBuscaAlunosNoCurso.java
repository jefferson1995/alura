package com.e.curso;

import java.util.Set;

public class TestaBuscaAlunosNoCurso {
    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando as coleções", "Paulo silveira");

        javaColecoes.adicionaAula(new Aula("Aula 1 - java", "Descrição teste 1"));
        javaColecoes.adicionaAula(new Aula("Aula 2 - java", "Descrição teste 2"));
        javaColecoes.adicionaAula(new Aula("Aula 3 - java", "Descrição teste 3"));

        Aluno a1 = new Aluno("Aluno 1", 23);
        Aluno a2 = new Aluno("Aluno 2", 235);
        Aluno a3 = new Aluno("Aluno 3", 236);
        Aluno a4 = new Aluno("Aluno 4", 236);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);
        javaColecoes.matricula(a4);

        System.out.println(javaColecoes.getAlunos());
        System.out.println("Quem é o aluno com matricula 23?");
        Aluno aluno = javaColecoes.buscaMatriculado(23);
        String dadosAluno = String.format("aluno: %s", aluno);
        System.out.println(dadosAluno);

        System.out.println();

        System.out.println("Quem são os alunos com matrícula 236?");
        Set<Aluno> alunos = javaColecoes.buscaMatriculados(236);
        for (Aluno a : alunos) {
            String dadosAlunos = String.format("aluno: %s", a);
            System.out.println(dadosAlunos);
        }

        System.out.println(javaColecoes);


    }
}
