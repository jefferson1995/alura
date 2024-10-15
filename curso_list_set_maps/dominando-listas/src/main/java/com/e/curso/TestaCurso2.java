package com.e.curso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {

    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando as coleções", "Paulo silveira");

        //javaColecoes.getAulas().add(new Aula("Aula 1 - java", "Descrição teste"));

        javaColecoes.adicionaAula(new Aula("Aula 1 - java", "Descrição teste 1"));
        javaColecoes.adicionaAula(new Aula("Aula 2 - java", "Descrição teste 2"));
        javaColecoes.adicionaAula(new Aula("Aula 3 - java", "Descrição teste 3"));

        System.out.println("-----------------------");
        System.out.println(javaColecoes);
        System.out.println(javaColecoes.getAulas());
        System.out.println("---------------------------");

        List<Aula> aulasImutaveis = javaColecoes.getAulas();

        List<Aula> aulas2 = new ArrayList<>(aulasImutaveis);

        Collections.sort(aulas2);

    }
}
