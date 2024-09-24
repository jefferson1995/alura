package com.br.servidor;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        System.out.println("--------iniciando servidor----------");
        ServerSocket servidor = new ServerSocket(12345);

        while (true) {

            Socket socket = servidor.accept();
            System.out.println("Aceitando novo cliente na porta: " + socket.getPort() + socket.getInetAddress());

            DistribuirTarefas distribuirTarefas = new DistribuirTarefas(socket);
            Thread threadCliente = new Thread(distribuirTarefas);

            threadCliente.start();
        }
    }
}