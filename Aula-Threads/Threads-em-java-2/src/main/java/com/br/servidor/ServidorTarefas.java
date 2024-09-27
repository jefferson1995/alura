package com.br.servidor;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

public class ServidorTarefas {


    private ExecutorService executor;
    private ServerSocket servidor;
    private AtomicBoolean controleServidor;

    public ServidorTarefas() throws IOException {
        System.out.println("--------iniciando servidor----------");
        this.servidor = new ServerSocket(12345);
        this.executor = Executors.newCachedThreadPool();
        this.controleServidor = new AtomicBoolean(true);
    }

    public static void main(String[] args) throws IOException, InterruptedException {

        ServidorTarefas servidor = new ServidorTarefas();
        servidor.rodar();
        servidor.parar();


    }

    public void rodar() {

        while (controleServidor.get()) {

            try {
                Socket socket = servidor.accept();
                System.out.println("Aceitando novo cliente na porta: " + socket.getPort() + socket.getInetAddress());

                DistribuirTarefas distribuirTarefas = new DistribuirTarefas(socket, this);
                executor.execute(distribuirTarefas);
                this.controleServidor.set(true);
                System.out.println("--------Quantidade de threads----------- ");
                quantidadeDeThreads();
            } catch (SocketException e) {
                System.out.println("SocketException, está rodando? " + controleServidor);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }

    public void parar() throws IOException {
        this.controleServidor.set(false);
        executor.shutdown();
        servidor.close();
    }

    public void quantidadeDeThreads() {

        if(controleServidor.get()) {

            //devolve um conjunto com todas as threads da JVM.
            Set<Thread> todasAsThreads = Thread.getAllStackTraces().keySet();

            for (Thread thread : todasAsThreads) {
                System.out.println("Nome Thread: " + thread.getName());
            }

            //As informações que a JVM expõe não param por ai. Também podemos "perguntar" quantos processadores temos disponíveis. Para tal usamos a classe Runtime:
            Runtime runtime = Runtime.getRuntime();
            int qtdProcessadores = runtime.availableProcessors();
            System.out.println("Qtd de processadores: " + qtdProcessadores);
        }
    }
}