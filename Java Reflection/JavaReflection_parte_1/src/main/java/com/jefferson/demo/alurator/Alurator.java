package com.jefferson.demo.alurator;

public class Alurator {

    private String pacoteBase;

    public Alurator(String pacoteBase) {
        this.pacoteBase = pacoteBase;
    }

    public Object executa(String url) {

        String[] urls = url.replaceFirst("/", "")
                .split("/");
        String nomeControle = Character.toUpperCase(urls[0].charAt(0)) + urls[0].substring(1) + "Controller";
        try {
            Class<?> classeControle = Class.forName(pacoteBase + nomeControle);

            Object instancioControle = classeControle.newInstance();

            System.out.println(instancioControle);

            return null;

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
