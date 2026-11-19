# Estudos-POO-4Bimestre-2026
# Cadastro de animais de um abrigo

Desenvolva um programa em Java, executado no console, para cadastrar animais de um abrigo.  
Utilize interface, classe abstrata, Generics, Collections, enumeração, lambda e tratamento de exceções.

## Especificações

- Crie a enumeração `Porte`, com as constantes `PEQUENO` e `GRANDE`.
- Crie a interface `Sonoro`, com o método `void emitirSom()`.

## Classe Abstrata Animal
Desenvolva a classe abstrata `Animal`, que implemente `Sonoro`, com os atributos privados `nome` e `porte`, construtor e getters.
- Implemente o método `exibirDados()` para apresentar esses atributos.
- Se o nome estiver vazio ou contiver apenas espaços, utilize `throw` para lançar `IllegalArgumentException`.

## Subclasses
- Crie as subclasses `Cachorro` e `Gato`.
- Cada uma deverá implementar `emitirSom()`, apresentando, respectivamente, “Au au!” e “Miau!”.

## Classe Genérica Cadastro
Implemente a classe genérica `Cadastro<T>`, contendo uma `List<T>` implementada com `ArrayList`.
- Crie os métodos `adicionar(T elemento)` e `getElementos()` para adicionar e consultar os animais cadastrados.

## Classe Main
Na classe `Main`:
- Utilize `Scanner` para solicitar ao usuário o cadastro de três animais, informando o tipo — cachorro ou gato —, o nome e o porte.
- Utilize `try/catch` para tratar dados inválidos e permitir uma nova tentativa, sem contabilizar o cadastro malsucedido.
- Ao final, apresente os dados de todos os animais e execute `emitirSom()` para cada um.
- Utilize um encadeamento com `stream()`, um `filter`, um `map` e `toList()` para obter e apresentar os nomes dos animais de porte pequeno.
      - Mostre também o total de cachorros e de gatos cadastrados.
