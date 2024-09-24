package com.deadlock;

public class TarefaAcessaBanco implements Runnable {

    private PoolDeConexao pool;
    private GerenciamentoDeTransacao tx;

    public TarefaAcessaBanco(PoolDeConexao pool, GerenciamentoDeTransacao tx) {
        this.pool = pool;
        this.tx = tx;
    }

    @Override
    public void run() {

        synchronized (pool) {
            System.out.println("Peguei a chave do pool");
            pool.getConnection();

            synchronized (tx) {
                System.out.println("começando a gerenciar a tx");
                tx.begin();
            }
        }
    }
}
