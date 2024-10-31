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


}
