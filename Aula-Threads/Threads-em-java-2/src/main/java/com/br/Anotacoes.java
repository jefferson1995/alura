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





}
