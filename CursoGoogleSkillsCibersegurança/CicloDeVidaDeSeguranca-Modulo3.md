# Ciclo De Vida De Segurança - Modulo 2

# 1. DevSecOps

**DevSecOps** é uma cultura que integra **desenvolvimento, operações e segurança** durante todo o ciclo de vida do software. Ele surgiu do **DevOps**, que aproximou desenvolvimento e operações para melhorar colaboração, comunicação e velocidade dos lançamentos.

No modelo tradicional, a segurança era incluída principalmente **no final do desenvolvimento**, podendo causar atrasos. O DevSecOps aplica a segurança desde o início, utilizando o conceito de **Shift Left (deslocamento à esquerda)**, que permite identificar e corrigir vulnerabilidades mais cedo por meio de testes e verificações automatizadas.

### DevOps × DevSecOps

- **DevOps:** desenvolvimento + operações.
- **DevSecOps:** desenvolvimento + operações + segurança desde o início.

### Ciclo de vida do DevSecOps

O ciclo é representado por um **loop infinito**, indicando melhoria e integração contínuas. Ele possui **7 fases**:

1. **Planejar:** identificar ameaças, definir testes e ferramentas de segurança e estabelecer papéis e permissões de IAM.
2. **Programar:** desenvolver código seguro, realizar revisões e utilizar automação para encontrar vulnerabilidades.
3. **Criar:** gerar artefatos e serviços, incluindo verificações automatizadas de segurança.
4. **Testar:** verificar qualidade, funcionamento, desempenho, segurança e conformidade por meio de testes manuais e automatizados.
5. **Lançar:** realizar verificações finais e aprovar o software para produção.
6. **Implantar:** disponibilizar o aplicativo aos usuários utilizando automação.
7. **Operar:** monitorar continuamente o software para identificar alertas, problemas e vulnerabilidades e realizar correções.

### Feedback contínuo

O **feedback contínuo** permite que desenvolvimento, segurança e operações acompanhem o desempenho do software, identifiquem problemas e realizem **melhorias constantes**.

_____

# 2. Pipelines de Software, CI/CD e DevSecOps

### Desenvolvimento tradicional x Pipeline

A abordagem **cascata** utiliza etapas sequenciais. Erros identificados posteriormente podem exigir **retrabalho**, causando atrasos e bloqueios.

Os **pipelines de software** utilizam **automação e ferramentas** para tornar o desenvolvimento contínuo. Eles permitem alterações, testes e verificações ao longo do processo, reduzindo erros humanos e aplicando o **Shift Left**.

### CI/CD

- **CI — Integração Contínua:** código é enviado a um repositório compartilhado e passa por builds e validações automáticas.
- **CD — Entrega Contínua:** builds são enviados continuamente para ambientes de teste, normalmente aguardando aprovação para produção.
- **CD — Implantação Contínua:** builds aprovados são implantados automaticamente em produção.

**Fluxo:**  
`Origem → Criação → Teste → Implantação → Monitoramento contínuo`

### Segurança no pipeline

No **DevSecOps**, a segurança está presente em todas as etapas, com verificações automatizadas de:

- Vulnerabilidades;
- Integridade;
- Políticas;
- Conformidade.

Quando um problema é encontrado, o pipeline pode **interromper o processo, corrigir o problema e executar novos testes**.

O **IAM** controla o acesso aos builds, enquanto as **contas de serviço** fornecem acessos específicos para aplicativos, VMs e serviços.

### Cloud Build

O **Cloud Build**, do Google Cloud, é um serviço **sem servidor** que automatiza builds e integra verificações de segurança ao pipeline, podendo verificar **vulnerabilidades, conformidade e integridade**.

### Para memorizar

**Pipeline = automação + CI/CD + testes + segurança**

**DevSecOps → segurança em todas as etapas.**

**Shift Left → segurança desde o início.**

**Cloud Build → builds automatizados + verificações de segurança.**
