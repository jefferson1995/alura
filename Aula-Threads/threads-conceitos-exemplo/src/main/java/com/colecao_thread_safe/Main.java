package com.colecao_thread_safe;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        //Nessa aula, aprendemos como lidar com múltiplos threads acessando a mesma lista. Vimos que, sem sincronização, a lista pode acabar com elementos nulos, pois threads podem tentar acessar a mesma posição ao mesmo tempo.
        // Para resolver esse problema, utilizamos o método synchronized para garantir que apenas um thread acesse o método adicionaElementos por vez. Isso garante que a lista seja preenchida corretamente, sem elementos anulos.
        //
        // Vimos também que podemos usar o synchronized tanto dentro do bloco de código quanto na assinatura do método.
        //
        // No final, aprendemos que a lista padrão do Java (java.util.List) não é automaticamente sincronizada, então precisamos tomar cuidado ao usá-la com múltiplos threads.




        Lista lista = new Lista();

        //List<String> lista = new ArrayList<>();
        //List<String> lista = Collections.synchronizedList(new ArrayList<String>());

        for (int i = 0; i < 10; i++) {
            new Thread(new TarefaAdicionarElemento(lista, i)).start();
        }


        new Thread(new TarefaImprimir(lista)).start();

        Thread.sleep(2000);

    }







    // Vimos na aula a classe java.util.Vector em ação, mas a API de Collections possuem muito mais interfaces e implementações.
    //
    // Dentro dessa API existem 4 interfaces principais: java.util.Collection, java.util.List, java.util.Set e java.util.Map.
    //
    //
    //
    // Se a classe Vector é a versão thread-safe de uma lista, será que existem para as outras interfaces implementações thread-safe? Claro que sim!
    //
    // Para os mapas (Map) podemos usar a antiga classe Hashtable:
    //
    // Map mapaThreadSafe = new Hashtable();Copiar código
    // E também temos uma implementação mais recente e performática de mapas, a classe ConcurrentHashMap:
    //
    // //do pacote java.util.concurrent
    // Map mapaThreadSafe = new ConcurrentHashMap();Copiar código
    // Para o Set (conjunto) não existe uma implementação pronta na API padrão do Java mas podemos utilizar a classe Collections para construir um Set sincronizado:
    //
    // Set conjunto = Collections.synchronizedSet(new HashSet());




    //wait antes de notify
//    Nessa aula, aprendemos sobre um problema que pode acontecer quando usamos wait() e notify() em threads: a possibilidade de um thread chamar wait() antes de receber uma notificação. Isso pode acontecer se a lista for preenchida muito rápido, e a notificação acontecer antes do thread chamar wait().
//
//    Para evitar esse problema, criamos um método auxiliar chamado estaCheia() na classe Lista. Esse método verifica se a lista está cheia, e só então o thread chama wait(). Dessa forma, garantimos que o thread não ficará esperando indefinidamente por uma notificação que nunca chegará.
//
//    Você está acompanhando tudo direitinho? Se tiver alguma dúvida, pode me perguntar!

}
