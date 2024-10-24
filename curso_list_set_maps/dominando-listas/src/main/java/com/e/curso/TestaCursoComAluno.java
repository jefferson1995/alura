package com.e.curso;

public class TestaCursoComAluno {
    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando as coleções", "Paulo silveira");

        javaColecoes.adicionaAula(new Aula("Aula 1 - java", "Descrição teste 1"));
        javaColecoes.adicionaAula(new Aula("Aula 2 - java", "Descrição teste 2"));
        javaColecoes.adicionaAula(new Aula("Aula 3 - java", "Descrição teste 3"));

        Aluno a1 = new Aluno("Aluno 1", 23);
        Aluno a2 = new Aluno("Aluno 2", 23);
        Aluno a3 = new Aluno("Aluno 3", 23);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);

        System.out.println("Todos alunos matriculados: ");
        javaColecoes.getAlunos().forEach(aluno -> {
            System.out.println(aluno);
        });

        System.out.println("O aluno a1 está matriculado? ");
        System.out.println(javaColecoes.estaMatriculado(a1));

        Aluno jefferson = new Aluno("Jefferson", 23);
        System.out.println("O aluno jefferson está matriculado? ");
        System.out.println(javaColecoes.estaMatriculado(jefferson));

        System.out.println(a1.equals(jefferson));


    }
}
