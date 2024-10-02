package com.br.servidor;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class DistribuirTarefas implements Runnable {

    private Socket socket;
    private ServidorTarefas servidorTarefas;
    ExecutorService threadPool;
    private BlockingQueue<String> filacomandos;

    public DistribuirTarefas(ExecutorService threadPool, BlockingQueue<String> filacomandos ,Socket socket, ServidorTarefas servidorTarefas) {
        this.socket = socket;
        this.servidorTarefas = servidorTarefas;
        this.threadPool = threadPool;
        this.filacomandos = filacomandos;
    }

    @Override
    public void run() {
        try {

            System.out.println("Distribuindo as tarefas para o cliente " + socket);

            Scanner entradaCliente = new Scanner(socket.getInputStream());
            PrintStream saidaEnviarCliente = new PrintStream(socket.getOutputStream());

            while (entradaCliente.hasNextLine()) {

                String linha = entradaCliente.nextLine();


                switch (linha){
                    case "c1": {
                        System.out.println("recebendo comando: " + linha);
                        ComandoC1 comandoC1 = new ComandoC1(saidaEnviarCliente);
                        threadPool.submit(comandoC1);
                        break;
                    }
                    case "c2": {
                        System.out.println("recebendo comando: " + linha);
                        ComandoC2ChamaWS comandoC2ChamaWS = new ComandoC2ChamaWS(saidaEnviarCliente);
                        ComandoC2AcessaBanco comandoC2AcessaBanco = new ComandoC2AcessaBanco(saidaEnviarCliente);
                        Future<String> futureWs = this.threadPool.submit(comandoC2ChamaWS);
                        Future<String> futureBanco = this.threadPool.submit(comandoC2AcessaBanco);

                        this.threadPool.submit(new JuntaResultadosFutureWSAndBanco(futureWs, futureBanco, saidaEnviarCliente));

                        break;
                    }
                    case "c3": {
                        this.filacomandos.put(linha); // blocks
                        saidaEnviarCliente.println("Comando c3 adicionado na fila ");
                        break;
                    }
                    case "fim": {
                        saidaEnviarCliente.println("Desligando servidor");
                        servidorTarefas.parar();
                    }
                    default:{
                        saidaEnviarCliente.println("Comando não encontrado");
                    }
                }

            }
            saidaEnviarCliente.close();
            entradaCliente.close();
            Thread.sleep(20000);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
