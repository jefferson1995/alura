package com.sincronizando_Execucao_projeto_banheiro;

public class Banheiro {

    private boolean banheiroSujo = true;

    public void fazNumero1() {

        String name = Thread.currentThread().getName();

        System.out.println(name + " batendo na porta");

        synchronized (this) {

            System.out.println(name + " Entrando no banheiro");

            if (banheiroSujo) {
                esperarLaFora(name);
            }

            System.out.println(name + " Fazendo coisa rápida");

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            this.banheiroSujo = true;
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

            if (banheiroSujo) {
                esperarLaFora(name);
            }

            System.out.println(name + " Fazendo coisa demorada");

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            this.banheiroSujo = true;
            System.out.println(name + " Dando descarga");
            System.out.println(name + " lavando a mão");
            System.out.println(name + " saindo do banheiro");
        }

    }


    // Nesta aula, aprendemos sobre a importância de sincronizar o acesso ao banheiro (no nosso caso, um recurso compartilhado) para evitar problemas como a exceção IllegalMonitorStateException.
    //
    // Para isso, usamos um bloco synchronized para garantir que apenas um thread (no caso, a "limpeza") possa acessar o banheiro por vez.
    //
    // Além disso, aprendemos a notificar outros threads (os "convidados") que o banheiro está limpo usando o método notifyAll().
    //
    // Com essa sincronização, garantimos que a limpeza aconteça de forma organizada e que todos os convidados tenham acesso ao banheiro quando estiver limpo!

    public void limpaBanheiro() {

        String name = Thread.currentThread().getName();
        System.out.println(name + " batendo na porta");

        synchronized (this) {

            System.out.println(name + " Entrando no banheiro");

            if (!banheiroSujo) {
                System.out.println(name + "Banheiro não está sujo, irei sair!");
            }

            System.out.println(name + " Limpando Banheiro");

            this.banheiroSujo = false;
            try {
                Thread.sleep(13000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            this.notifyAll(); //Avisa todos que estão esperando
        }
    }



    /*
        O método wait() coloca a thread em um estado de espera, como se ela estivesse sentada em um banco na frente do banheiro, esperando a limpeza.
        Para que a thread saia do estado de espera, ela precisa ser "acordada" por outra thread. Isso é feito através do método notify() ou notifyAll().
     */

    private void esperarLaFora(String name) {
        System.out.println(name + " banheiro está sujo");
        try {
            this.wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
