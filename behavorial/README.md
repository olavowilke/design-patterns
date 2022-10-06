# Behavorial

## ⭐ Chain of responsibility

> Evita acoplar o remetente de uma requisição ao seu destinatário ao dar a mais de um objeto a chance de servir a requisição. Compõe os objetos em cascata e passa a requisição pela corrente até que um objeto a sirva. -GOF
> 

### Problems

- Como posso evitar o acoplamento entre o remetente de uma solicitação e seu receptor?
- Como permitir que mais de um objeto possa atender uma requisição?

### Solution

- Definir uma cadeia de objetos onde cada um poderá responder aquela solicitação ou enviar para o próximo objeto tratá-la.
- Quem faz a solicitação não precisa saber o tamanho da cadeia, ou mesmo como (por quem) ela será resolvida.

## Memento

> Sem violar o encapsulamento, capturar e externalizar o estado interno de um objeto para que o objeto possa ter esse estado restaurado posteriormente. -GOF
> 

### Problems

Como um objeto pode capturar seu estado interno para poder ser restaurado posteriormente?

### Solution

Definir uma estrutura de memento onde cada estado poderá ser salvo e restaurado quando necessário?

## Command

> Encapsular uma requisição como um objeto, permitindo que clientes parametrizem diferentes requisições, filas ou requisições de logo e suportar operações reversíveis - GOF
> 

### Problems

Como posso representar uma requisição dentro de um objeto?

Preciso fazer uma requisição mas não sei como ela será resolvida ou até mesmo quem irá respondê-la?

### Solution

Encapsular a requisição em um objeto command separado

O comando não tem os detalhes de quem e como será resolvido

## ⭐ Iterator

> Prover uma maneira de acessar os elementos de um objeto agregado sequencialmente sem expor sua representação interna -GOF
> 

### Problems

- Como posso navegar através de uma coleção de objetos sem a necessidade de conhecer os detalhes desta estrutura?

### Solution

- Encapsular a lógica de navegação entre os elementos desta coleção em uma estrutura de iterator

## ⭐ Observer

> Definir uma dependência one-to-many entre objetos para que quando um objeto mudar de estado, todos os seus dependentes sejam notificados e atualizados automaticamente - GOF
> 

### Problems

- Como posso modelar um relacionamento 1-N sem deixar todos eles acoplados?
- Como um objeto pode notificar outros objetos quando necessário?

### Solution

- Criar uma estrutura de observer para que ele possa notificar todos os objetos que solicitaram ser avisados quando um determinado evento ocorra

## State

> Permitir a um objeto alterar o seu comportamento quando o seu estado interno mudar. O objeto irá aparentar mudar de classe. -GOF
> 

### Problems

- Como posso alterar o comportamento de um objeto quando o seu estado interno muda?
- Como permitir que novos comportamentos sejam adicionados e integrados com os demais?

### Solution

- Modelar os comportamentos possíveis através de states
- Definir como serão realizadas as mudanças de estados
- Cada state irá tomar controle da execução de acordo com o estado interno do objeto

## ⭐ Strategy

> Definir uma família de algoritmos, encapsular cada um e fazê-los intercambiáveis. Strategy permite que algoritmos mudem independentemente entre cliente que o utilizam. -GOF
> 

### Problems

- Como uma classe pode utilizar um algoritmo definido dinamicamente?
- Como posso selecionar e trocar uma lógica em tempo de execução?

### Solution

- Encapsular os algoritmos possíveis para o mesmo problema em uma estrutura de strategy
- O cliente irá delegar a execução para estas estratégias ao invés de possuir toda a lógica internamente.

## ⭐ Template method

> Definir o esqueleto de um algoritmo dentro de uma operação, deixando alguns passos a serem preenchidos pelas subclasses. Template Method permite que suas subclasses redefinam certos passos de um algoritmo sem mudar sua estrutura. -GOF
> 

### Problems

- Como posso unir partes de um código que não variam com partes variáveis?
- Como posso alterar certos pontos do código mantendo uma estrutura geral?

### Solution

- Definir uma abstração com todos os pontos que podem ser variados
- Criar uma template que contenha as partes fixas e possua pontos de chamada para as partes variáveis
