package com.br.cliente;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ClienteTarefas {
    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("localhost", 12345);
        System.out.println("conexão estabelecida com sucesso!");

        Scanner teclado = new Scanner(System.in);
        teclado.nextLine();

        socket.close();

    }
}
