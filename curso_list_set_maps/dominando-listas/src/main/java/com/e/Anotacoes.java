package com.e;

public class Anotacoes {


    //Relacionamento com coleções

    //Aula 1
//    Nessa aula, aprendemos sobre a importância de usar a interface List ao invés de uma implementação específica como ArrayList ou LinkedList. Isso nos permite ter mais flexibilidade para trocar a implementação da lista no futuro, sem precisar reescrever código.
//    Também vimos como encapsular a manipulação da lista de aulas dentro da classe Curso, criando o método adiciona para adicionar novas aulas.
//    E para garantir que a lista de aulas não seja modificada diretamente, aprendemos a usar o método Collections.unmodifiableList para retornar uma cópia não modificável da lista.
//    Por fim, exploramos as diferenças entre ArrayList e LinkedList em termos de performance, com ArrayList sendo mais eficiente para acesso aleatório e LinkedList sendo mais eficiente para inserção e remoção no início da lista.
//    Lembre-se que a escolha entre ArrayList e LinkedList depende do contexto e das necessidades do seu programa.


    //Mais praticas com relacionamento

    //Aula 1

//    Nessa aula, aprendemos como lidar com listas imutáveis (unmodifiable list) e como usar o Stream do Java 8 para calcular o tempo total das aulas de um curso.
//    Vimos que, ao tentar ordenar as aulas de um curso, recebemos uma UnsupportedOperationException porque o método getAulas retorna uma lista imutável. Para contornar isso, criamos uma nova lista com os mesmos elementos da lista imutável, usando o construtor do ArrayList.
//    Também exploramos o Stream do Java 8, que nos permite realizar operações em coleções de forma mais concisa e eficiente. Usamos o Stream para calcular o tempo total das aulas de um curso, sem precisar de um loop tradicional.
//    Por fim, aprendemos a sobrescrever o método toString da classe Curso para imprimir informações relevantes sobre o curso, como o nome, o instrutor, o tempo total das aulas e a lista de aulas.[
//    Lembre-se: a API do Java oferece muitas ferramentas prontas para facilitar o nosso trabalho. Explore-as e não tenha medo de usar o CTRL + Espaço no Eclipse para descobrir novas funcionalidades!


    //O Poder dos sets

    //AULA 1

//    Nesta aula, aprendemos sobre uma nova coleção chamada Set, que é como um "saco" de objetos, sem uma ordem definida.
//    A principal diferença entre Set e List é que Set não permite elementos repetidos, enquanto List sim.
//    Além disso, Set é muito mais rápido para procurar elementos, pois utiliza uma tabela de espalhamento, enquanto List faz uma busca linear.
//    Vimos também que podemos usar Set para guardar alunos em um curso, sem nos preocupar com a ordem em que eles foram adicionados.
//    E para acessar os elementos de um Set, podemos usar um foreach.



}
