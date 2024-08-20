package com.buscaTextual_OrdemExecucao;

public class Main {

    public static void main(String[] args) {

        /*
            Neste caso ele está buscando o que achar primeiro, ou seja, não tenham um controle de execução, tudo acontece de forma paralela.
            Não tem controle do que será executado primeiro.

            Java suporta Threads nativamente
Java        mapeia os Threads para o Sistema Operacional
A ord       em de execução depende da JVM e não do nosso código

         */

        String nome = "da";


        Thread threadAssinaturas1 = new Thread(new TarefaBuscaTextual("/media/jefferson/Projetos/alura/Aula-Threads/threads-conceitos-exemplo/src/main/resources/nomes/assinaturas1.txt", nome));
        System.out.println(threadAssinaturas1.getId());
        Thread threadAssinaturas2 = new Thread(new TarefaBuscaTextual("/media/jefferson/Projetos/alura/Aula-Threads/threads-conceitos-exemplo/src/main/resources/nomes/assinaturas2.txt", nome));
        System.out.println(threadAssinaturas2.getId());
        Thread threadAutores = new Thread(new TarefaBuscaTextual("/media/jefferson/Projetos/alura/Aula-Threads/threads-conceitos-exemplo/src/main/resources/nomes/autores.txt", nome));
        System.out.println(threadAutores.getId());

        threadAssinaturas1.start();
        threadAssinaturas2.start();
        threadAutores.start();


    }
}
