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

}
