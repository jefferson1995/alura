package com.br.servidor;

import java.util.concurrent.ThreadFactory;

public class FabricaDeThread implements ThreadFactory {

    private static int numero = 1;
    @Override
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, "Thread servidor tarefas de numero " + numero);
        numero++;
        thread.setUncaughtExceptionHandler(new TratadorDeExecao());
        thread.setDaemon(true);
        return thread;
    }
}
