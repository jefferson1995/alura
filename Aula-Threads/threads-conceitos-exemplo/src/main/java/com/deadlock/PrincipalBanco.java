package com.deadlock;

public class PrincipalBanco {
    public static void main(String[] args) {

        GerenciamentoDeTransacao tx = new GerenciamentoDeTransacao();
        PoolDeConexao pool = new PoolDeConexao();

        new Thread(new TarefaAcessaBanco(pool, tx)).start();
        new Thread(new TarefaAcessaBancoProcedimento(pool, tx)).start();

    }
}


//Essa aula te apresenta um problema que pode acontecer quando threads precisam acessar mais de um recurso ao mesmo tempo: o deadlock.
//Para entender o deadlock, a aula usa o exemplo de uma aplicação web que precisa acessar um banco de dados. Para isso, ela usa um pool de conexões e um gerenciador de transações.
//A aula simula o acesso a esses recursos por dois threads, mostrando como a ordem em que os threads tentam obter as "chaves" (blocos synchronized) dos recursos pode levar a um deadlock.
//No final, a aula mostra como resolver o problema, garantindo que os threads sempre tentem obter as chaves na mesma ordem.