package com.br.servidor;

import java.io.PrintStream;

public class ComandoC2 implements Runnable {

    private PrintStream saidaEnviarCliente;

    public ComandoC2(PrintStream saidaEnviarCliente) {
        this.saidaEnviarCliente = saidaEnviarCliente;
    }

    @Override
    public void run() {
        System.out.println("Executando comando c2");
        try {
            Thread.sleep(200);
        }catch (Exception e) {
            e.printStackTrace();
        }
        throw new RuntimeException();
       //saidaEnviarCliente.println("Confirmação comando c2");
    }
}
