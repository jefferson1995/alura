package com.introducao;

public class Main {
    public static void main(String[] args) {

        /*

            O que aprendemos?
            Através das Threads podemos executar tarefas em paralelo;
            Uma classe que implementa a interface Runnable define a tarefa que o Thread executará;
            O construtor da classe Thread recebe esse Runnable;
            Devemos inicializar uma Thread explicitamente através do método start();
            Através do Thread.sleep(millis) podemos mandar uma thread dormir.


        */

        
        try {
            System.out.println("Hello world!");
            System.out.println("Isso é um thread main ");
            //Aqui ele fica esperando um tempo para depois terminar o programa.
            Thread.sleep(30000);
        }catch (InterruptedException e) {
            try {
                throw new InterruptedException(e.getMessage());
            } catch (InterruptedException ex) {
                throw new RuntimeException(ex);
            }
        }finally {
            System.out.println("Programa finalizado após o sleep da thread. ");
        }

    }
}
