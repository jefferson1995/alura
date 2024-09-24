package com.deadlock;

public class GerenciamentoDeTransacao {

    public void begin(){
        System.out.println("Começando transação");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
