# Ciclo De Vida De Segurança - Modulo 3
______
# Termos do glossário do Módulo 3

| Termo | Definição |
|---|---|
| **Artefato** | Objeto digital, como arquivo ou imagem, usado no ciclo de vida de desenvolvimento de software. |
| **Aumento da proteção para a segurança** | Processo de fortalecer um sistema para reduzir vulnerabilidades e a superfície de ataque. |
| **Cadeia de suprimentos de software** | Pessoas, processos e ferramentas utilizados no desenvolvimento do software. |
| **Commit** | Alteração específica feita em um arquivo. |
| **Ciclo de vida de desenvolvimento de software** | Processo utilizado para desenvolver, testar e monitorar software. |
| **Deslocar para a esquerda (Shift Left)** | Implementação de verificações e práticas de segurança no início e ao longo de cada fase do desenvolvimento. |
| **Deslocamento de configuração** | Ocorre quando a configuração de um recurso é diferente do estado original ou esperado. |
| **DevSecOps** | Cultura com diretrizes, práticas recomendadas e ferramentas que permitem às equipes de desenvolvimento, operação e segurança trabalharem juntas. |
| **Entrega contínua** | Liberação contínua de builds de software em um ambiente de teste. |
| **GitOps** | Framework que aplica controle de versões, colaboração, compliance e CI/CD para automatizar a infraestrutura em nuvem. |
| **Implantação contínua** | Implantação automática de builds em um ambiente de produção em tempo real. |
| **Integração contínua** | Processo em que desenvolvedores criam e atualizam código continuamente em um repositório compartilhado. |
| **Integração contínua e entrega contínua (CI/CD)** | Processo utilizado pelas equipes de DevSecOps para criar software e automatizar atualizações. |
| **Infraestrutura como código (IaC)** | Prática de automatizar e gerenciar infraestrutura utilizando scripts reutilizáveis. |
| **Lista de materiais do software (SBOM)** | Lista legível por máquina de cada software e componente envolvido na cadeia de suprimentos. |
| **Política como código (PaC)** | Uso de código para definir, gerenciar e automatizar políticas, regras e condições. |
| **Procedência** | Descrição dos processos e ferramentas utilizados para criar um artefato. |
| **Pipeline do software** | Processo que utiliza ferramentas e automação para facilitar as mudanças entre as fases do ciclo de desenvolvimento do software. |
______
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

____
# 3. Fortalecimento da Cadeia de Suprimentos com o Software Delivery Shield

A **cadeia de suprimentos de software** envolve **pessoas, processos e ferramentas** usados no desenvolvimento. Como seus componentes podem apresentar vulnerabilidades, a segurança deve estar presente durante todo o ciclo.

O **SLSA** define padrões e controles para aumentar a **integridade dos artefatos**, enquanto o **Software Delivery Shield (SDS)** oferece recursos para fortalecer a cadeia no Google Cloud.

### Software Delivery Shield (SDS)

O **SDS** é uma solução gerenciada que fortalece a segurança da cadeia de suprimentos em todas as etapas do desenvolvimento. Ele combina:

- **Boas práticas do Google** para desenvolvimento seguro.
- **Dashboards do Google Cloud** para visualizar a segurança dos recursos.
- **Comparação com as diretrizes SLSA** para avaliar a segurança da cadeia.

### Principais recursos

- **Cloud Workstations:** ambientes de desenvolvimento seguros acessíveis pelo navegador, mantendo o código na nuvem e facilitando o uso de repositórios compartilhados.
- **SBOM:** lista, em formato legível por máquina, os softwares e componentes utilizados, facilitando a análise de segurança e compliance.
- **Assured OSS:** disponibiliza pacotes de código aberto confiáveis, com informações sobre componentes, melhorias e verificações regulares das dependências.

### SDS e Shift Left

O SDS reforça o **Shift Left**, aplicando segurança desde o início do desenvolvimento e fortalecendo o **DevSecOps**.

Na proteção dos pipelines **CI/CD**, destacam-se:

- **IAM:** controle preciso de quem pode acessar recursos.
- **VPC:** isolamento e controle dos ambientes de rede.
- **Ambientes nativos da nuvem:** integração entre ferramentas de desenvolvimento e segurança.

Essas práticas seguem as diretrizes do **SLSA**, ajudando a proteger artefatos durante as diferentes fases do pipeline e permitindo desenvolver, atualizar e implantar software com mais **segurança e eficiência**.

### Para memorizar

**SLSA → padrões e controles → integridade dos artefatos.**

**SDS → solução gerenciada → segurança de toda a cadeia.**

**SDS → boas práticas + dashboards + SLSA.**

**Recursos → Cloud Workstations + SBOM + Assured OSS.**

**Shift Left → segurança desde o início.**

**SDS + CI/CD + IAM + VPC → mais segurança, controle e eficiência.**
_____
# 4. Infraestrutura como Código (IaC)

**Infraestrutura como Código (IaC)** é a prática de **provisionar e gerenciar infraestrutura por meio de código e scripts reutilizáveis**, substituindo configurações manuais e reduzindo erros.

Na nuvem, a IaC permite automatizar a criação e o gerenciamento de recursos conforme a infraestrutura cresce ou diminui.

### Como funciona

A infraestrutura é descrita em um **arquivo de configuração**, armazenado em um **repositório compartilhado**. Isso permite:

- Controle de versões;
- Distribuição do código;
- Revisão e acompanhamento das alterações;
- Maior visibilidade para a equipe.

### Modelo declarativo

A IaC utiliza principalmente o modelo **declarativo**, no qual o profissional define o **estado desejado** da infraestrutura.

A ferramenta compara o **estado atual** com o **estado desejado** e realiza automaticamente as alterações necessárias.

### Ambiente imutável

Em um ambiente **imutável**, recursos desatualizados são **substituídos por versões atualizadas**, em vez de serem modificados diretamente.

### Principais benefícios

- **Redução de custos:** diminui tempo, esforço e complexidade.
- **Menos erros humanos:** reduz configurações manuais.
- **Velocidade e eficiência:** permite implantar infraestrutura de forma rápida e consistente.
- **Automação no DevSecOps:** integra segurança ao desenvolvimento e aos pipelines **CI/CD**.
- **Menos desvio de configuração:** mantém o arquivo como **fonte única da verdade**.
- **Visibilidade e responsabilidade:** facilita revisar e acompanhar alterações feitas pela equipe.

### IaC e segurança

A segurança pode ser incorporada à IaC por meio de **verificações automatizadas**, capazes de identificar:

- **Desvios de configuração**;
- **Violações de políticas**;
- **Problemas de segurança** nos recursos.

Assim, a IaC ajuda a **criar, padronizar, controlar, monitorar e proteger** a infraestrutura em nuvem.
_____
# 5. Política como Código (PaC)

**Política como Código (Policy as Code – PaC)** é o uso de **código para definir, gerenciar e automatizar políticas, regras e condições** de uma organização.

Ela permite aplicar políticas de forma **padronizada e automática**, principalmente para garantir **segurança e conformidade** durante o ciclo de vida do DevSecOps.

### PaC no DevSecOps

A PaC permite realizar **verificações automatizadas de segurança e conformidade**, fornecendo feedback contínuo.

Também pode utilizar **gatilhos automáticos** para alertar ou iniciar ações quando forem detectadas:

- Vulnerabilidades;
- Ameaças;
- Violações de políticas;
- Configurações incorretas.

Por exemplo, políticas podem verificar automaticamente se um aplicativo de monitoramento cardíaco atende aos requisitos da **HIPAA**.

### Principais benefícios

- **Controle de versões:** registra alterações e permite reverter versões.
- **Visibilidade:** facilita acompanhar a implementação das políticas.
- **Eficiência:** automatiza testes e aplicação das regras.
- **Colaboração:** facilita o trabalho conjunto entre equipes de engenharia e segurança.
- **Segurança e conformidade:** realiza verificações contínuas para identificar problemas.

### IaC × PaC

| Conceito | Função |
|---|---|
| **IaC** | Define e automatiza a **infraestrutura**. |
| **PaC** | Define e automatiza **políticas e regras**. |

______
# 6. Terraform como ferramenta de IaC:

**IaC (Infraestrutura como Código)** permite **criar e gerenciar infraestrutura usando código**, substituindo configurações manuais.

O **Terraform** é uma ferramenta de IaC que automatiza a criação e implantação de recursos na nuvem e funciona com diferentes plataformas.

## Arquivos e recursos

O Terraform utiliza **arquivos de configuração** para definir a infraestrutura desejada, como **VMs, VPCs e redes**.

- **Recurso:** define o que será criado.
- **Variável:** nome usado para identificar o recurso.
- **Local:** região e zona onde o recurso será criado.

### Exemplo de Infraestrutura (Rede, Sub-rede e VM)

```terraform
# Exemplo de uma rede
resource "google_compute_network" "vpc_network" {
  name                    = "my-custom-mode-network"
  auto_create_subnetworks = false
  mtu                     = 1460
}

# Exemplo de uma sub-rede
resource "google_compute_subnetwork" "default" {
  name          = "my-custom-subnet"
  ip_cidr_range = "10.0.1.0/24"
  region        = "us-west1"
  network       = google_compute_network.vpc_network.id
}

# Exemplo de uma VM
resource "google_compute_instance" "default" {
  name         = "flask-vm"
  machine_type = "f1-micro"
  zone         = "us-west1-a"
  tags         = ["ssh"]
```
____
# 7. GitOps

**GitOps** é uma metodologia que utiliza o **Git** e práticas de **controle de versões, colaboração, conformidade e CI/CD** para automatizar a infraestrutura em nuvem.

A **IaC é o processo central** da GitOps. A infraestrutura é escrita como código e armazenada em um **repositório Git**, que funciona como a **fonte única da verdade** para os arquivos de configuração. Isso facilita acompanhar alterações e identificar a versão correta da infraestrutura.

## Como funciona

Quando é necessário alterar a infraestrutura, o desenvolvedor cria uma **ramificação (branch)** e realiza uma **solicitação de envio ou mesclagem (pull/merge request)** para incorporar as alterações à ramificação principal.

- **Commit:** alteração específica feita em um arquivo.
- **Branch:** ramificação criada a partir do código principal para realizar alterações.
- **Pull/Merge Request:** solicitação para incorporar alterações ao código principal.
- **Git:** sistema usado para controlar e acompanhar versões do código.

A GitOps utiliza **CI/CD** para entregar essas alterações. A integração e a entrega contínuas permitem incorporar **IaC, segurança e requisitos de conformidade** durante o desenvolvimento.

## GitOps e DevSecOps

A GitOps segue o princípio **Shift Left**, permitindo aplicar a segurança desde o início.

O pipeline de **CI/CD** pode realizar automaticamente:

- Verificações de vulnerabilidades;
- Verificações de conformidade da IaC;
- Validações das alterações.

Assim, problemas podem ser identificados **antes da implantação**.

## Principais benefícios

- **Eficiência e visibilidade:** infraestrutura e aplicações são gerenciadas com controle de versões.
- **Controle centralizado:** facilita o gerenciamento de aplicações e infraestrutura.
- **Colaboração:** permite acompanhar e revisar alterações.
- **Automação:** reduz processos manuais.
- **Containers e microsserviços:** seus princípios são especialmente úteis para organizações que utilizam esses serviços.
