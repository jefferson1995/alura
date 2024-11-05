package com.jefferson.demo.estoque;

import com.jefferson.demo.alurator.Alurator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
            Casos possiveis:

            /controlador/metodo
            /controlador/metodo?param1=valor1&param2=valor2
         */

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite a url: ");
            String url = sc.nextLine();

            Alurator alurator = new Alurator("com.jefferson.demo.estoque.controller.");
            while (!url.equals("exit")){
                Object response = alurator.executa(url);

                System.out.println("Response: " + response);

                url = sc.nextLine();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
