# Estudos-POO-4Bimestre-2026
# Sistema de Clínica Veterinária

Desenvolva um programa em Java, utilizando os conceitos de Programação Orientada a Objetos, para representar um sistema simples de atendimento de uma clínica veterinária.

## Enum StatusConsulta
Crie um enum chamado `StatusConsulta` com as constantes:
- `AGENDADA`
- `REALIZADA`
- `CANCELADA`

Cada constante deverá possuir uma descrição (`String`), um construtor e o método `getDescricao()`.

## Exceções personalizadas
Crie duas exceções checked, ambas recebendo uma mensagem pelo construtor:
- `DadoInvalidoException`, lançada quando algum dado informado violar as regras do sistema;
- `VacinaDuplicadaException`, lançada quando se tentar aplicar uma vacina já registrada para o animal.

## Interface Vacinavel
Crie uma interface chamada `Vacinavel` com o método:
- `void aplicarVacina(String vacina) throws VacinaDuplicadaException`

## Classe FichaMedica
Crie uma classe auxiliar chamada `FichaMedica`, contendo:
- o atributo `numero` (`String`);
- um conjunto (`Set<String>`) para armazenar as vacinas aplicadas, sem repetições;
- o método `registrarVacina(String vacina)`, que lança `VacinaDuplicadaException` se a vacina já existir no conjunto;
- o método `listarVacinas()`.

## Classe abstrata Animal
Crie uma classe abstrata chamada `Animal`, com os atributos:
- `nome`
- `idade`
- `peso`

Os atributos deverão utilizar modificadores de acesso adequados, priorizando o uso de `private`. Implemente:
- um construtor para inicializar os atributos, que lance `DadoInvalidoException` se os dados forem inválidos;
- getters e setters (os setters também devem validar);
- o método concreto `apresentarDados()`;
- o método abstrato `double calcularValorConsulta()`;
- o `toString()` sobrescrito com `@Override`, retornando uma descrição completa do objeto, com valores monetários com duas casas decimais;
- dois métodos sobrecarregados chamados `exibirMensagem()` e `exibirMensagem(String mensagem)`. O primeiro apresenta uma mensagem padrão e o segundo apresenta a mensagem recebida.

O objeto `FichaMedica` deverá ser criado dentro da própria classe `Animal`, representando uma relação de composição. Ele não deverá ser criado diretamente na classe `Principal`.

## Classe Cachorro
Herda de `Animal` e implementa `Vacinavel`. Possui o atributo `porte` (`String`). O construtor deverá utilizar `super()`.
- Valor da consulta: R$ 80,00 para porte “pequeno” e R$ 120,00 para qualquer outro porte.
- Sobrescreva `apresentarDados()`, apresentando também o porte.
- Método específico `passear()`, que apresenta uma mensagem informando que o cachorro está passeando.
- `aplicarVacina(String)` deverá registrar a vacina na ficha médica do animal.

## Classe Gato
Herda de `Animal` e implementa `Vacinavel`. Possui o atributo `castrado` (`boolean`). O construtor deverá utilizar `super()`.
- Valor da consulta: R$ 70,00 se for castrado e R$ 90,00 caso contrário.
- Sobrescreva `apresentarDados()`, apresentando também se o gato é castrado.
- Método específico `miar()`, que apresenta uma mensagem informando que o gato está miando.
- `aplicarVacina(String)` deverá registrar a vacina na ficha médica do animal.

## Classe Tutor
Crie uma classe chamada `Tutor`, contendo os atributos:
- `nome`
- `cpf`

Implemente construtor, getters, setters e `toString()`. Crie também o método:
- `agendarConsulta(Animal animal)`

Esse método deverá receber um objeto `Animal` e apresentar uma mensagem informando qual tutor agendou a consulta, para qual animal, o valor da consulta e o status `AGENDADA`. Essa relação deverá representar uma associação simples.

## Classe genérica Cadastro
Crie uma classe genérica `Cadastro<T extends Animal>`, que utilize internamente:
- uma `List<T>` para guardar os animais na ordem de cadastro;
- um `Map<String, T>` associando o nome do animal ao objeto.

Implemente:
- `void cadastrar(T animal)`, que lance `IllegalArgumentException` se já existir um animal com o mesmo nome;
- `T buscarPorNome(String nome)`, que retorne o animal ou `null`;
- `double mediaIdades()`, calculada percorrendo a lista.

## Classe Clinica
Crie uma classe chamada `Clinica`, com os atributos `nome` e `cidade`. A clínica deverá possuir uma referência para um objeto da classe `Tutor`.

O tutor deverá ser criado separadamente e posteriormente relacionado à clínica. Essa relação deverá representar uma agregação, pois o objeto `Tutor` poderá existir independentemente da clínica.

## Pacotes
Organize as classes do projeto utilizando pacotes. Sugestão:
- `animais`
- `excecoes`
- `clinica`
- `principal`

Utilize corretamente `package` e `import` quando necessário.

## Classe Principal
Na classe `Principal`:
- crie um objeto `Cachorro` e um objeto `Gato`;
- crie um objeto `Tutor` e um objeto `Clinica`, e relacione o tutor à clínica;
- crie um `Cadastro<Animal>` e cadastre os dois animais;
- tente cadastrar um animal com nome repetido e trate a exceção;
- tente criar um animal com dado inválido e trate a exceção;
- aplique uma vacina em cada animal e tente aplicar a mesma vacina duas vezes no mesmo animal, tratando a exceção;
- demonstre o uso de polimorfismo percorrendo uma lista de referências do tipo `Animal`, executando `apresentarDados()` e `calcularValorConsulta()` para cada um;
- demonstre a referência por interface, usando uma variável do tipo `Vacinavel`;
- realize o agendamento da consulta utilizando associação simples;
- apresente os objetos utilizando `toString()`;
- execute os métodos sobrecarregados;
- execute os métodos específicos `passear()` e `miar()`;
- utilize um `StatusConsulta` para exibir o status da consulta;
- apresente a média das idades dos animais cadastrados;
- utilize o bloco `finally` para exibir “Atendimento encerrado.”.

## Regras
Considere as seguintes regras:
- o nome do animal não poderá ficar vazio;
- a idade deverá ser maior ou igual a zero;
- o peso deverá ser maior que zero;
- o nome e o CPF do tutor não poderão ficar vazios;
- os atributos privados não deverão ser alterados diretamente pela classe `Principal`;
- utilize `extends` para a herança e `implements` para a interface;
- utilize `super()` nos construtores das classes derivadas;
- utilize `@Override` nos métodos sobrescritos;
- utilize sobrecarga de métodos;
- utilize associação simples, agregação e composição;
- utilize os modificadores de acesso `private`, `protected` e `public` quando apropriado;
- não utilize `catch (Exception e)` genérico;
- organize corretamente as classes em pacotes.

O programa deverá demonstrar, de forma simples e organizada, os conceitos trabalhados em Programação Orientada a Objetos.       
