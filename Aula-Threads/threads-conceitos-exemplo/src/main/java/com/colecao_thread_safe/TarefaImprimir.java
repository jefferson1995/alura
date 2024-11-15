package com.colecao_thread_safe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TarefaImprimir implements Runnable {

    private Lista lista;

    public TarefaImprimir(Lista lista) {
        this.lista = lista;
    }

    @Override
    public void run() {


        synchronized (lista) {
            if (!lista.estaCheia()) {
                try {
                    System.out.println("Aguardando notificação");
                    lista.wait();
                    for (int i = 0; i < lista.tamanho(); i++) {
                        System.out.println(i + " - " + lista.getElemento(i));
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}

