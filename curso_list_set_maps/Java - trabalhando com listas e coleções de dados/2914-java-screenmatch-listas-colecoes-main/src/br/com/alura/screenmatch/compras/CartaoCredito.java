package br.com.alura.screenmatch.compras;

import java.util.ArrayList;
import java.util.List;

public class CartaoCredito {

    private double limite;
    private double saldo;

    private List<Compras> compras = new ArrayList<>();

    public CartaoCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
    }

    public boolean lancaCompra(Compras compra) {
        if(this.saldo >= compra.getValor()) {
            this.saldo -= compra.getValor();
            return true;
        }
        addCompras(compra);
        return false;
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compras> getCompras() {
        return compras;
    }

    public void addCompras(Compras compras) {
        this.compras.add(compras);
    }

    @Override
    public String toString() {
        return "CartaoCredito: saldo= " + String.format("%.2f ", saldo);
    }
}
