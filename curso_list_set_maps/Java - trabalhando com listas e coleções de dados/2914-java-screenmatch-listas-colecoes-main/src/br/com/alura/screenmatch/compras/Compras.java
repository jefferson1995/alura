package br.com.alura.screenmatch.compras;

import java.util.Comparator;

public class Compras implements Comparable<Compras> {
    private String descricao;

    private double valor;
    public Compras(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public int compareTo(Compras outraCompras) {
        return Double.valueOf(this.valor).compareTo(Double.valueOf(outraCompras.valor));
    }

    @Override
    public String toString() {
        return "Compras: descricao = " + descricao + '\'' +
                ", valor= " + valor;
    }
}
