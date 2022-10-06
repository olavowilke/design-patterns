# Creational

## ⭐Factory method

> Um padrão que define uma interface para criar um objeto, mas permite às classes decidirem qual classe instanciar. O Factory Method permite a uma classe deferir a instanciação para subclasses. - GOF
> 

### Problems

- Como escrever código onde as classes instanciadas possam variar dentro de uma mesma interface?
- Como deixar meu código desacoplado das classes concretas?

### Solutions

- Extrair a lógica de criação dos objetos para um factory method
- Invocar o factory method para receberem uma instância qualquer que implemente uma determinada interface

### Intent

- Define an interface for creating an object, but let subclasses decide which class to instantiate. Factory Method lets a class defer instantiation to subclasses.
- Defining a "virtual" constructor.
- The `new` operator considered harmful.

- People often use Factory Method as the standard way to create objects; but it isn't necessary if: the class that's instantiated never changes, or instantiation takes place in an operation that subclasses can easily override (such as an initialization operation).
- Factory Method is similar to Abstract Factory but without the emphasis on families

## ⭐Abstract factory

### Problems

- Como escrever código onde as classes instanciadas possam variar dentro de uma mesma interface?
- Como garantir que um conjunto de objetos relacionados (ou dependentes) possam ser criados mantendo o contexto único?

### Solutions

- Extrair a lógica de criação dos objetos para um abstract factory
- Criar uma implementação do abstract factory para cada **contexto**, garantindo que todos os objetos criados estejam relacionados

### Intent

- Provide an interface for creating families of related or dependent objects without specifying their concrete classes.
- A hierarchy that encapsulates: many possible "platforms", and the construction of a suite of "products".
- The `new` operator is considered harmful.

- Often, designs start out using Factory Method (less complicated, more customizable, subclasses proliferate) and evolve toward Abstract Factory, Prototype, or Builder (more flexible, more complex) as the designer discovers where more flexibility is needed.
- Builder focuses on constructing a complex object step by step. Abstract Factory emphasizes a family of product objects (either simple or complex). Builder returns the product as a final step, but as far as the Abstract Factory is concerned, the product gets returned immediately.

## Singleton

> Garantir que uma classe só tenha uma única instância e prover um ponto de acesso global à ela. - GOF
> 

### Problems

- Como posso garantir que uma classe tenha apenas uma única instância?
- Como fazer com que esta instância única possa ser acessível globalmente?

### Solutions

- Esconder o construtor
- Definir um ponto de criação estático que retorne um instância única

Não é possível trabalhar com interfaces, uma vez que o getInstance() é um método estático.

O padrão Singleton tende à ferir o Single Responsibility Principle.

## ⭐ Builder

> Separar a construção de um objeto complexo de sua representação para que o mesmo processo de construção possa criar representações diferentes. -GOF
> 

### Problems

- Como uma classe pode criar diferentes implementações de um mesmo objeto **complexo**?

### Solutions

- Delegar a criação do objeto para um builder ao invés de instanciar o objeto concreto diretamente
- Dividir a criação do objeto em partes
- Encapsular a criação e montagem dessas partes em um builder separado

## Prototype

> Especificar os tipos de objetos a serem criados usando uma instância como protótipo e criar novos objetos ao copiar este protótipo -GOF
> 

### Problems

- Como posso criar um objeto novo aproveitando o estado previamente existente de outro objeto?

### Solutions

- Definir um prototype que retorne a cópia de si mesmo
- Shallow copy
- Deep copy
