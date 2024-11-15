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


    //Aplicando o Set no modelo

    //AULA1

//    Nessa aula, aprendemos a usar o Set na prática, aplicando-o em nosso modelo de curso.
//    Criamos a classe Aluno com os atributos nome e numeroMatricula, e a classe Curso com um Set de alunos.
//    Utilizamos o TDD (Test Driven Development) para criar o método matricula na classe Curso, que adiciona um aluno ao Set.
//    Também criamos o getter de alunos em Curso, retornando um Set imutável para garantir a segurança dos dados.
//    Por fim, aprendemos a exibir os alunos do curso, utilizando o método toString da classe Aluno para formatar a saída.
//    Lembre-se que o Set não garante a ordem dos elementos inseridos, então se você precisa de uma ordem específica, a List é a melhor opção.


    //Equal e hashcode

    //AULA 1

//    Essa aula foi muito importante para entendermos como o método equals e o hashCode funcionam em conjunto para garantir a eficiência das coleções do Java, principalmente os Sets.
//    Vimos que o equals define quando dois objetos são considerados iguais, e o hashCode gera um número único para cada objeto, que é usado para agrupar objetos semelhantes na tabela de espalhamento do Set.
//    Se você sobrescrever o equals, precisa também sobrescrever o hashCode para garantir que objetos considerados iguais pelo equals também tenham o mesmo hashCode. Isso garante que a busca por objetos no Set seja rápida e eficiente.
//    Lembre-se que o hashCode deve ser implementado de forma que gere números diferentes para objetos diferentes, e números iguais para objetos iguais, de acordo com a sua implementação do equals.

//    Imagine que você está organizando um grande evento com várias pessoas. Para facilitar a organização, você decide criar grupos de pessoas com características em comum, como por exemplo, grupos por idade, por profissão ou por interesse em um tema específico.
//    O hashCode seria como um número de identificação do grupo, e o equals seria como a regra que define quem pertence a cada grupo.
//    Se você define que pessoas com a mesma idade pertencem ao mesmo grupo, o equals seria a regra que compara a idade de duas pessoas para determinar se elas pertencem ao mesmo grupo. O hashCode seria um número único para cada grupo de idade, como por exemplo, 1 para o grupo de 18 a 25 anos, 2 para o grupo de 26 a 35 anos, e assim por diante.
//    Se você mudar a regra do equals para agrupar pessoas por profissão, você também precisa mudar a forma como o hashCode é calculado, para que ele gere números únicos para cada grupo de profissão.
//    Assim como no evento, o hashCode e o equals trabalham juntos para organizar os objetos em grupos, garantindo que a busca por um objeto específico seja rápida e eficiente.


    //Outros sets e iterators

    //AULA1

//    Nesta aula, aprendemos sobre outras implementações de Set, como o LinkedHashSet e o TreeSet. O LinkedHashSet mantém a ordem de inserção dos elementos, enquanto o TreeSet organiza os elementos de forma natural, exigindo que a classe dos elementos implemente a interface Comparable.
//    Também exploramos o Iterator, um objeto que permite iterar sobre os elementos de uma coleção, acessando-os um a um. O Iterator é útil para percorrer coleções em código legado, antes do Java 5, e oferece métodos como hasNext e next para verificar se há um próximo elemento e acessá-lo, respectivamente.
//    Por fim, conhecemos a classe Vector, uma implementação antiga de lista que era utilizada antes da interface Collection. A Vector é thread safe, ou seja, pode ser utilizada por múltiplas threads simultaneamente, mas não é recomendada devido à existência de outras formas mais eficientes de trabalhar com coleções em ambientes multithread.


    //Qual collection usar

//    Essa aula nos ensinou sobre a importância de escolher a Collection ideal para cada situação. Vimos que a interface Collection é a base para todas as outras, como List e Set, e que cada uma tem suas vantagens e desvantagens.
//    Para escolher a Collection certa, precisamos analisar se precisamos de uma ordem específica (como na List) ou se a ordem não importa (como no Set). Também precisamos considerar se queremos permitir elementos repetidos ou não.
//    A aula nos mostrou que podemos declarar um atributo como Collection inicialmente, e depois, conforme a necessidade, podemos definir qual interface usar, como ArrayList ou HashSet.
//    Essa flexibilidade nos permite escrever código mais genérico e adaptável, e com o tempo, vamos aprender a escolher a Collection ideal para cada situação!


    //Mapas

    //AULA1

//    Nesta aula, aprendemos sobre a interface Map e como ela pode ser utilizada para criar associações entre chaves e valores. Vimos que o Map é uma estrutura de dados muito útil para realizar buscas eficientes, especialmente quando precisamos encontrar um valor específico a partir de uma chave.
//    A implementação mais comum de Map é o HashMap, que utiliza uma tabela de espalhamento para armazenar as associações. O HashMap é muito rápido para realizar buscas, inserções e remoções, tornando-o ideal para cenários onde a performance é crucial.
//    Também exploramos outras implementações de Map, como o LinkedHashMap, que mantém a ordem de inserção dos elementos, e o HashTable, que é uma implementação antiga e thread safe.
//    Por fim, aprendemos que é importante consultar a documentação do java.util para explorar as diversas funcionalidades e métodos já implementados para as coleções do Java.



}
