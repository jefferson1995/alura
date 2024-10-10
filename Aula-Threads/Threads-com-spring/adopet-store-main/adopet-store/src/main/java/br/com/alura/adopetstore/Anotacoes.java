package br.com.alura.adopetstore;

public class Anotacoes {

    //Sincronizando requisições

    //AULA 1


//    Nessa aula, aprendemos sobre a importância de tratar requisições paralelas em aplicações web, especialmente em cenários como um e-commerce, onde o estoque de produtos precisa ser gerenciado com cuidado.
//    Utilizamos o exemplo da compra de um brinquedo de pássaro na Adopet Store para ilustrar o problema. Se duas pessoas tentarem comprar o mesmo brinquedo ao mesmo tempo, e o estoque for insuficiente, podemos ter problemas com a contagem do estoque, resultando em pedidos sendo criados mesmo sem produtos disponíveis.
//    Para simular essa situação, usamos o Postman para enviar várias requisições simultâneas para a nossa API. Observamos que, sem tratamento adequado, o estoque poderia ficar negativo, o que não é desejável.
//    Para solucionar esse problema, aprendemos a utilizar o synchronized na classe PedidoService, garantindo que apenas uma thread possa acessar o método cadastrar por vez. Isso impede que o estoque seja atualizado simultaneamente por múltiplas threads, evitando erros e garantindo a integridade dos dados.
//    No entanto, descobrimos que o synchronized sozinho não é suficiente para lidar com todos os desafios de requisições paralelas em um ambiente Spring Boot. Na próxima aula, exploraremos outras ferramentas e técnicas para tratar esses casos de forma mais robusta.

    //AULA 2

//    como usar o recurso de versionamento da JPA para criar um lock em nosso sistema de estoque.
//    Vimos que o synchronized não funciona no Spring Boot, pois ele gerencia as threads de forma diferente. Para resolver o problema de acesso concorrente ao estoque, precisamos de um mecanismo de bloqueio.
//    A JPA nos fornece a anotação @Version, que permite criar uma coluna de versão na tabela de estoque. Essa coluna é incrementada a cada alteração no estoque, garantindo que apenas uma thread possa acessar e modificar o estoque por vez.
//    Criamos uma nova coluna versao na entidade Estoque e uma nova migration para adicionar essa coluna à tabela no banco de dados.
//    Ao atualizar o estoque no Postman, observamos que a versão do produto modificado foi incrementada, demonstrando o funcionamento do lock.
//    Na próxima aula, vamos testar se essa solução realmente resolve o problema de acesso concorrente ao estoque.

    //AULA 3

//    como o @Version da JPA cria um lock otimista no banco de dados, garantindo que apenas uma transação seja concluída por vez, mesmo com múltiplas requisições simultâneas.
//    Utilizando o Postman, criamos requisições paralelas para testar a funcionalidade do lock otimista. Observamos que, ao tentarmos criar pedidos simultaneamente, algumas requisições falhavam com a exceção ObjectOptimisticLockingFailureException, indicando que a linha do estoque já havia sido atualizada por outra transação.
//    Isso demonstra que o lock otimista está funcionando, evitando que múltiplas requisições modifiquem o estoque ao mesmo tempo.
//    Com o lock otimista, garantimos a integridade dos dados e evitamos problemas como estoque negativo ou pedidos duplicados.
//    Lembre-se que o lock otimista é apenas um tipo de lock, e existem outros tipos com diferentes permissões.


    //Enviando e-mail com concorrência

    //AULA1

//    como melhorar a experiência do usuário ao criar um pedido em nossa aplicação. O problema era que o envio de e-mail após a criação do pedido demorava 3 segundos, o que deixava a pessoa usuária esperando por muito tempo.
//    Para resolver isso, aprendemos a utilizar o Asynchronism (Assincronismo) no Spring, que permite criar Threads separadas para executar tarefas independentes.
//    Ativamos o Asynchronism na nossa classe principal AdopetStoreApplication usando a anotação @EnableAsync. Em seguida, usamos a anotação @Async no método enviar() da classe EmailPedidoRealizado para criar uma nova Thread para o envio de e-mail.
//    Com essa mudança, o tempo de resposta para a criação do pedido caiu de 3 segundos para 32 milissegundos, tornando a experiência do usuário muito mais rápida e agradável.


    //AULA 2

//    aprendemos como o @Async do Spring Boot cria novas threads para executar tarefas de forma assíncrona.
//    Utilizando o System.out.println para imprimir o nome da thread atual, pudemos observar que o @Async realmente cria uma nova thread para enviar o email, enquanto o controller continua a executar na thread principal.
//    Também vimos que o Spring Boot, por padrão, utiliza uma arquitetura bloqueante, onde cada requisição é atendida por uma nova thread. Isso pode levar a lentidão se muitas requisições forem feitas ao mesmo tempo.
//    O @Async nos permite criar uma arquitetura não bloqueante, onde tarefas independentes podem ser executadas em paralelo, liberando a thread principal para atender outras requisições. Isso aumenta a performance da aplicação e proporciona uma experiência mais rápida para os usuários.
//    Na próxima aula, veremos como configurar a criação de threads utilizando o @Async.


    //AULA 3

//    como configurar as threads criadas pelo Spring para enviar e-mails de forma mais eficiente.
//    Vimos que o Spring cria threads automaticamente com configurações padrão, mas podemos personalizar essas configurações para otimizar o desempenho da nossa aplicação.
//    Para isso, criamos um pacote e uma classe de configuração chamada AsyncConfiguration, onde definimos um executor usando a classe ThreadPoolTaskExecutor.
//    O executor é como um "pool" de threads que gerencia a criação e execução das threads de forma eficiente. Podemos configurar o número mínimo e máximo de threads a serem criadas, a capacidade da fila de espera e o prefixo do nome das threads.
//    Para utilizar esse executor configurado, adicionamos o parâmetro asyncExecutor à anotação @Async na classe que envia os e-mails.
//    Com essa configuração, podemos controlar o número de threads que são criadas para enviar e-mails, garantindo que a aplicação não seja sobrecarregada e que os e-mails sejam enviados de forma rápida e eficiente.


}
