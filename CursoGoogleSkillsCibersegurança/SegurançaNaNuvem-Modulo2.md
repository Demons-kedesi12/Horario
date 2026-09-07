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


