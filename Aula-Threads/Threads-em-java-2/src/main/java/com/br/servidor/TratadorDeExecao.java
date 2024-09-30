package com.br.servidor;

public class TratadorDeExecao implements Thread.UncaughtExceptionHandler {

    @Override
    public void uncaughtException(Thread thread, Throwable e) {
        System.out.println("Deu exceção na thread: " + thread.getName() + ", " + e.getMessage());
    }
}
