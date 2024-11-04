package br.com.alura.screenmatch.compras;

import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o limite do cartão: ");
        double limite = sc.nextDouble();
        CartaoCredito cartaoCredito = new CartaoCredito(limite);


        int sair = 1;
        while (sair != 0) {
            System.out.println("Digite a descrição da compra: ");
            sc.nextLine();
            String descricao = sc.nextLine();

            System.out.println("Digite o valor do compra: ");
            double valor = sc.nextDouble();

            Compras compras = new Compras(descricao, valor);
            boolean compraRealizada = cartaoCredito.lancaCompra(compras);

            if (compraRealizada) {
                System.out.println("Compra realizada com sucesso!");
                cartaoCredito.addCompras(compras);
                System.out.println("Digite 0 para sair ou 1 para continuar...");
                sair = sc.nextInt();
            }else {
                System.out.println("Saldo insuficiente! ");
                System.out.println(cartaoCredito.toString());
                System.out.println("Digite 0 para sair ou 1 para continuar...");
                sair = sc.nextInt();
            }

        }

        System.out.println("Saldo cartão: " + cartaoCredito.getSaldo());
        if (!cartaoCredito.getCompras().isEmpty()) {
            System.out.println("COMPRAS REALIZADAS");
            Collections.sort(cartaoCredito.getCompras());
            cartaoCredito.getCompras().forEach(comprasCartao -> System.out.println(comprasCartao.toString()));
            System.out.println("--------------------");
        }
    }
}
