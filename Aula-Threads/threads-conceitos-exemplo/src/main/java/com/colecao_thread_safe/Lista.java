package com.colecao_thread_safe;

public class Lista {


    private String[] elementos = new String[1000];
    private int indice = 0;

    public synchronized void adiciona(String elemento) {
        elementos[indice] = elemento;
        this.indice++;

        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        if (this.indice == this.elementos.length) {
            System.out.println("lista está cheia, notificando. ");
            this.notify();
        }
    }

    public int tamanho() {
        return this.elementos.length;
    }

    public String getElemento(int posicao) {
        return this.elementos[posicao];
    }

    public boolean estaCheia() {
        return this.indice == this.tamanho();
    }
}
