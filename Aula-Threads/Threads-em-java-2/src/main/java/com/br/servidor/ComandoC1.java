package com.br.servidor;

import java.io.PrintStream;
import java.net.Socket;

public class ComandoC1 implements Runnable {

    private PrintStream saidaEnviarCliente;

    public ComandoC1(PrintStream saidaEnviarCliente) {
        this.saidaEnviarCliente = saidaEnviarCliente;
    }

    @Override
    public void run() {
        System.out.println("Executando comando c1");
        try {
            Thread.sleep(200);
        }catch (Exception e) {
            e.printStackTrace();
        }
        saidaEnviarCliente.println("Confirmação comando c1");
    }
}
