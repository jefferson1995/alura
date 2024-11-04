package br.com.alura.screenmatch;

public class Anotacoes {

    //Coleção de Filmes

    //AULA 1

//    Nessa aula, aprendemos a trabalhar com listas de objetos no Java, usando a classe ArrayList. Vimos como criar uma lista de filmes, adicionar filmes à lista e acessar os filmes por índice. Também aprendemos sobre o método size() para saber o tamanho da lista e o método get() para acessar um filme específico.
//    A aula também nos apresentou a importância da Orientação a Objetos no Java, mostrando como a classe ArrayList utiliza conceitos como herança, interfaces e encapsulamento.

    //AULA 2

//    Nessa aula, aprendemos sobre a importância da documentação do Java, o Javadoc, e como ele pode nos ajudar a entender melhor o funcionamento das classes e métodos.
//    Vimos que a classe Object é a "mãe" de todas as classes em Java, e que todas as classes herdam o método toString(), que retorna uma representação textual do objeto.
//    Aprendemos também como sobrescrever o método toString() para que ele retorne uma representação personalizada do objeto, e como isso impacta o comportamento de outras classes, como o ArrayList.



    //Construindo objetos

    //AULA 1

//    Nessa aula, aprendemos sobre construtores, que são como "receitas" para criar objetos. Eles definem como um objeto é inicializado, com quais valores e atributos.
//    Vimos que, ao criar um construtor, precisamos dar o mesmo nome da classe e ele não retorna nada. Também aprendemos que, ao criar um construtor personalizado, o construtor padrão (que não recebe parâmetros) deixa de existir, e precisamos criá-lo manualmente se precisarmos dele.
//    Além disso, discutimos a importância de pensar se realmente precisamos de um setter para um atributo, especialmente se ele for definido no construtor.
//    No final, vimos que construtores são essenciais para o desenvolvimento de aplicações Java, e que eles estão presentes em diversas classes que usamos, como o Scanner.


    //AULA 2

//    aprendemos como construir objetos de forma mais eficiente usando construtores.
//    Vimos que, ao criar um construtor na classe Titulo que recebe o nome e o ano de lançamento, precisamos atualizar as classes Filme e Serie para que elas também recebam esses parâmetros.
//    É importante lembrar que não existe herança de construtores, então precisamos criar construtores nas classes filhas que chamem o construtor da classe mãe usando super().
//    Além disso, aprendemos que podemos ter vários construtores em uma mesma classe, desde que respeitemos a questão do super().
//    No final, vimos que os construtores são ferramentas importantes para encapsular objetos e garantir que eles sejam criados com os dados necessários.


    //Lista de objetos

    //AULA 1


//    Nessa aula, aprendemos a trabalhar com listas de objetos distintos, ou seja, listas que podem conter diferentes tipos de objetos.
//    Criamos uma classe Titulo que serve como um tipo genérico para filmes e séries, permitindo que a lista armazene ambos os tipos.
//    Utilizamos o for-each para iterar sobre a lista e imprimir os títulos.
//    Ao tentarmos acessar a classificação de um título, que é um atributo específico da classe Filme, encontramos um erro de conversão de tipos (ClassCastException).
//    Isso acontece porque a lista contém objetos de tipos diferentes e nem sempre é possível tratar um objeto de um tipo como se fosse de outro tipo.
//    No próximo vídeo, vamos aprender como resolver esse problema e garantir que o código funcione corretamente para todos os tipos de objetos na lista.


    //AULA 2

//    Essa aula foi bem interessante, né? Nela, aprendemos sobre como usar o instanceof para verificar se um objeto é de um tipo específico. É como se estivéssemos perguntando: "Você é um filme?".
//    Vimos também que podemos declarar uma variável dentro do if usando o instanceof, o que torna o código mais limpo e eficiente.
//    E por fim, falamos sobre variáveis de referência, que são como ponteiros que nos permitem acessar objetos. É importante lembrar que quando atribuímos um objeto a uma nova variável, não estamos criando uma cópia, mas sim uma nova referência para o mesmo objeto.


    //Ordenando Dados

    //AULA 1

//    Nessa aula, aprendemos como ordenar listas de objetos em Java. Vimos que o método Collections.sort() pode ser usado para ordenar listas de objetos que implementam a interface Comparable.
//    A interface Comparable define um método chamado compareTo(), que é usado para comparar dois objetos do mesmo tipo. O método compareTo() retorna um inteiro negativo se o primeiro objeto vem antes do segundo, um inteiro positivo se o primeiro objeto vem depois do segundo e zero se os objetos são iguais.
//    Para ordenar uma lista de objetos, precisamos implementar a interface Comparable na classe do objeto e implementar o método compareTo(). No método compareTo(), podemos comparar os atributos do objeto que queremos usar para ordenar a lista.
//    Por exemplo, se quisermos ordenar uma lista de títulos de filmes em ordem alfabética, podemos comparar o atributo nome dos títulos no método compareTo().

    //AULA 2

//    Nessa aula, aprendemos como ordenar listas de objetos em Java usando o método sort(). Vimos que podemos ordenar por diferentes critérios, como o nome do filme ou o ano de lançamento.
//    Para ordenar por um critério diferente do que foi definido no método compareTo(), usamos o Comparator.comparing(). Esse método nos permite escolher qual atributo da classe queremos usar para comparar os objetos.
//    Por exemplo, para ordenar por ano de lançamento, usamos Comparator.comparing(Titulo::getAnoDeLancamento).
//    Essa aula nos mostrou como a linguagem Java oferece recursos modernos e eficientes para ordenar listas de objetos, simplificando o processo e tornando o código mais legível.

    //AULA 3

//    Nessa aula, aprendemos sobre a importância de usar interfaces no Java, especialmente quando trabalhamos com listas e coleções. Vimos que, ao invés de usar diretamente a classe ArrayList, podemos usar a interface List, que define os métodos comuns a todas as listas. Isso torna nosso código mais genérico e flexível, pois podemos usar qualquer implementação de lista que implemente a interface List.
//    Além disso, conhecemos outras interfaces importantes como Collection, Set e Map, que representam diferentes tipos de coleções de dados. A Collection é a interface mãe de quase todas as coleções, enquanto a Set representa um conjunto de elementos únicos e a Map é como um dicionário, que associa chaves a valores.
//    Entender essas interfaces é fundamental para trabalhar com coleções no Java, pois elas nos permitem usar diferentes implementações de forma transparente e eficiente.



//    O Java oferece diferentes classes para representar uma lista de objetos. Essas classes são úteis em diferentes cenários, dependendo das necessidades de cada aplicação.
//
//    As classes mais comuns para representar uma lista no Java são:
//
//    ArrayList
//    A principal característica do ArrayList é que ele é baseado em um array dinâmico. Ele armazena os elementos em uma matriz interna e, conforme novos elementos são adicionados, o tamanho da matriz é automaticamente ajustado para acomodar o novo elemento. Da mesma forma, quando um elemento é removido, o tamanho do array é ajustado para evitar o desperdício de espaço. O ArrayList é amplamente utilizado devido à sua facilidade de uso e eficiência em termos de desempenho.
//
//            LinkedList
//    A classe LinkedList fornece uma lista encadeada de elementos. Diferentemente do ArrayList, que é baseado em um array, o LinkedList é baseado em uma lista encadeada, o que significa que cada elemento da lista é um objeto que contém uma referência para o próximo elemento. Isso permite que os elementos sejam adicionados e removidos de maneira eficiente em qualquer posição da lista, mas pode tornar a pesquisa de um elemento específico menos eficiente.
//    O LinkedList é uma boa escolha quando a inserção e remoção de elementos em qualquer posição da lista é frequente e quando não é necessário acessar os elementos de forma aleatória.
//
//            Vector
//    A classe Vector é semelhante ao ArrayList, mas é sincronizada, o que significa que é segura para uso em threads concorrentes. No entanto, a sincronização adiciona uma sobrecarga de desempenho, então o Vector pode ser mais lento que o ArrayList em algumas situações.
//
//    Stack
//    A classe Stack implementa uma pilha, que é uma coleção ordenada de elementos onde a inserção e remoção de elementos ocorrem sempre no mesmo extremo da lista. Os elementos são adicionados e removidos em uma ordem conhecida como "last-in, first-out" (LIFO), ou seja, o último elemento adicionado é o primeiro a ser removido. A classe Stack é usada com frequência em algoritmos de processamento de texto, bem como em outras situações em que a LIFO é a maneira natural de organizar os dados.
//    Cada uma dessas classes tem seus próprios pontos fortes e fracos, e a escolha de qual usar dependerá das necessidades específicas da aplicação. Para um melhor entendimento sobre estruturas de dados, recomendamos a leitura dos seguintes artigos:

    //Consolidando conhecimentos


    //AULA 1

//    Nessa aula, aprendemos a modelar as classes CartaoDeCredito e Compra em Java. Começamos definindo os atributos de cada classe, como limite, saldo e compras para o cartão de crédito, e descrição e valor para a compra.
//    Criamos construtores para as classes, garantindo que o cartão de crédito seja inicializado com um limite definido e que cada compra seja criada com uma descrição e valor específicos.
//    Também implementamos métodos getters para acessar os atributos das classes, mas não criamos setters para o limite e saldo do cartão de crédito, pois queremos garantir que esses valores sejam imutáveis após a criação do objeto.
//    Por fim, criamos um método lancaCompra na classe CartaoDeCredito para verificar se há saldo suficiente para realizar uma compra e, se sim, subtrair o valor da compra do saldo e adicionar a compra na lista de compras.


    //AULA2

//    Nessa aula, aprendemos a ordenar uma lista de compras por valor, usando a interface Comparable e o método compareTo.
//    Primeiro, criamos uma classe Compra que implementa a interface Comparable<Compra>. Depois, implementamos o método compareTo dentro da classe Compra, que compara o valor de duas compras usando a classe Double para comparar os valores double.
//    Com isso, conseguimos ordenar a lista de compras por valor, exibindo as compras mais caras primeiro.

}
