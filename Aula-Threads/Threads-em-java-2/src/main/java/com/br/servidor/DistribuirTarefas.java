package com.br.servidor;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;

public class DistribuirTarefas implements Runnable {

    private Socket socket;
    private ServidorTarefas servidorTarefas;
    ExecutorService threadPool;

    public DistribuirTarefas(ExecutorService threadPool, Socket socket, ServidorTarefas servidorTarefas) {
        this.socket = socket;
        this.servidorTarefas = servidorTarefas;
        this.threadPool = threadPool;
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
                        System.out.println("recebendo comendo: " + linha);
                        ComandoC2 comandoC2 = new ComandoC2(saidaEnviarCliente);
                        this.threadPool.submit(comandoC2);
                        break;
                    }
                    case "c3": {
                        saidaEnviarCliente.println("Confirmação comando c3");
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

                System.out.println(linha);
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
