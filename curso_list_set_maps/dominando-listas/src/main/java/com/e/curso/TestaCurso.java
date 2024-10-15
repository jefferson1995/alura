package com.e.curso;

import java.util.List;

public class TestaCurso {

    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando as coleções", "Paulo silveira");

        //javaColecoes.getAulas().add(new Aula("Aula 1 - java", "Descrição teste"));

        javaColecoes.adicionaAula(new Aula("Aula 1 - java", "Descrição teste 1"));
        javaColecoes.adicionaAula(new Aula("Aula 2 - java", "Descrição teste 2"));
        javaColecoes.adicionaAula(new Aula("Aula 3 - java", "Descrição teste 3"));

        System.out.println("-----------------------");
        System.out.println(javaColecoes.toString());
        System.out.println(javaColecoes.getAulas());
        System.out.println("---------------------------");



    }
}
