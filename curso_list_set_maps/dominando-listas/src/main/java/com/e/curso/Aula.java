package com.e.curso;

public class Aula implements Comparable<Aula>{
    private String nome;

    private String descricao;
    public Aula(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int compareTo(Aula aula) {
        return this.nome.compareTo(aula.getNome());
    }

    @Override
    public String toString() {
        return "Aula{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
