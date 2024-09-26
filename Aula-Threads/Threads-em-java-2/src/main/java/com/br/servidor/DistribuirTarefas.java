package com.br.servidor;

import java.io.IOException;
import java.io.PrintStream;
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
            PrintStream saidaEnviarCliente = new PrintStream(socket.getOutputStream());

            while (entradaCliente.hasNextLine()) {

                String linha = entradaCliente.nextLine();


                switch (linha){
                    case "c1": {
                        saidaEnviarCliente.println("Confirmação comando c1");
                        break;
                    }
                    case "c2": {
                        saidaEnviarCliente.println("Confirmação comando c2");
                        break;
                    }
                    case "c3": {
                        saidaEnviarCliente.println("Confirmação comando c3");
                        break;
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
