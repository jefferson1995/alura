package com.sincronizando_Execucao_projeto_banheiro;

public class TarefaNumero2 implements Runnable {

    private Banheiro banheiro;

    public TarefaNumero2(Banheiro banheiro) {
        this.banheiro = banheiro;
    }

    @Override
    public void run() {

        banheiro.fazNumero2();

    }
}
