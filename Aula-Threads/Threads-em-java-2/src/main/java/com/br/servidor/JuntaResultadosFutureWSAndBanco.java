package com.br.servidor;

import java.io.PrintStream;
import java.util.concurrent.*;

public class JuntaResultadosFutureWSAndBanco implements Callable<Void> {

    private Future<String> futureWs;
    private Future<String> futureBanco;
    private PrintStream saidaCliente;

    public JuntaResultadosFutureWSAndBanco(Future<String> futureWs, Future<String> futureBanco, PrintStream saidaCliente) {
        this.futureWs = futureWs;
        this.futureBanco = futureBanco;
        this.saidaCliente = saidaCliente;
    }


    @Override
    public Void call() {

        System.out.println("Aguardando resultados do future WS e Banco");

        try {
            String numeroMagico = this.futureWs.get(15, TimeUnit.SECONDS);
            String numeroMagico2 = this.futureBanco.get(15, TimeUnit.SECONDS);
            System.out.println("Finalizou Junta resultados do future WS e Banco");
            this.saidaCliente.println("Resultado comando c2: WS: " + numeroMagico + ", Banco: " + numeroMagico2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        } catch (TimeoutException e) {
            System.out.println("Timeout: Cancelando execucao do comando c2");
            this.saidaCliente.println("Timeout na execucao do comando c2");
            this.futureWs.cancel(true);
            this.futureBanco.cancel(true);
        }

        return null;
    }
}
