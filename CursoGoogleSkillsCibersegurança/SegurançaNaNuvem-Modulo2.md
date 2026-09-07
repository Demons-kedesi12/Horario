# Segurança na Nuvem - Modulo 2
# 1. Cybersecurity:
**Cybersecurity** é o conjunto de técnicas para proteger **sistemas e dados contra ameaças**

## Tríade CIA

- **C — Confidentiality (Confidencialidade):** somente pessoas autorizadas acessam os dados.
- **I — Integrity (Integridade):** somente pessoas autorizadas modificam os dados.
- **A — Availability (Disponibilidade):** usuários autorizados acessam os sistemas quando necessário.

## Autenticação

Verifica a identidade do usuário por meio de:

- **What you know:** senha ou PIN.
- **What you have:** celular, token ou cartão.
- **What you are:** biometria.

## Principais Ataques

- **Brute Force:** tenta várias combinações para descobrir uma senha.
- **DoS:** sobrecarrega um serviço para impedir o acesso.
- **DDoS:** ataque de negação de serviço distribuído.
- **Malware:** software malicioso.

## Segurança

- Nenhum sistema é **100% seguro**.
- É necessário reduzir vulnerabilidades e possíveis danos.
- **2FA:** adiciona uma segunda etapa de autenticação.
- **Controle de acesso:** limita as ações de cada usuário.
- **Verificação independente:** ajuda a identificar vulnerabilidades.
- Sistemas e códigos mais simples podem facilitar a análise e proteção.

______

# 2. Defesa em Profundidade e Controles de Segurança

## Defesa em Profundidade

**Defesa em profundidade** é uma estratégia que utiliza **várias camadas de proteção** para reduzir riscos e vulnerabilidades.

A ideia é não depender de um único controle. Se uma camada falhar, outras continuam protegendo os recursos.

> **Defesa em profundidade = várias camadas de segurança trabalhando juntas.**

## Controles de Segurança

**Controles de segurança** são medidas utilizadas para **reduzir riscos específicos** e fortalecer a segurança da organização.

Podem proteger:
- Sistemas e aplicações
- Redes
- Dados
- Máquinas e dispositivos
- Usuários e identidades
- Recursos na nuvem

O **NIST Cybersecurity Framework (CSF)** organiza a segurança em cinco funções:

**Identificar → Proteger → Detectar → Responder → Recuperar**

## A) Identificar

Busca entender **quais recursos existem, quais são críticos e quais riscos estão associados a eles**.

Principais ações:
- Catalogar sistemas, dispositivos e dados.
- Identificar informações sensíveis.
- Avaliar e classificar riscos.
- Encontrar falhas e lacunas de segurança.
- Definir quais recursos precisam de maior proteção.

Relaciona-se à **tríade CIA**:
- **Confidencialidade:** impedir acesso não autorizado.
- **Integridade:** impedir alterações não autorizadas.
- **Disponibilidade:** garantir acesso quando necessário.

**Exemplo:** identificar que um banco de dados possui informações importantes e precisa de controle de acesso e backup.

## B) Proteger

Utiliza controles para **evitar ou reduzir ataques e danos**.

Principais controles:
- **Identidade:** autenticação, MFA e controle de acesso.
- **Rede:** firewalls, segmentação e controle de tráfego.
- **Recursos:** antivírus e proteção de VMs e aplicações.
- **Conscientização:** treinamento, prevenção contra phishing e educação em segurança.

> **Objetivo:** impedir que ameaças acessem ou comprometam os recursos.

## C) Detectar

Identifica **atividades suspeitas, ataques e vulnerabilidades**.

Exemplos:
- **IDS:** detecta possíveis invasões.
- Monitoramento de redes.
- Detecção de phishing e malware.
- Identificação de bibliotecas inseguras.
- Monitoramento de atividades suspeitas.

A ameaça detectada deve ser analisada para entender o ataque e seus métodos.

> **Objetivo:** descobrir rapidamente que algo está errado.

## D) Responder

Define **como agir quando uma ameaça ou incidente é detectado**.

Envolve:
- Planejamento de resposta a incidentes.
- Alertas e notificações.
- Automação de respostas.
- Contenção do ataque.
- Mitigação dos danos.
- Processos previamente definidos.

**Exemplo:**

Atividade suspeita → alerta → bloqueio automático → análise da equipe de segurança.

> **Objetivo:** controlar o incidente e reduzir seus impactos.

## E) Recuperar

Busca **restaurar sistemas, acessos e operações após uma falha ou ataque**.

Principais controles:
- Backups.
- Alta disponibilidade.
- Replicação.
- Redundância.
- Recuperação de desastres.
- Replicação em diferentes zonas e regiões.

**Exemplo:** se um servidor falhar, uma cópia replicada em outra zona pode assumir a operação, reduzindo a indisponibilidade.

> **Objetivo:** voltar ao funcionamento normal o mais rápido possível.

## Resumo:

A Defesa em Profundidade utiliza as cinco funções como camadas:

**Identificar → Proteger → Detectar → Responder → Recuperar**

| Função | Pergunta principal | Exemplos |
|---|---|---|
| **Identificar** | O que temos e quais são os riscos? | Catalogação, avaliação de riscos |
| **Proteger** | Como evitar o problema? | Firewall, MFA |
| **Detectar** | O problema está acontecendo? | IDS, monitoramento |
| **Responder** | O que fazer quando acontecer? | Bloqueio, contenção |
| **Recuperar** | Como voltar ao normal? | Backup, replicação |

### Aplicação na nuvem:

**1. Identificar:** descobrir que armazena dados importantes.

↓

**2. Proteger:** utilizar MFA, controle de acesso e firewall.

↓

**3. Detectar:** monitorar atividades suspeitas com IDS.

↓

**4. Responder:** bloquear atividade maliciosa e alertar a equipe.

↓

**5. Recuperar:** restaurar dados usando backups ou recursos replicados.
_______

# 3. Modelo de Responsabilidade Compartilhada

## Modelo de Responsabilidade Compartilhada

A **responsabilidade compartilhada** define quem é responsável pela segurança entre o **cliente** e o **CSP (Cloud Service Provider)**.

> **CSP → protege a infraestrutura da nuvem.**  
> **Cliente → protege e configura o que coloca na nuvem.**

### Cliente
Responsável por:
- Configurar serviços e controles de segurança.
- Controlar acessos e permissões.
- Proteger dados e aplicações.
- Monitorar atividades.
- Responder a incidentes.
- Cumprir requisitos de segurança e conformidade.

### CSP
Responsável por:
- Manter a infraestrutura física.
- Proteger servidores e data centers.
- Manter a rede.
- Garantir a disponibilidade dos serviços.
- Realizar manutenção e atualizações da infraestrutura.

## On-Premises × Nuvem

### On-Premises
A empresa possui e gerencia:
- Data center.
- Servidores.
- Rede.
- Infraestrutura.

→ **A empresa assume praticamente toda a responsabilidade pela segurança.**

### Nuvem
Parte da infraestrutura é transferida para o CSP.

→ **A responsabilidade é dividida entre cliente e CSP.**

> **On-premises → empresa gerencia e protege a infraestrutura.**  
> **Nuvem → responsabilidade compartilhada.**

## 3. Segurança da Nuvem × Segurança na Nuvem

### Segurança da nuvem
Principalmente responsabilidade do **CSP**:
- Data centers.
- Servidores.
- Hardware.
- Rede física.
- Infraestrutura e disponibilidade.

### Segurança na nuvem
Principalmente responsabilidade do **cliente**:
- Dados.
- Aplicações.
- Configurações.
- Usuários.
- Permissões.
- Controles de segurança.

> **Segurança da nuvem = proteger a infraestrutura.**  
> **Segurança na nuvem = proteger o que o cliente coloca nela.**

## 5. SLA

**SLA (Service Level Agreement)** é o acordo que define e quantifica o nível de serviço que o CSP deve oferecer.

Um dos principais aspectos é a **disponibilidade**.

**Exemplo:**

**SLA = 99,99% de disponibilidade**

→ O serviço deve estar disponível durante **99,99% do período acordado**.

O SLA estabelece expectativas e responsabilidades entre cliente e CSP.

## Responsabilidade conforme o serviço

A responsabilidade varia conforme o modelo:

- **IaaS:** Infrastructure as a Service. Mais responsabilidade do cliente.
- **PaaS:** Platform as a Service. Responsabilidade compartilhada.
- **SaaS:** Software as a Service. Mais responsabilidade do CSP.

> **Quanto mais o CSP gerencia, maior é sua responsabilidade pela segurança.**

Consequentemente, quanto mais o cliente gerencia, maior é sua responsabilidade.

## Controles Herdados

**Controles herdados** são controles de segurança já fornecidos pela infraestrutura ou pelo CSP.

O cliente deve identificar:
- Quais controles são sua responsabilidade.
- Quais são fornecidos pelo CSP.
- Quais controles são herdados.

Eles podem ser considerados na avaliação da segurança e ajudar em auditorias.

## Segurança e Conformidade

A responsabilidade também depende de:
- Setor da organização.
- Regulamentações.
- Requisitos governamentais.
- Localização.
- Tipo de dados armazenados.

Diferentes países possuem leis e requisitos diferentes para armazenamento e tratamento de dados.

→ O cliente deve conhecer os requisitos que precisa cumprir e quais controles são responsabilidade sua ou do CSP.

## Relação com Defesa em Profundidade

A **responsabilidade compartilhada** complementa a **Defesa em Profundidade**.

- **Defesa em Profundidade:** utiliza várias camadas de proteção.
- **Responsabilidade Compartilhada:** define quem implementa e gerencia essas camadas.

**CSP:**
→ Protege data centers e servidores  
→ Mantém a infraestrutura  
→ Garante a disponibilidade

**Cliente:**
→ Configura acessos  
→ Protege dados  
→ Configura firewall  
→ Monitora atividades  
→ Responde a incidentes

> **CSP + Cliente = proteção completa e compartilhada.**

____

# 4. Desafios do Modelo de Responsabilidade Compartilhada

## A) Configuração Incorreta

A **configuração incorreta (misconfiguration)** é um dos principais desafios e pode causar **exposição de dados** e violações de segurança.

Pode ocorrer por:
- Configurações inadequadas.
- Atualizações frequentes.
- Novas integrações.
- Falhas no desenvolvimento.
- Falta de monitoramento.
- Permissões configuradas incorretamente.

### Como reduzir o risco?
- Monitorar o provisionamento de recursos.
- Utilizar automação.
- Aplicar políticas de segurança.
- Revisar configurações regularmente.
- Implementar corretamente o **IAM**.

## B) IAM e Privilégio Mínimo

O **IAM (Identity and Access Management)** controla **quem pode acessar quais recursos e quais ações pode realizar**.

### Princípio do Privilégio Mínimo

Cada usuário ou serviço deve possuir **somente as permissões necessárias** para sua função.

> **Privilégio mínimo → menor acesso necessário → menor impacto em caso de comprometimento.**

**Exemplo:**
- Privilégio excessivo → uma chave abre todas as portas.
- Privilégio mínimo → uma chave abre somente a porta necessária.

## C) Complexidade e Vários Serviços

O uso de diversos serviços e provedores aumenta a complexidade da segurança.

Principais riscos:
- Muitas configurações para gerenciar.
- Dependência entre serviços.
- Diferentes responsabilidades.
- Falhas que podem afetar outros serviços.
- Necessidade de monitorar responsabilidades do cliente e do CSP.

> **Mais serviços e integrações → maior complexidade de segurança.**


## D) Mudanças nas Regulamentações

As leis e regulamentações podem mudar conforme a empresa:
- Cresce.
- Expande seus produtos.
- Entra em novos mercados.
- Adquire outras empresas.
- Passa a operar em outros países.

Isso pode exigir:
- Novos controles de segurança.
- Alterações nas configurações.
- Mudanças em acordos ou SLA.
- Adequação ao armazenamento e tratamento de dados.

## E) Empresas em Diferentes Países

Operar em diferentes países pode exigir o cumprimento de **leis e regulamentações distintas**.

**Exemplo:**

Uma empresa brasileira adquire uma empresa de tecnologia de outro país.

→ Os dados adquiridos podem estar sujeitos às regulamentações dos dois países.

> **Países diferentes → leis e requisitos diferentes para os dados.**

## F) Segurança como Processo Contínuo

A segurança na nuvem **não é configurada uma única vez**.

É necessário acompanhar continuamente:
- Novas ameaças.
- Vulnerabilidades.
- Atualizações.
- Novos serviços.
- Mudanças na infraestrutura.
- Regulamentações.
- Alterações no negócio.

> **Segurança é um processo contínuo porque a tecnologia e as ameaças estão sempre evoluindo.**

## Principais Desafios

| Desafio | Problema | Como reduzir |
|---|---|---|
| **Configuração incorreta** | Pode expor recursos e dados | Monitoramento e automação |
| **Permissões excessivas** | Acesso além do necessário | IAM + privilégio mínimo |
| **Muitos serviços** | Aumenta a complexidade | Monitoramento e gestão |
| **Mudanças regulatórias** | Controles podem ficar inadequados | Acompanhar regulamentações |
| **Expansão internacional** | Diferentes leis para os dados | Adequação às leis locais |
| **Novas ameaças** | Novas vulnerabilidades | Monitoramento contínuo |

### Perguntas Importantes ao Migrar para a Nuvem
1. Quais controles de segurança são de sua responsabilidade?
Identificar quais recursos precisam de proteção e quais controles ficam sob **responsabilidade da organização**.

2. Quais controles de segurança estão disponíveis na oferta da nuvem?
Verificar quais **controles o CSP oferece** e quais atendem às necessidades de segurança da organização.

3. Quais controles de segurança padrão são herdados?
Identificar os controles que o **CSP já fornece**, como proteção da infraestrutura e determinados mecanismos de segurança.

4. Quais são as obrigações de compliance da organização?
Verificar quais **leis, regulamentações e requisitos governamentais ou do setor** precisam ser cumpridos, considerando também onde os recursos serão executados.

5. Quais são as exigências de segurança para clientes e prestadores?
Avaliar como a migração afeta **usuários e prestadores de serviços**, principalmente em relação a **permissões de acesso e privacidade**.
_____

# 5. Modelo de Destino Compartilhado

## O que é o Destino Compartilhado?

O **Destino Compartilhado** é uma evolução da **Responsabilidade Compartilhada**, na qual **CSP e cliente trabalham de forma mais próxima** para proteger o ambiente em nuvem.

O CSP oferece mais **orientação, ferramentas e recursos de segurança** durante toda a jornada do cliente.

> **Objetivo:** aumentar a confiança e ajudar o cliente a projetar, implantar e operar um ambiente mais seguro.

## Problemas que busca melhorar

- Mudanças nas regulamentações.
- Sobreposição de controles de segurança.
- Necessidade de tratar segurança como **processo contínuo**.
- Dificuldade dos clientes em proteger corretamente seus recursos.

## Como aumenta a confiança?

### Fundamentos de Segurança

Fornece práticas recomendadas para configurar e implantar serviços com segurança, incluindo **Infraestrutura como Código (IaC)**.

### Zonas de Destino (Landing Zones)

Configurações **modulares e escaláveis** que servem como ponto de partida para adotar a nuvem com segurança.

Podem incluir:
- Identidade.
- Hierarquia de recursos.
- Controles de segurança.
- Controles de rede.

### Mitigação de Riscos

Ferramentas ajudam a **identificar e avaliar riscos técnicos**, permitindo acompanhar e gerar relatórios sobre a **postura de risco** da organização.

## Responsabilidade Compartilhada × Destino Compartilhado

| Modelo | Principal objetivo |
|---|---|
| **Responsabilidade Compartilhada** | Define **quem é responsável** por cada aspecto da segurança. |
| **Destino Compartilhado** | Promove uma **parceria mais próxima**, com o CSP oferecendo orientação e recursos durante toda a jornada. |

> **Responsabilidade Compartilhada = dividir responsabilidades.**  
> **Destino Compartilhado = dividir responsabilidades + trabalhar em parceria.**

_____
# 6. Modelos de Serviço em Nuvem

Os modelos de serviço definem **quanto o CSP gerencia e quanto fica sob responsabilidade do cliente**.

> **Quanto mais o CSP gerencia, maior é a responsabilidade dele pela segurança.**

## A) IaaS — Infraestrutura como Serviço

O **CSP fornece e gerencia**:
- Computação.
- Armazenamento.
- Rede.
- Virtualização.
- Infraestrutura física.

O **cliente gerencia**:
- Máquinas virtuais.
- Sistema operacional.
- Aplicações.
- Dados.
- Configurações e segurança.

→ **Maior responsabilidade do cliente** entre IaaS, PaaS e SaaS.

**Vantagem:** elimina a necessidade de manter um data center próprio, mantendo bastante controle sobre o ambiente.

## B) PaaS — Plataforma como Serviço

O **CSP fornece e gerencia**:
- Hardware.
- Sistema e plataforma de desenvolvimento.
- Recursos necessários para desenvolver aplicações.

O **cliente gerencia**:
- Código.
- Aplicações.
- Dados.
- Segurança.

→ O CSP gerencia mais recursos que no IaaS, reduzindo a responsabilidade operacional do cliente.

**Vantagem:** desenvolvedores podem se concentrar no **código** em vez da infraestrutura.

## C) SaaS — Software como Serviço

O **CSP gerencia a maior parte do ambiente**:
- Hardware.
- Software.
- Infraestrutura.
- Aplicação.

O **cliente se concentra principalmente em**:
- Dados.
- Usuários.
- Permissões.
- Políticas de acesso.

**Exemplo:** Gmail.

→ **Maior responsabilidade do CSP** entre IaaS, PaaS e SaaS.

## Comparação

| Modelo | Responsabilidade do CSP | Responsabilidade do cliente |
|---|---|---|
| **IaaS** | Menor | Maior |
| **PaaS** | Média | Média |
| **SaaS** | Maior | Menor |

### Regra para memorizar

**IaaS → mais controle do cliente**

**PaaS → equilíbrio**

**SaaS → mais gerenciamento do CSP**

> **Em todos os modelos, o cliente continua responsável pela proteção dos próprios dados.**

## Outros Modelos

### FaaS — Função como Serviço

Executa **trechos específicos de código** sem que o cliente precise gerenciar servidores ou infraestrutura de backend.

→ Modelo de **computação sem servidor (serverless)**.

### IDaaS — Identidade como Serviço

Oferece serviços de:
- MFA.
- SSO.
- IAM.

→ Ajuda a evitar **acessos não autorizados**.

### Firewall como Serviço

Fornece firewalls pela nuvem para:
- Bloquear acessos não autorizados.
- Proteger redes.
- Acompanhar o crescimento de usuários e dispositivos.

____

# IaaS — Resumo:

- **IaaS:** fornece servidores, armazenamento, rede e virtualização sob demanda.
- **Escalabilidade:** aumenta ou reduz recursos conforme a necessidade.
- **Economia:** paga-se pelos recursos utilizados, sem manter servidores físicos.
- **Produtividade:** o CSP gerencia a infraestrutura, permitindo que a equipe foque em serviços e segurança.
- **Segurança:** CSP protege a infraestrutura; cliente protege **dados, acessos, autenticação e operações**.
- **Lift-and-shift:** migra cargas do ambiente local para a nuvem com **pouca ou nenhuma alteração**.
- 
> **IaaS = mais controle + escalabilidade + economia, mas também maior responsabilidade do cliente pela segurança.**


# PaaS (Plataforma Como Serviço) — Resumo:

- **PaaS:** modelo em que o CSP fornece e mantém o **hardware e software de back-end**, enquanto os desenvolvedores criam e implantam aplicativos.
- **Componentes:** infraestrutura, middleware e interface do usuário (GUI ou CLI).
- **Escalabilidade:** recursos podem ser aumentados ou reduzidos **sob demanda**, pagando apenas pelo que for utilizado.
- **CSP:** responsável pela infraestrutura, sistemas operacionais, segurança de rede, acesso e autenticação.
- **Cliente:** responsável pelos **dados, políticas de acesso, aplicações, implantações e segurança dos aplicativos web**.
- **Uso principal:** desenvolvimento e implantação de aplicativos, inclusive para sites e dispositivos móveis.
- **Nuvem híbrida:** pode facilitar a migração, permitindo usar recursos da nuvem enquanto parte da infraestrutura permanece local.
- **Vantagem:** desenvolvedores podem focar no **código e aplicativo**, utilizando recursos e controles de segurança fornecidos pelo CSP.

> **PaaS = CSP cuida da plataforma → desenvolvedor cuida do aplicativo e código.**


# SaaS (Software como Serviço) — Resumo:

- **SaaS:** software hospedado na nuvem e acessado pela Internet, por navegador ou aplicativo.
- **Indicado para:** organizações que não possuem equipe ou experiência para gerenciar infraestrutura ou desenvolver seus próprios aplicativos.
- **Responsabilidade do cliente:** principalmente **proteger os dados e definir políticas de acesso**.
- **Exemplo:** Gmail → o Google gerencia o aplicativo e a infraestrutura; o usuário gerencia seus e-mails e acesso por login.
- **Assinatura:** geralmente funciona por planos, podendo aumentar ou diminuir a capacidade conforme a necessidade.
- **Menor overhead:** o CSP gerencia infraestrutura, sistemas operacionais e armazenamento, reduzindo custos e trabalho para o cliente.
- **Pagamento:** paga-se pelo uso do software, sem precisar manter servidores e equipamentos próprios.
- **Acesso imediato:** geralmente não exige instalação; basta acessar pelo navegador ou aplicativo.
- **Disponibilidade global:** pode ser utilizado de diferentes locais, desde que haja acesso à Internet.
- **Shadow IT:** ocorre quando funcionários utilizam SaaS **sem aprovação da equipe de TI**, podendo gerar vulnerabilidades e problemas de segurança.

> **SaaS = CSP gerencia quase tudo → cliente gerencia principalmente dados e acessos.**
