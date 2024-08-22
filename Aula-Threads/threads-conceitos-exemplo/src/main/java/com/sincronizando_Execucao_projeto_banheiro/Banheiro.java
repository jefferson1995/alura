package com.sincronizando_Execucao_projeto_banheiro;

public class Banheiro {

    public void fazNumero1() {

        String name = Thread.currentThread().getName();

        System.out.println(name + " batendo na porta");

        synchronized (this) {

            System.out.println(name + " Entrando no banheiro");
            System.out.println(name + " Fazendo coisa rápida");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(name + " Dando descarga");
            System.out.println(name + " lavando a mão");
            System.out.println(name + " saindo do banheiro");

        }


    }

    public void fazNumero2() {

        String name = Thread.currentThread().getName();

        System.out.println(name + " batendo na porta");

        synchronized (this) {

            System.out.println(name + " Entrando no banheiro");
            System.out.println(name + " Fazendo coisa demorada");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(name + " Dando descarga");
            System.out.println(name + " lavando a mão");
            System.out.println(name + " saindo do banheiro");
        }

    }
}
