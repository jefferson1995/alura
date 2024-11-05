package com.jefferson.demo;

public class Anotacoes {

    //Começando Reflection

    //AULA 1

//    Essa aula nos apresentou um problema bem comum em aplicações Java: como lidar com requisições dinâmicas, onde a URL pode variar e o tipo de objeto retornado também.
//    Imagine que você está construindo um sistema que recebe pedidos de produtos por uma URL. A URL pode ser /produto/1, /produto/2, /cliente/1, etc.
//    Para resolver isso, poderíamos usar vários ifs para verificar cada URL e executar o código correspondente. Mas, essa solução é bem complexa e difícil de manter, principalmente se o número de URLs e tipos de objetos aumentar.
//    Aí que entra a Reflection! Ela nos permite "inspecionar" as classes e métodos em tempo de execução, sem precisar de muitos ifs.


    //AULA 2

//    Nessa aula, aprendemos como criar objetos de uma classe usando a Reflection. Vimos três maneiras de obter um objeto do tipo Class<T>:
//    getClass(): Usando o método getClass() de um objeto já existente, podemos obter um objeto Class<T> que representa a classe do objeto.
//    Class Literal: Podemos usar a sintaxe NomeDaClasse.class para obter um objeto Class<T> que representa a classe NomeDaClasse.
//    forName(): Usando o método estático forName() da classe Class, podemos obter um objeto Class<T> a partir do fully qualified name da classe.
//    Depois de obtermos um objeto Class<T>, podemos usar o método newInstance() para criar uma nova instância da classe.
//    Lembre-se que o método newInstance() foi depreciado a partir do JDK 9, então é importante estar atento a isso!



    //AULA 3

//    Nessa aula, aprendemos a usar a classe Class<T> para criar objetos em Java. Vimos como usar o método Class.forName() para obter uma instância de uma classe a partir do seu nome completo. Também aprendemos a usar o método newInstance() para criar uma nova instância de um objeto.
//    Além disso, exploramos como tratar as exceções que podem ser lançadas pelos métodos forName() e newInstance().
//    Para finalizar, vimos como usar a classe Character para manipular strings e colocar a primeira letra de uma string em maiúscula.




}
