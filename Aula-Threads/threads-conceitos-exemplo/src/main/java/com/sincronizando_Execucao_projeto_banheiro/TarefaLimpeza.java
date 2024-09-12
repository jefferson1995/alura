package com.sincronizando_Execucao_projeto_banheiro;

public class TarefaLimpeza implements Runnable {

    private Banheiro banheiro;

    public TarefaLimpeza(Banheiro banheiro) {
        this.banheiro = banheiro;
    }

    //         Nessa aula, aprendemos a lidar com a limpeza do banheiro em nosso programa de multithreading.
    //
    // Primeiro, vimos como garantir que o banheiro esteja limpo antes de um convidado entrar, usando um loop while para verificar se ele está sujo.
    //
    // Depois, implementamos a limpeza periódica, fazendo com que a tarefa de limpeza seja executada a cada 15 segundos, garantindo que o banheiro esteja sempre limpo.
    //
    // Por fim, aprendemos a usar threads Daemon, que são threads que só rodam enquanto outras threads estão ativas. Isso garante que a limpeza só seja executada enquanto houver convidados no programa.
    //
    // Com essas técnicas, conseguimos garantir que o banheiro esteja sempre limpo e que o programa funcione corretamente, mesmo com vários convidados usando o banheiro ao mesmo tempo.

    @Override
    public void run() {

        while (true) {
            banheiro.limpaBanheiro();
            try {
                Thread.sleep(20000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
