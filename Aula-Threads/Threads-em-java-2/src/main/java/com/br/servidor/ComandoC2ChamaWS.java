package com.br.servidor;

import java.io.PrintStream;
import java.util.Random;
import java.util.concurrent.Callable;

public class ComandoC2ChamaWS implements Callable<String> {

    private PrintStream saidaEnviarCliente;

    public ComandoC2ChamaWS(PrintStream saidaEnviarCliente) {
        this.saidaEnviarCliente = saidaEnviarCliente;
    }

    @Override
    public String call() throws Exception {

        System.out.println("Servidor recebeu comando c2 - WS");

        saidaEnviarCliente.println("Processando comando c2 - WS");

        Thread.sleep(25000);

        int numero = new Random().nextInt(100) + 1;

        saidaEnviarCliente.println("Servidor finalizou comando c2 - WS");
        return Integer.toString(numero);

    }
}
