package com.deadlock;

public class TarefaAcessaBancoProcedimento implements Runnable {

    private PoolDeConexao pool;
    private GerenciamentoDeTransacao tx;

    public TarefaAcessaBancoProcedimento(PoolDeConexao pool, GerenciamentoDeTransacao tx) {
        this.pool = pool;
        this.tx = tx;
    }

    @Override
    public void run() {
        synchronized (pool) {

            System.out.println("Peguei a conexão");
            pool.getConnection();

            synchronized (tx) {
                System.out.println("Começando a tx");
                tx.begin();
            }
        }
    }
}
