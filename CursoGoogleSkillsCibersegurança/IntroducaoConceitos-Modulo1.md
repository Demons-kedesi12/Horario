# Introdução a Conceitos - Modulo 1

# Termos e Definições — Curso 1, Módulo 1

| Termo | Definição |
|---|---|
| **Locatário único** | Recursos e infraestrutura dedicados a um único usuário. |
| **Multilocatário** | Recursos e infraestrutura compartilhados entre usuários. |
| **Bucket** | Contêiner virtual que armazena objetos. |
| **Computação** | Processamento realizado por um computador físico em ambiente remoto. |
| **Computação em nuvem** | Uso de recursos de computação **sob demanda** como serviços pela Internet. |
| **Contêiner** | Pacote de software com os componentes necessários para executar uma aplicação. |
| **Data center** | Edifício físico que armazena servidores e componentes de computação. |
| **Dados estruturados** | Dados organizados em formato definido, como linhas e colunas. |
| **Dados não estruturados** | Dados sem organização facilmente identificável. |
| **Domínio de falha** | Recurso que pode falhar sem afetar a disponibilidade dos dados. |
| **Efemeridade** | Característica de algo que existe por pouco tempo. |
| **Hipervisor** | Camada entre o hardware físico e a máquina virtual que gerencia seus recursos. |
| **Imutabilidade** | Característica de algo que não pode ser alterado após sua criação. |
| **Instância** | Recurso de servidor que executa cargas de trabalho na nuvem. |
| **Latência** | Tempo necessário para mover dados de um local para outro. |
| **Multicloud** | Uso de serviços de mais de um CSP. |
| **No local (On-premise)** | Infraestrutura de TI localizada fisicamente no data center ou escritório da organização. |
| **Nuvem híbrida** | Combinação de recursos de nuvem pública e privada. |
| **Nuvem privada** | Nuvem dedicada a uma única organização, geralmente gerenciada em infraestrutura própria. |
| **Nuvem pública** | Recursos de computação, armazenamento e rede oferecidos pela Internet e compartilhados sob demanda. |
| **Redundância** | Existência de várias cópias dos dados em locais diferentes para evitar falhas. |
| **Região** | Grupo de zonas. |
| **Repositório** | Local centralizado para armazenar, baixar e compartilhar dados. |
| **Repositório de dados na nuvem** | Solução para armazenar, acessar e manter dados em infraestrutura de nuvem. |
| **Resiliência** | Capacidade de se preparar, responder e se recuperar de interrupções. |
| **Segurança cibernética na nuvem** | Proteção da **confidencialidade, integridade e disponibilidade** de dados, aplicativos e infraestrutura. |
| **Transformação digital** | Uso de novas tecnologias para modernizar aplicativos, serviços e relações com clientes. |
| **Virtualização** | Tecnologia que cria versões virtuais de servidores, armazenamento e redes. |
| **Zona** | Conjunto de data centers em uma determinada área. |

______
## 1. Modelos de Nuvem:

A **computação em nuvem** permite usar servidores, armazenamento, redes e softwares pela Internet, administrados por **CSPs (Provedores de Serviços de Nuvem)**.

| Modelo | Característica |
|---|---|
| **Pública** | Recursos compartilhados entre usuários. |
| **Privada** | Infraestrutura exclusiva de uma organização. |
| **Híbrida** | Combina pública e privada. |
| **Multicloud** | Utiliza diferentes CSPs. |

## Benefícios

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

## Limitações

- **Menor controle:** a infraestrutura física pertence ao CSP.
- **Segurança:** existem preocupações com privacidade e acessos maliciosos.
- **Migração:** transferir sistemas pode ser complexo, demorado e exigir adaptação de códigos e treinamento.
- **Internet:** é necessária uma conexão estável.
___
# 2. Virtualização

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
# 3. Computação sem Servidor:

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

OBS:
- A computação desempenhada por um computador físico em um ambiente remoto se chama Compute. 
- Empacotar software em contêineres permite a portabilidade, ou seja, permite que os usuários executem aplicativos de software rapidamente de um ambiente de computação para outro. Isso também diminui o uso de memória e de recursos, porque o sistema operacional em si não está no contêiner.


___
# 4. Contêineres

Um **contêiner** é um pacote de software que contém o **código e as dependências** necessárias para executar uma aplicação.

Diferente de uma **VM**, o contêiner **não possui um sistema operacional próprio**. Vários contêineres podem compartilhar o mesmo SO, reduzindo o uso de memória e recursos.

## Imagem, Registro e Orquestração

- **Imagem:** arquivo com o código e as dependências da aplicação.
- **Registro:** local para **armazenar, enviar e baixar imagens**.
- **Orquestração:** ferramentas para **gerenciar, monitorar e escalonar** contêineres.

## Vantagens

### Portabilidade
- Executa o mesmo software em diferentes ambientes.
- Pode ser usado em nuvens **públicas, privadas e híbridas**.

### Imutabilidade
- O contêiner não é alterado depois de criado.
- Para fazer mudanças, cria-se uma **nova imagem**.
- Facilita substituir versões desatualizadas ou inseguras.
- Mantém a consistência entre ambientes.

### Separação de Responsabilidades

- **Desenvolvedores:** código e imagem.
- **Operações:** implantação e gerenciamento.

Isso permite que cada equipe se concentre em sua função.

## Contêiner × VM

| Contêiner | Máquina Virtual (VM) |
|---|---|
| Compartilha o SO | Possui SO próprio |
| Mais leve | Mais pesada |
| Usa menos recursos | Usa mais recursos |
| Alta portabilidade | Portátil |
| Isola aplicações | Isola máquinas completas |

____
# 5. Armazenamento de Dados em Nuvem

O **armazenamento em nuvem** permite **armazenar, acessar e manter grandes quantidades de dados** em uma infraestrutura externa administrada pelo **CSP**.

Os dados podem ser acessados pela **Internet, de qualquer lugar e a qualquer momento**. O CSP é responsável pela infraestrutura, **replicação e disponibilidade**.

## Vantagens

### Escalonabilidade
- Aumenta ou reduz o armazenamento conforme a **necessidade**.
- Não exige compra ou manutenção de equipamentos físicos.
- Evita gastos com capacidade que não será utilizada.

### Redundância
- Dados são **replicados em diferentes zonas e regiões**.
- Se ocorrer uma falha, outra cópia mantém os dados disponíveis.

### Economia
- Reduz a necessidade de comprar e manter infraestrutura própria.
- O **CSP** gerencia a infraestrutura.
- Geralmente, paga-se apenas pelos **recursos utilizados**.

### Segurança
Oferece recursos como:
- **Autenticação:** verifica a identidade do usuário.
- **Controle de acesso:** define quem pode acessar os dados.
- **Criptografia:** protege os dados contra acesso indevido.

### Alta Disponibilidade
- O CSP busca manter altos níveis de **uptime**.
- Garante que os dados permaneçam disponíveis quando necessários.

____
# 6. Tipos de Dados e Armazenamento em Nuvem

## Tipos de Dados

### 1. Dados Estruturados

Possuem **formato predefinido**, geralmente em linhas e colunas.

- Facilitam pesquisa e organização.
- Exemplos: nomes, endereços, números e datas.
- Geralmente armazenados em **bancos de dados**.

### 2. Dados Não Estruturados

Não possuem organização padronizada.

- Mantêm seu **formato original**.
- Exemplos: imagens, vídeos e documentos.
- Não são adequados para tabelas tradicionais.

---

# 3. Tipos de Armazenamento

### 1. Armazenamento de Arquivos

Organiza dados em **pastas e arquivos**, acessados por um caminho lógico.

- Adequado para volumes menores e compartilhamento.
- Também usado em repositórios de dados.
- Possui limitações com grandes volumes e muitas operações simultâneas.

### 2. Armazenamento de Objetos

Indicado principalmente para **dados não estruturados**.

- Dados são armazenados como **objetos**.
- Objetos ficam dentro de **buckets**.
- **Bucket:** contêiner virtual com nome exclusivo.
- Pode ser público ou privado.
- Ideal para grandes quantidades de dados.

### 3. Armazenamento em Blocos

Divide os dados em **blocos menores**, cada um com um ID exclusivo.

- Os blocos podem ser armazenados em diferentes locais.
- São reunidos novamente quando os dados são solicitados.
- Oferece **flexibilidade e eficiência**.
- Pode ser utilizado por diferentes sistemas operacionais e VMs.

| Tipo | Organização | Melhor uso |
|---|---|---|
| **Arquivo** | Pastas e arquivos | Volumes menores e compartilhamento |
| **Objeto** | Objetos em buckets | Grandes volumes e dados não estruturados |
| **Bloco** | Dados divididos em blocos | Desempenho e flexibilidade |

_____
# 7. Opções de Armazenamento do Google

## Dados Quentes e Frios

- **Dados quentes (Hot):** acessados frequentemente e precisam estar rapidamente disponíveis.
  - Ex.: aplicativos, sites e streaming.
- **Dados frios (Cold):** acessados raramente, mas precisam ser mantidos.
  - Ex.: registros antigos e históricos.

## Google Cloud Storage

O **Cloud Storage** armazena **objetos e dados não estruturados**, como imagens, vídeos, áudios e arquivos.

- Os dados são armazenados em **buckets**.
- Possui diferentes classes de armazenamento.
- As classes variam em **frequência de acesso, disponibilidade e custo**.
- Quanto maior a disponibilidade, maior tende a ser o custo.

## Classes de Armazenamento

| Classe | Acesso | Uso principal |
|---|---|---|
| **Standard** | Frequente | Dados quentes |
| **Nearline** | ~1 vez/mês | Backups |
| **Coldline** | ~1 vez/90 dias | Dados pouco acessados |
| **Archive** | ~1 vez/ano | Arquivos e recuperação de desastres |

**Standard → frequente**  
**Nearline → mensal**  
**Coldline → trimestral**  
**Archive → anual/raríssimo**
