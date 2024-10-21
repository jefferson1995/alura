package com.e.curso;

import java.util.*;

public class TestaAluno {

    public static void main(String[] args) {

        Collection<String> alunos = new HashSet<>();

        alunos.add("Aluno 1");
        alunos.add("Aluno 2");
        alunos.add("Aluno 3");
        alunos.add("Aluno 4");
        alunos.add("Aluno 5");
        alunos.add("Aluno 6");

        System.out.println(alunos);

        alunos.forEach( aluno -> System.out.println(aluno));

        List<String> alunosEmLista = new ArrayList<>(alunos);

        Collections.sort(alunosEmLista);

        System.out.println(alunosEmLista);
    }



}


