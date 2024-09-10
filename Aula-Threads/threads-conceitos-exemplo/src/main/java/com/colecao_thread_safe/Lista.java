package com.colecao_thread_safe;

public class Lista {


    private String [] elementos = new String[1000];
    private int indice = 0;

    public synchronized void adiciona(String elemento) {
            elementos[indice] = elemento;
            this.indice++;
    }

    public int tamanho() {
        return this.elementos.length;
    }

    public String getElemento(int posicao) {
        return this.elementos[posicao];
    }

}
