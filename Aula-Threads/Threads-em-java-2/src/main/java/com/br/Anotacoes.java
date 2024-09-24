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




}
