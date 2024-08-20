package com.buscaTextual;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TarefaBuscaTextual implements Runnable {

    private String file;
    private String nome;

    public TarefaBuscaTextual(String file, String nome) {
        this.file = file;
        this.nome = nome;
    }

    @Override
    public void run() {
        try {
            Scanner scanner = new Scanner(new File(file));
            int numeroLinha = 1;
            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                if (linha.toLowerCase().contains(nome)) {
                    System.out.println("nome arquivo " + " - " + numeroLinha + " - " + linha);
                }

                numeroLinha++;
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
