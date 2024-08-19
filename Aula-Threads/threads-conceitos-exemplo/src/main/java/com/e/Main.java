package com.e;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Hello world!");
            System.out.println("Isso é um thread main ");
            //Aqui ele fica esperando um tempo para depois terminar o programa.
            Thread.sleep(30000);
        }catch (InterruptedException e) {
            try {
                throw new InterruptedException(e.getMessage());
            } catch (InterruptedException ex) {
                throw new RuntimeException(ex);
            }
        }finally {
            System.out.println("Programa finalizado após o sleep da thread. ");
        }

    }
}