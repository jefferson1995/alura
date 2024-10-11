package br.com.alura;

public class Anotacoes {

//Java threads: aprenda a criar, gerenciar e aplicar com o Spring


    //Utilizando threads em Java

    //AULA 1

//    importância de simular situações reais no código, especialmente quando queremos representar ações que acontecem ao mesmo tempo.
//    Usando o exemplo de um saque bancário, vimos como podemos criar um código em Java para simular dois saques simultâneos, um de João e outro de Maria, usando a mesma conta.
//    No entanto, o código atual executa os saques de forma sequencial, um após o outro, o que não representa a realidade de dois saques simultâneos.
//    Para solucionar esse problema, vamos aprender sobre threads na próxima aula!


    //AULA 2

//    utilizar threads em Java para simular tarefas paralelas. Vimos que threads são como linhas de execução que permitem que nosso programa execute várias tarefas ao mesmo tempo.
//    Para usar threads, criamos um objeto Thread e passamos um Runnable para ele, que define a tarefa que a thread deve executar. Em seguida, usamos o método start() para iniciar a thread.
//    Utilizamos o exemplo de um banco para entender como as threads podem ser usadas para simular saques paralelos. Criamos duas threads, saqueJoao e saqueMaria, que executam a mesma operação de saque, mas em paralelo.
//    Ao executar o programa, vimos que as threads foram iniciadas e executadas simultaneamente, mostrando que as operações de saque foram realizadas em paralelo.
//    Também aprendemos a verificar o nome da thread atual usando o método Thread.currentThread().getName(). Isso nos permite identificar qual thread está sendo executada em um determinado momento.
//    No entanto, percebemos que a execução paralela dos saques resultou em um saldo negativo na conta, o que não é válido em um banco. Para resolver esse problema, precisamos aprender a lidar com os recursos das threads, o que faremos nas próximas aulas.


    //AULA 3

//    aprendemos como evitar o saldo negativo na conta ao realizar saques paralelos. Vimos que, ao usar threads, o sistema operacional decide a ordem de execução, o que pode levar a um saldo negativo.
//    Para resolver esse problema, usamos a palavra-chave synchronized no método executa() da classe OperacaoSaque. Isso cria um "lock" na operação, garantindo que apenas uma thread possa executar o método por vez.
//    Com o synchronized, João, por exemplo, pode iniciar e concluir o saque antes de Maria começar, evitando o saldo negativo. Essa sincronização garante que as informações sejam atualizadas corretamente, evitando erros.
//    No final, conseguimos simular saques paralelos de forma segura e eficiente, garantindo que o saldo da conta seja sempre positivo.
//    Agora, vamos implementar uma nova funcionalidade: exibir o saldo atual ao final de todos os saques na classe AppBanco.
//
//
//    aprofundando no assunto de locks e deadlocks!
//
//    Para te ajudar a entender melhor, vamos imaginar um exemplo bem simples:
//
//    Imagine duas threads, a Thread A e a Thread B, que precisam acessar dois recursos, o Recurso X e o Recurso Y.
//
//    A Thread A precisa do Recurso X primeiro e depois do Recurso Y.
//    A Thread B precisa do Recurso Y primeiro e depois do Recurso X.
//    Agora, vamos supor que a Thread A conseguiu pegar o Recurso X, mas a Thread B conseguiu pegar o Recurso Y.
//
//    Nesse momento, a Thread A está esperando a Thread B liberar o Recurso Y para poder continuar, e a Thread B está esperando a Thread A liberar o Recurso X para poder continuar.
//
//    Essa situação é um deadlock! As duas threads estão bloqueadas, esperando uma pela outra, e nenhuma consegue prosseguir.
//
//    É como se duas pessoas estivessem em um corredor estreito e nenhuma das duas pode passar porque estão bloqueando o caminho uma da outra.
//
//    É importante lembrar que deadlocks podem acontecer em situações mais complexas, com mais threads e recursos, e podem ser difíceis de detectar e resolver.
//
//    Lembre-se que o uso de locks é fundamental para garantir a segurança e a consistência do código em ambientes concorrentes, mas é preciso ter cuidado para evitar deadlocks.


    //AULA 4

//    importância de esperar as threads finalizarem antes de executar outras operações, especialmente quando queremos garantir que o resultado final seja preciso.
//    Vimos que, sem o uso do método join(), a thread main pode executar suas operações antes que as threads de saque terminem, resultando em um saldo final incorreto.
//    O método join() garante que a thread main espere as threads de saque finalizarem antes de prosseguir, garantindo que o saldo final seja calculado corretamente.
//    Com o join(), a thread main aguarda a conclusão das threads de saque antes de prosseguir com suas próprias operações, como imprimir o saldo final.


    //Melhorando a performance do sistema

    //AULA 1

//    Nessa aula, aprendemos a simular uma aplicação com muitas threads para entender como o sistema operacional pode ser sobrecarregado.
//    Criamos um projeto de simulação e usamos o ExecutorService para criar um pool de 10.000 threads. Em seguida, criamos 10.000 tarefas (representadas pela classe ExecutaTarefa) e as adicionamos ao pool.
//    Para medir o tempo de execução, usamos a classe Instant para marcar o início e o fim da execução das tarefas.
//    Ao executar o projeto, observamos que o sistema operacional conseguiu lidar com 10.000 threads sem problemas.
//    Depois, aumentamos o número de threads para 50.000 e 100.000. Com 50.000 threads, o computador começou a travar e o tempo de execução aumentou significativamente. Com 100.000 threads, o tempo de execução foi de 7 minutos.
//    Isso demonstra que criar muitas threads diretamente no sistema operacional pode sobrecarregá-lo, levando a problemas de performance.
//    Na próxima aula, vamos aprender sobre threads virtuais, que são uma forma mais eficiente de gerenciar threads, diminuindo o impacto no sistema operacional.


    //AULA 2

//    Nessa aula, aprendemos sobre as threads virtuais, uma maneira poderosa de melhorar o desempenho da nossa aplicação Java.
//    Vimos que, ao invés de criar threads diretamente no sistema operacional, as threads virtuais são gerenciadas pela JVM, que as mapeia para threads do sistema de forma mais eficiente. Isso significa que podemos ter um número muito maior de threads virtuais, sem sobrecarregar o sistema.
//    Utilizamos o ExecutorService para criar threads virtuais, e vimos como a performance da aplicação melhorou significativamente em comparação com as threads tradicionais.
//    No próximo vídeo, vamos aplicar esse conhecimento no projeto Adopet Store para otimizar o servidor e atender mais usuários!


}
