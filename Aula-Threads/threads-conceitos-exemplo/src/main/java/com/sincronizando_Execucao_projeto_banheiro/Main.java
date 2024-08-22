package com.sincronizando_Execucao_projeto_banheiro;

public class Main {
    public static void main(String[] args) {

        /*
            Nesse exemplo, tivemos a necessidade de sincronizar o acesso. Quando compartilhamos um objeto com dois threads,
            em alguns casos gostaríamos de garantir que essas linhas de código sejam executadas de uma só vez (ou seja, de forma atômica).
            Para isso, aprendemos o método synchronized(), que é baseado em uma chave (this), que também é chamada de Mutex.
            Cada objeto no mundo Java já possui essa chave para sincronizar o acesso.
            Dessa forma, o thread é executado continuadamente, sem nunca liberar a chave e travando a aplicação.
         */

        /*
        Um Thread pode ter um nome;
        Podemos pegar o Thread atual através do método Thread.currentThread();
        Para sincronizar threads, devemos utilizar um bloco synchronized;
        O synchronized significa que bloqueamos o objeto para outros threads;
        A sincronização é feita através de mutex, que nada mais é do que a chave do objeto.
         */

        Banheiro banheiro = new Banheiro();

        Thread convidado1 = new Thread(new TarefaNumero1(banheiro), "João");
        Thread convidado2 = new Thread(new TarefaNumero2(banheiro), "Pedro");
        Thread convidado3 = new Thread(new TarefaNumero1(banheiro), "Maria");
        Thread convidado4 = new Thread(new TarefaNumero2(banheiro), "Ana");

        convidado1.start();
        convidado2.start();
        convidado3.start();
        convidado4.start();

    }
}
