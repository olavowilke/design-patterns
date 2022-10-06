# Structural

Extensibilidade

Flexibilidade

> Os padrões estruturais se preocupam com a forma COMO classes e objetos são compostos para formar estruturas maiores - GOF
> 

# Adapter

> Converter a interface de uma classe em outra interface esperada pelo cliente. Adapter permite a comunicação entre classes que não poderiam trabalhar juntas devido à compatibilidade de suas interfaces.- GOF
> 

Integrar interfaces incompativeis.

### Object adapter

Adaptação através de composição.

### Class adapter

Adaptação através de herança

Arquitetura hexagonal 

# Bridge

Evitar combinações cartesianas entre classes e características

> Desacoplar uma abstração de sua implementação para que os dois possam variar independentemente.- GOF
> 

### Problem

Como fazer com que a abstração e a implementação possam variar independetemente.

Como esta implementação pode variar em tempo de execução?

### Solution

Definir um conjunto hierarquico para ambos os lados: abstração e implementação.
Em tempo de execução, será possível escolher a classe concreta para a abstração e para implementação.

## Composite

> Compor objetos em estruturas de arvore para representar hierarquias todo-parte. Composite permite que clientes tratem objetos individuais e composições de objetos de maneira uniforme -GOF
> 

### Problem

Como seria possível criar uma estrutura onde uma unidade e um conjunto delas possam ser tratadas de forma transparente e sem diferenças?

### Solution

Definir uma composição que possa comportar tanto um elemento quando um conjunto dos mesmos elementos

## Decorator

> Anexar responsabilidades adicionais a um objeto dinamicamente. Decorators oferecem uma alternativa flexivel ao uso de herança para estender uma funcionalidade. -GOF
> 

### Problem

Como posso adicionar funcionalidades dinamicamente em um objeto?

### Solution

Com objetos decorators é possível adicionar novas responsabilidades para um objeto.

## ⭐ Facade

Baixo acomplamento, alto encapsulamento.

> Oferecer uma interface única para um conjunto de interfaces de um subsistema. Facade define uma interface de nível mais elevado que torna o subsistema mais fácil de usar. -GOF
> 

### Problem

Como posso simplificar o acesso a um sistema complexo utilizando uma interface simples?

Como reduzir a complexidade interna de um sistema para o client?

### Solution

Implementar uma interface que serve como fachada para o consumo de outras interfaces.

## Flyweight

> Usar compartilhamento para suportar grandes quantidades de objetos refinados eficientemente. -GOF
> 

### Problem

Como posso trabalhar uma grande quantidade de objetos na memória de uma forma mais eficiente?

### Solução

Dividir o objeto entre valores intrinsecos e extrinsecos

- Valores intrincicos: valores que não mudam dentro do objeto, no contexto em que foi instanciado
- Valores extrincicos: valores que mudam no contexto

Criar um Flyweight que armazene os valores intrinsecos.

Os clientes irão compartilhar esses flyweights, adicionando os valores extrinsecos pontualmente

Evitar otimizações prematuras, analisando os hotspots da aplicação a partir de analises de desempenho.

## Mediator

> Definir um objeto que encapsula como um conjunto de objetos interagem. Mediator promove acoplamento fraco ao manter objetos que não se referem um ao outro explicitamente, permitindo variar sua interação independentemente. -GOF
> 

### Problems

- Como reduzir o acoplamento entre objetos que precisam se comunicar.
- Como deixar a interação entre objetos mais dinâmica.

### Solution

- Utilizar uma estrutura de mediator para encapsular a forma que os objetos se comunicarão.
- Os objetos não precisam se conhecer, pois toda a interação será realizada através do mediator.

## Proxy

> Prover um substituo ou ponto através do qual um objeto possa controlar o acesso a outro- GOF
> 

### Problems

- Como posso controlar o acesso a algum objeto?
- Como posso adicionar funcionalidades durante o acesso a algum objeto?

### Solution

- Utilizar uma estrutura de proxy para atuar como se fosse outro objeto
- Utilizar o proxy como forma de acessar um objeto real, será possível controlar seu acesso

### Remote Proxy

RMI - remote method invocation

### Virtual proxy

### Protection proxy

### Smart proxy
