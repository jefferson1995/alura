package com.br.servidor;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        System.out.println("--------iniciando servidor----------");
        ServerSocket servidor = new ServerSocket(12345);

        ExecutorService threadPool = Executors.newCachedThreadPool();

        //devolve um conjunto com todas as threads da JVM.
        Set<Thread> todasAsThreads = Thread.getAllStackTraces().keySet();

        for (Thread thread : todasAsThreads) {
            System.out.println("Nome Thread: " + thread.getName());
        }

        //As informações que a JVM expõe não param por ai. Também podemos "perguntar" quantos processadores temos disponíveis. Para tal usamos a classe Runtime:
        Runtime runtime = Runtime.getRuntime();
        int qtdProcessadores = runtime.availableProcessors();
        System.out.println("Qtd de processadores: " + qtdProcessadores);

        while (true) {

            Socket socket = servidor.accept();
            System.out.println("Aceitando novo cliente na porta: " + socket.getPort() + socket.getInetAddress());

            DistribuirTarefas distribuirTarefas = new DistribuirTarefas(socket);
            threadPool.execute(distribuirTarefas);
        }
    }
}