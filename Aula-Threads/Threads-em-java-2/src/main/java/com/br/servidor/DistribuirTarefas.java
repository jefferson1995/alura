package com.br.servidor;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class DistribuirTarefas implements Runnable {

    private Socket socket;

    public DistribuirTarefas(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {

            System.out.println("Distribuindo as tarefas para o cliente " + socket);

            Scanner entradaCliente = new Scanner(socket.getInputStream());

            while (entradaCliente.hasNextLine()) {
                String linha = entradaCliente.nextLine();
                System.out.println(linha);
            }
            Thread.sleep(20000);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
