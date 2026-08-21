# Introdução a Conceitos - Modulo 1

A **computação em nuvem** permite usar servidores, armazenamento, redes e softwares pela Internet, administrados por **CSPs (Provedores de Serviços de Nuvem)**.

## 1. Conceitos

- **Data center:** local físico com servidores e equipamentos.
- **Zona:** conjunto de data centers.
- **Região:** conjunto de zonas.
- **Resiliência:** capacidade de resistir e se recuperar de falhas.
- **Redundância:** cópia de dados em diferentes zonas/regiões.
- **Latência:** tempo necessário para transferir dados.

## 2. Modelos de Nuvem

| Modelo | Característica |
|---|---|
| **Pública** | Recursos compartilhados entre usuários. |
| **Privada** | Infraestrutura exclusiva de uma organização. |
| **Híbrida** | Combina pública e privada. |
| **Multicloud** | Utiliza diferentes CSPs. |

## 3. Benefícios

### Rapidez
- Infraestrutura e softwares podem ser implantados mais rapidamente.
- Testes de segurança podem ser automatizados.

### Escalonabilidade
- Recursos aumentam ou diminuem conforme a **demanda**.

### Economia
- **CapEx:** gastos com infraestrutura própria.
- **OpEx:** paga-se pelos recursos utilizados.

### Colaboração
- Acesso a ferramentas e dados de qualquer lugar pela Internet.

### Segurança
- CSPs oferecem controles de segurança e **criptografia** de dados em repouso e em trânsito.
- Garante **confidencialidade, integridade e disponibilidade**.

### Durabilidade
- Redundância protege dados contra falhas, desastres e ameaças.

## 4. Limitações

- **Menor controle:** a infraestrutura física pertence ao CSP.
- **Segurança:** existem preocupações com privacidade e acessos maliciosos.
- **Migração:** transferir sistemas pode ser complexo, demorado e exigir adaptação de códigos e treinamento.
- **Internet:** é necessária uma conexão estável.
___
# Virtualização

**Virtualização** é uma tecnologia que cria versões virtuais de recursos físicos, como **servidores, armazenamento e redes**. É a **base da computação em nuvem**.

## Máquinas Virtuais (VMs)

As **VMs** simulam computadores físicos e possuem seu próprio **sistema operacional** (Windows, Linux etc.), utilizando apenas parte dos recursos do computador físico.

### Hipervisor

O **hipervisor** é a camada entre o **hardware físico e as VMs**, responsável por:

- Gerenciar e distribuir recursos.
- Criar e executar VMs.
- Manter as VMs **isoladas**, impedindo que uma acesse informações de outra.

### Tipos de Hipervisor

#### Tipo 1 — Bare Metal

- Executado diretamente sobre o **hardware**.
- Não depende de um sistema operacional hospedeiro.
- Possui acesso direto aos recursos físicos.
- Geralmente é **mais simples e seguro**.

#### Tipo 2 — Hospedado

- Executado como um **aplicativo dentro de um sistema operacional**.
- Mais fácil de instalar.
- Possui **maior sobrecarga**, pois depende do sistema operacional hospedeiro.

## Vantagens das VMs

- **Portabilidade:** podem ser movidas entre diferentes ambientes, sendo úteis em **nuvens híbridas**.
- **Escalonabilidade:** CPU, memória e armazenamento podem ser aumentados ou reduzidos conforme a necessidade.
- **Testes:** permitem testar códigos e aplicações em ambientes isolados sem afetar a infraestrutura ou os usuários.
- **Isolamento:** problemas em uma VM não afetam diretamente as demais.

___
# Computação sem Servidor:

A **computação sem servidor (Serverless)** é um modelo de nuvem que **abstrai os servidores da visão do desenvolvedor**. Os servidores continuam existindo, mas são totalmente gerenciados pelo **CSP**.

Isso permite que desenvolvedores se concentrem no **código**, sem precisar configurar ou administrar a infraestrutura.

## Modelos de Serviço

### BaaS — Backend as a Service

O **CSP gerencia toda a infraestrutura de back-end**, incluindo servidores, contêineres e VMs.

Permite que desenvolvedores foquem no **front-end** e utilizem serviços prontos, como:

- Bancos de dados.
- Armazenamento de arquivos.
- Autenticação.

### FaaS — Function as a Service

Executa **pequenos trechos de código (funções)** quando ocorre determinado evento.

As funções são **efêmeras**, ou seja, existem apenas pelo tempo necessário para executar a tarefa.

**Exemplo:**

> Cliente se cadastra → evento aciona uma função → e-mail de boas-vindas é enviado → função é encerrada.

## Benefícios

- **Escalonabilidade:** recursos aumentam ou diminuem conforme a demanda.
- **Pagamento por uso:** paga-se apenas pelos recursos utilizados.
- **Produtividade:** desenvolvedores não precisam gerenciar servidores.
- **Flexibilidade:** funções podem ser criadas em diferentes linguagens.
- **Segurança:** equipes podem focar mais na proteção do código e dos recursos.

## Segurança

A segurança segue o modelo de **responsabilidade compartilhada** entre o CSP e a organização.

- O **CSP** protege a infraestrutura que executa os serviços.
- A **organização** deve proteger seus dados, funções e controlar os acessos.

### Segurança das funções

As funções possuem **vida curta**, reduzindo o tempo disponível para um atacante explorá-las.

Além disso, cada função normalmente possui uma tarefa específica. Se uma função for comprometida, o impacto tende a ficar limitado à parte do aplicativo relacionada a ela.

Funções também podem ser usadas para **monitorar eventos e gerar alertas de segurança** automaticamente.
