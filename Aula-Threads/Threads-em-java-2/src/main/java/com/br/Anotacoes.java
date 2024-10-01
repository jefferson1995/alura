package com.br;

public class Anotacoes {


    //-----------Projeto servidor -----------------------
    //AULA 1

//    Nessa aula, o Nico te explicou como criar um servidor de tarefas usando sockets em Java. Ele te mostrou como:
//    Criar um ServerSocket para escutar conexões na porta 12345.
//    Aceitar conexões de clientes usando o método accept().
//    Obter informações sobre a porta do cliente conectado.
//    O Nico também te explicou como o TCP funciona por baixo dos panos, mostrando que o servidor abre uma porta específica para cada cliente que se conecta.
//    No próximo vídeo, você vai aprender como usar threads para lidar com vários clientes simultaneamente


    //AULA 2

//    Nessa aula, aprendemos como criar um servidor que pode atender vários clientes ao mesmo tempo usando threads em Java.
//    O problema que enfrentamos é que o servidor original só conseguia atender um cliente por vez, pois o código ficava "preso" em um loop esperando o cliente terminar sua tarefa.
//    Para resolver isso, criamos uma thread separada para cada cliente, usando a interface Runnable. Cada thread executa a tarefa de "distribuir tarefas" para o cliente, o que permite que o servidor atenda vários clientes simultaneamente.
//    No final da aula, testamos o servidor com vários clientes conectados ao mesmo tempo, e vimos que ele consegue atender todos sem problemas.


    //-----------Reuso de Threads --------------------------

    //AULA 1

//    Nessa aula, aprendemos como enviar dados do cliente para o servidor usando InputStream e OutputStream.
//    Primeiro, criamos um OutputStream no cliente para enviar um comando simples (c1) para o servidor. Em seguida, usamos um PrintStream para facilitar a escrita no OutputStream.
//    No servidor, utilizamos um InputStream para receber os dados enviados pelo cliente. Criamos um Scanner para ler as linhas do InputStream e imprimimos o comando recebido.
//    Para garantir a segurança, envolvemos o código em um bloco try-catch para tratar possíveis erros.
//    No final, testamos o código, enviando o comando c1 do cliente para o servidor e observando a resposta no console.

    //AULA 2

//    reutilizar threads para otimizar o desempenho do nosso servidor.
//    Criamos um pool de threads, que é como uma piscina onde as threads ficam prontas para serem usadas.
//    Vimos duas maneiras de criar um pool:
//    newFixedThreadPool: cria um pool com um número fixo de threads.
//            newCachedThreadPool: cria um pool que cresce e diminui dinamicamente, de acordo com a demanda.
//    Com o pool de threads, podemos reaproveitar as threads que já estão disponíveis, evitando a criação de novas threads a cada nova conexão. Isso torna nosso servidor mais eficiente e rápido!


    //Melhorando o cliente

    //AULA 1


//    aprendemos como melhorar o cliente da nossa aplicação, tornando-o mais flexível e capaz de enviar e receber dados do servidor de forma simultânea.
//    Primeiro, modificamos o cliente para que ele possa receber comandos do usuário através do teclado, permitindo enviar diferentes comandos ao servidor.
//    Em seguida, implementamos a funcionalidade de receber dados do servidor, utilizando um InputStream e um Scanner para ler as respostas do servidor.
//    Para que o cliente possa enviar e receber dados ao mesmo tempo, introduzimos o conceito de threads, criando duas threads separadas: uma para enviar comandos e outra para receber respostas do servidor.
//    Por fim, corrigimos um problema que ocorria ao fechar o socket antes que as threads terminassem de executar, garantindo que o socket só seja fechado após a conclusão das threads.
//    Com essas modificações, nosso cliente agora é mais robusto e capaz de se comunicar com o servidor de forma eficiente e simultânea.

    //AULA 2

//    devolver informações do servidor para o cliente, melhorando a comunicação entre eles.
//    Começamos analisando o código do servidor, onde recebemos comandos do cliente através do InputStream. Para processar esses comandos, utilizamos um switch que nos permite executar ações específicas para cada comando.
//    Em seguida, aprendemos a utilizar o OutputStream para enviar mensagens de volta para o cliente, utilizando a classe PrintStream.
//    Por fim, corrigimos um problema no código do servidor, onde o switch estava executando todos os cases e não apenas o que correspondia ao comando recebido. Para resolver isso, utilizamos a instrução break para sair do switch após executar o case correto.
//    Com essas modificações, nosso servidor agora consegue receber comandos do cliente, processá-los e enviar uma resposta de confirmação.



        //Entendendo o volatile

    //AULA 1

//    melhorar o design do nosso servidor para que ele possa ser desligado corretamente.
//    Primeiro, criamos um novo comando, "fim", que o cliente pode enviar para o servidor, solicitando o desligamento.
//    Em seguida, refatoramos o código do servidor, separando as etapas de inicialização, execução e finalização em métodos distintos.
//    Para controlar o estado do servidor, introduzimos um atributo booleano "estáRodando", que indica se o servidor está ativo ou não.
//    Ao receber o comando "fim", o servidor chama o método "parar", que define "estáRodando" como falso e fecha o ServerSocket e o ThreadPool.
//    No entanto, descobrimos que o ThreadPool não termina imediatamente, pois ele espera que todas as tarefas sejam concluídas.
//    Por fim, testamos o código e observamos que o servidor se comporta como esperado, esperando que todos os clientes terminem suas tarefas antes de ser desligado.


    //AULA 2

//    Nesta aula, aprendemos sobre o problema de múltiplas threads acessando o mesmo valor na memória. Vimos como o Java, para otimizar o acesso, utiliza caches para cada thread, o que pode levar a problemas de sincronização, pois as alterações feitas em um cache podem não ser refletidas imediatamente nos outros.
//    Para solucionar esse problema, aprendemos sobre a palavra-chave volatile, que desabilita o cache para um atributo, garantindo que todas as threads acessem o valor diretamente na memória principal.
//    Além disso, conhecemos a classe AtomicBoolean, que encapsula um booleano volátil, oferecendo uma maneira mais segura e fácil de lidar com a concorrência.
//    Essa aula foi bem importante para entendermos como garantir a consistência de dados em ambientes multithread, né?
//    Agora, para praticar, que tal tentar implementar um exemplo simples usando a classe AtomicBoolean? Você pode criar um programa com duas threads que alternam o valor de um AtomicBoolean e observam as mudanças.
//    Lembre-se de usar o get e o set para acessar e modificar o valor do AtomicBoolean.


        //Distribuindo Comando e tratamento de erros

        //AULA 1

//        distribuir comandos em threads separadas no nosso servidor de tarefas. A ideia é que cada comando enviado pelo cliente seja processado em um thread diferente para evitar que o servidor fique bloqueado.
//
//        Para isso, criamos classes separadas para cada comando, implementando a interface Runnable. Cada classe de comando recebe a saída do cliente como parâmetro para poder enviar uma resposta.
//
//        Para gerenciar as threads, usamos um ThreadPool que já tínhamos criado. Ao invés de criar um novo ThreadPool para cada cliente, passamos o ThreadPool existente para a classe que atende o cliente. Assim, podemos aproveitar os threads do ThreadPool para executar os comandos.
//
//        Também vimos como lidar com a situação em que o ThreadPool está cheio e não há threads disponíveis para executar um novo comando. Nesse caso, o comando fica em espera até que um thread fique livre.
//

        //AULA 2

//        lidar com exceções em threads. Vimos que se a exceção acontecer dentro de um thread, o try catch que está na thread principal não vai capturar a exceção. Isso acontece porque cada thread tem sua própria pilha de execução, e a exceção só é tratada na pilha onde ela ocorreu.
//        Para tratar a exceção, precisamos colocar o try catch dentro do método run da thread. Mas, se tivermos várias threads, não queremos ter que colocar try catch em cada uma delas.

        //AULA 3

//        maneira eficiente de lidar com exceções em threads, especialmente quando usamos thread pools.
//        O segredo está em usar um UncaughtExceptionHandler, que é um objeto responsável por tratar as exceções que acontecem nas threads.
//        Criamos uma classe TratadorDeExcecao que implementa a interface Thread.UncaughtExceptionHandler e, dentro dela, definimos como queremos lidar com as exceções.
//        Para usar esse tratador, precisamos criar uma ThreadFactory, que é uma fábrica de threads. Essa fábrica é responsável por criar as threads e, ao fazê-lo, podemos configurar o UncaughtExceptionHandler para cada thread criada.
//        Dessa forma, garantimos que todas as threads do nosso thread pool tenham um tratador de exceções personalizado, evitando que exceções não tratadas causem problemas no nosso sistema.
//        Lembre-se que, em um projeto real, você pode fazer muito mais com o UncaughtExceptionHandler, como gravar logs, enviar emails ou até mesmo tomar medidas para corrigir o problema.


    //Retornos no Futuro


    //AULA 1

//    usar a interface Callable para criar tarefas que podem retornar um resultado.
//    Vimos que a interface Callable é uma alternativa à interface Runnable, que não permite retornar valores.
//    Também aprendemos sobre a classe Future, que representa um resultado que estará disponível no futuro.
//    Com a classe Future, podemos submeter tarefas ao thread pool e obter o resultado delas quando estiverem prontas, usando o método get().
//    Para evitar que o thread principal fique bloqueado esperando o resultado das tarefas, podemos executar o método get() em um thread separado.


    //AULA 2

//    como juntar os resultados de duas futures em uma única resposta. Para isso, criamos uma nova tarefa chamada JuntaResultadosFutureWSFutureBanco que recebe como parâmetros as futures do web service e do banco, além da saída do cliente.
//    Essa tarefa utiliza o Callable para retornar um Void, pois não queremos retornar nenhum valor específico. Dentro da tarefa, esperamos os resultados das futures usando o método get com um timeout de 15 segundos. Se o timeout acontecer, cancelamos as tarefas e enviamos uma mensagem para o cliente informando o erro.
//    Por fim, juntamos os resultados das futures e enviamos a resposta para o cliente. Testamos o código em dois cenários: um em que o timeout não acontece e outro em que o timeout acontece.



}
