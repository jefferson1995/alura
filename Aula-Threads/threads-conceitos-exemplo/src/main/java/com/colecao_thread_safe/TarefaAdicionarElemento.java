package com.colecao_thread_safe;


public class TarefaAdicionarElemento implements Runnable {

    private Lista lista;
    private int numeroDoThread;

    public TarefaAdicionarElemento(Lista lista, int numeroDoThread) {
        this.lista = lista;
        this.numeroDoThread = numeroDoThread;
    }

    @Override
    public void run() {

        for (int i = 0; i < 99; i++) {
            lista.adicionaElementos("Thread " + numeroDoThread + " - " + i);
        }
    }

}