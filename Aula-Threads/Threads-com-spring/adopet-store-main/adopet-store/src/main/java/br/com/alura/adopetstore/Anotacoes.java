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


    //Agendando o envio de relatórios

    //AULA 1

//    Nessa aula, aprendemos a agendar tarefas no Spring utilizando a anotação @Scheduled.
//    Primeiro, habilitamos o agendamento na classe principal da aplicação com @EnableScheduling. Depois, criamos uma classe AgendamentoService com a anotação @Service para configurar o agendamento.
//    Utilizamos a anotação @Scheduled(cron) para definir o horário da tarefa, usando uma expressão cron com seis campos: segundo, minuto, hora, dia, mês e ano.
//    Criamos um método envioEmailsAgendado() para simular o envio de e-mails, imprimindo as informações dos relatórios de estoque e faturamento no console.
//    No próximo vídeo, vamos integrar o envio de e-mails ao agendamento.

//    O cron é como um "cronômetro" que define quando uma tarefa deve ser executada. Ele usa uma expressão com seis campos, separados por espaços, para indicar o tempo:
//    Segundo (0-59): Define o segundo exato da execução.
//    Minuto (0-59): Define o minuto exato da execução.
//    Hora (0-23): Define a hora exata da execução (24 horas).
//    Dia do mês (1-31): Define o dia do mês em que a tarefa será executada.
//    Mês (1-12): Define o mês em que a tarefa será executada.
//    Dia da semana (0-6): Define o dia da semana em que a tarefa será executada (0 = Domingo, 6 = Sábado).
//
//    Alguns exemplos:
//
//      "0 0 12 * * *": Executa a tarefa todos os dias às 12h em ponto.
//      "0 15 10 * * *": Executa a tarefa todos os dias às 10h15min.
//      "0 0 * * 1-5": Executa a tarefa de segunda a sexta-feira, à meia-noite.
//      "0 0 8 * * 2": Executa a tarefa às 8h da manhã, apenas nas terças-feiras.
//      "*/5 * * * *": Executa a tarefa a cada 5 segundos.
//    Você pode usar asteriscos (*) para indicar "qualquer valor" em um campo. Por exemplo, "*" no campo "dia do mês" significa que a tarefa será executada em todos os dias do mês.
//
//    Para entender melhor, imagine um relógio:
//
//    Os campos "segundo", "minuto" e "hora" representam as agulhas do relógio.
//    Os campos "dia do mês", "mês" e "dia da semana" representam as datas e dias da semana.
//    Você pode usar o cron para agendar tarefas com diferentes frequências, como:
//
//    Diariamente: Executa a tarefa todos os dias.
//    Semanalmente: Executa a tarefa em um dia específico da semana.
//            Mensalmente: Executa a tarefa em um dia específico do mês.
//            Anualmente: Executa a tarefa em um dia específico do ano.
//            Lembre-se: A expressão cron é poderosa, mas exige atenção para garantir que a tarefa seja executada no momento desejado.


    //AULA 2

//    aprendemos a configurar o envio de e-mails com relatórios gerados pela nossa aplicação, agendando essa tarefa para um horário específico.
//    Primeiro, criamos uma classe EmailRelatorioGerado para enviar o e-mail com os relatórios de estoque e faturamento.
//    Depois, na classe AgendamentoService, adicionamos a dependência da classe EmailRelatorioGerado e configuramos o agendamento do envio dos e-mails
//    usando a anotação @Scheduled.
//    Por fim, verificamos que o Spring cria uma nova thread para executar a tarefa agendada,
//    garantindo que o envio dos e-mails aconteça em paralelo com outras funcionalidades da aplicação.
//    Lembre-se que o método agendado deve ser do tipo void e sem parâmetros, pois não queremos recuperar o retorno ou passar informações para ele.

    //AULA 3

//    aprendemos a otimizar a performance do nosso sistema de envio de relatórios agendados,
//    utilizando threads para paralelizar a geração dos relatórios de estoque e faturamento.
//    Inicialmente, os relatórios eram gerados sequencialmente, o que resultava em um tempo de execução maior,
//    especialmente quando lidávamos com um grande volume de dados.
//    Para solucionar esse problema, utilizamos a anotação @Async para tornar os métodos de geração de relatórios assíncronos, permitindo que eles fossem executados em threads separadas.
//    No entanto, essa abordagem gerou um novo desafio: como recuperar os resultados dos relatórios gerados em threads diferentes?
//    Para resolver essa questão, introduzimos o CompletableFuture, um container que nos permite armazenar e recuperar os resultados de operações assíncronas.
//    Com o CompletableFuture, conseguimos obter os relatórios gerados em cada thread e combiná-los para enviar o e-mail agendado.
//    Ao final da aula, verificamos que a utilização de threads e CompletableFuture proporcionou uma melhora significativa na performance do nosso sistema,
//    reduzindo o tempo de execução e garantindo a entrega rápida dos relatórios.
//    Mas ainda há um desafio a ser enfrentado: a sincronização das threads. No próximo vídeo,
//    vamos explorar como podemos garantir que os relatórios sejam combinados corretamente, mesmo sendo gerados em threads diferentes.


    //AULA 4

//    aprendemos sobre a importância de sincronizar as tarefas que são executadas em threads separadas,
//    especialmente quando precisamos dos resultados de várias threads para prosseguir com uma tarefa principal.
//    Vimos que, ao usar CompletableFuture.allOf(), podemos garantir que todas as threads que passamos como parâmetro terminem antes de prosseguirmos com a execução da thread principal.
//    Isso é feito usando o método join(), que faz com que a thread principal espere até que as threads secundárias terminem.
//    Essa técnica é crucial para evitar problemas como tentar acessar resultados de threads que ainda não terminaram, garantindo a integridade dos dados e a segurança da aplicação.
//    Além disso, aprendemos que a criação de muitas threads pode sobrecarregar o sistema, e que na próxima aula veremos formas de lidar com esse problema.


    //Melhorando a performance da aplicação

    //AULA 3

//    Nessa aula, aprendemos como utilizar threads virtuais no Spring para melhorar a performance da aplicação.
//    Vimos que, ao utilizar threads virtuais, conseguimos permitir que mais pessoas acessem o site simultaneamente, sem sobrecarregar o sistema.
//    Para configurar o Spring para utilizar threads virtuais, precisamos adicionar a propriedade spring.threads.virtual.enabled=true no arquivo application.properties.
//    Com essa configuração, todas as threads criadas no sistema serão virtuais, proporcionando um ganho de performance significativo.




}
