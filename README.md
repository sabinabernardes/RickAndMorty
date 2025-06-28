# 🧠 RickyAndMorty (Refactor)

Este projeto é uma reestruturação/refactor do app original [BinaRickyMorty](https://github.com/sabinabernardes/BinaRickyMorty), mantendo o propósito: consumir a Rick and Morty API, aprender e aplicar boas práticas.

---

## 🔍 Visão Geral

Este app explora conceitos modernos do ecossistema Android, com destaque para:

- ✅ Composição 100% declarativa com **Jetpack Compose**
- 🧠 Organização por **camadas e módulos** (infra, domain, features)
- 💉 **Koin** para injeção de dependência
- 🔁 Paginação eficiente com **Paging 3**
- 🔌 Consumo de API com **Retrofit + Kotlin Serialization**
- ✅ Testes automatizados (unitários e instrumentados)
- ☁️ Modularização por feature para ganho em build time
- 🌗 Suporte completo a tema claro/escuro
- 👩‍🔬 Navegação desacoplada com gerenciamento de estados

---

## 🧱 Estrutura do Projeto e Organização

Este projeto foi pensado para ser modular, escalável e fácil de manter, seguindo os princípios de Clean Architecture, com divisão clara entre infraestrutura e features.

### 📦 Organização dos Módulos

O projeto segue a Clean Architecture, separando as camadas de forma **independente e testável**:

```
app/
features/
├── home/
│   ├── data/
│   ├── domain/
│   └── presentation/
├── details/
│   ├── data/
│   ├── domain/
│   └── presentation/
core/
├── network/
├── designsystem/
├── playground/
├── ui/
├── navigation/
```

- `core/`: módulos reutilizáveis e agnósticos à feature  
- `features/`: cada funcionalidade isolada com data/domain/presentation  
- Navegação desacoplada por rotas nomeadas ou seladas  
- Compose Preview para validação visual

---
## 🧰 Tech Stack

| Tecnologia          | Descrição                           |
|---------------------|-------------------------------------|
| 🧬 Kotlin            | Linguagem principal                 |
| 🎨 Jetpack Compose  | UI moderna e reativa                |
| 📦 Koin             | Injeção de dependência              |
| 📡 Retrofit         | Requisições HTTP                    |
| 🔄 Paging 3         | Paginação eficiente                 |
| 🧪 JUnit, MockK     | Testes unitários                    |
| 🧪 Compose Testing  | Testes instrumentados               |

---

## 🏗️ Qualidade do Projeto
---
<details>
<summary><strong>🥇 Premissas Técnicas de Qualidade</strong></summary>

<br/>

- 🧱 **Arquitetura modular baseada em Clean Architecture**  
  Separação em camadas `data`, `domain` e `presentation`, com dependências unidirecionais e acoplamento mínimo entre módulos.

- 🧩 **Interface declarativa com Jetpack Compose**  
  Toda a camada de UI é construída exclusivamente com Compose, evitando uso misto com Views ou XML. Gerenciamento explícito de estado e reatividade controlada.

- 🎨 **Design System centralizado e orientado a tokens**  
  Todos os componentes visuais são implementados no módulo `:core:designsystem`, com base em tokens de cor, espaçamento e tipografia. Nenhum componente é recriado em features.

- 🌗 **Suporte nativo a temas claro e escuro**  
  O tema é adaptável ao sistema operacional, aplicado via `MaterialTheme`, e validado por meio de tela de playground visual.

- 🧭 **Navegação desacoplada via módulo dedicado**  
  A navegação é centralizada no módulo `:core:navigation`, utilizando rotas nomeadas ou sealed classes para garantir escalabilidade e segurança de tipo.

- 🧪 **Cobertura de testes como requisito de entrega**  
  Todas as camadas possuem testes unitários e/ou instrumentados. Pull requests devem conter validação automatizada e evidência de cobertura mínima.

- ⚙️ **Integração contínua automatizada (CI)**  
  Workflows via GitHub Actions executam build, lint e testes automaticamente em cada pull request. Falhas bloqueiam merge.

- 📝 **Commits e MRs vinculados a tarefas rastreáveis**  
  As mensagens de commit seguem convenções definidas. Todo merge request é associado a uma tarefa técnica clara e documentada.

- 🧪 **Playground para validação isolada de UI**  
  Cada componente visual é validado de forma independente no módulo `:core:playground` antes de ser integrado em features.

- 📚 **Documentação versionada e obrigatória**  
  README, templates e anotações técnicas são tratados como parte do código-fonte. Toda alteração relevante exige documentação correspondente.

</details>

## 🏗️ Etapas de Implementação + Organização de Branches

Abaixo estão listadas as etapas do projeto junto com suas respectivas branches, organizadas por contexto e granularidade. Isso facilita rastreamento técnico, controle de versão e revisão.

---

<details>
<summary><strong>Infraestrutura</strong></summary>

<br/>

### ✅ 001 - Setup inicial (`infra/001-project-setup`)
- Criação do projeto Android
- Configuração inicial do Gradle e arquivos base (`README`, `.gitignore`)

### ✅ 002 - GitHub Actions (`infra/002-github-actions`)
- Configuração do CI com GitHub Actions (build, lint, test)

### ✅ 003 - Templates de PR e Issues (`infra/003-pr-templates`)
- Adição de Pull Request e Issue templates na pasta `.github`

### ✅ 004 - Navegação (`infra/004-core-navigation-module`)
- Criação do módulo `:core:navigation`
- Abstrações para destinos (sealed classes ou rotas nomeadas)
- Suporte a argumentos entre telas
- Documentação dos ganhos (isolamento, preview, testes)

### ✅ 005 - Design System Base (`infra/005-core-designsystem-module`)
- Criação do módulo `:core:designsystem`

### ✅ 006 - Tokens (`infra/006-designsystem-tokens`)
- Definição de tokens de cor, tipografia e espaçamento

### ✅ 007 - Tema claro/escuro (`infra/007-designsystem-theme`)
- Suporte a modo claro/escuro com MaterialTheme

### ✅ 008 - Componentes visuais (`infra/008-designsystem-components`)
- Criação dos primeiros componentes reutilizáveis (Botão, TextField, etc.)

### ✅ 009 - Playground (`infra/009-playground-setup`)
- Módulo `:core:playground` para testes visuais (debug only)

### ✅ 010 - Testes instrumentados (`infra/010-ui-tests-setup`)
- Setup de testes com `ComposeTestRule`
- Testes visuais dos componentes

</details>

---

<details>
<summary><strong>Features</strong></summary>

<br/>

### 🏠 Módulo de Home

#### ✅ Estrutura inicial (`feature/home/001-structure`)
- Criação do módulo `:features:home`
- Separação das camadas: `data`, `domain`, `presentation`

#### ✅ UI e ViewModel (`feature/home/002-presentation-layer`)
- Composable da tela inicial
- ViewModel + UiState

#### ✅ Casos de uso (`feature/home/003-domain-layer`)
- Lógica de negócio e abstrações

#### ✅ Repositório e dados (`feature/home/004-data-layer`)
- Fonte de dados fake/local, DTOs, mappers

#### ✅ Testes (`feature/home/005-tests`)
- Testes unitários por camada
- Testes de UI com Compose

#### ✅ Navegação (`feature/home/006-navigation`)
- Integração da Home com NavGraph
- Envio de ID para próxima tela

---

### 📄 Módulo de Detalhes

#### ✅ Estrutura inicial (`feature/detail/001-structure`)
- Criação do módulo `:features:detail` com base Clean

#### ✅ UI e estado (`feature/detail/002-presentation-layer`)
- Composable da tela de detalhes
- ViewModel + argumentos

#### ✅ Casos de uso (`feature/detail/003-domain-layer`)
- Lógica de negócio da tela de detalhe

#### ✅ Repositório e dados (`feature/detail/004-data-layer`)
- Fonte de dados, mapeamentos, simulação de API

#### ✅ Testes (`feature/detail/005-tests`)
- Unitários por camada
- UI test para fluxo principal

#### ✅ Navegação (`feature/detail/006-navigation`)
- Recebimento e uso do argumento de navegação via navArgs

</details>

---

## 🚀 Como rodar o projeto

1. Clone o repositório:
```bash
git clone https://github.com/sabinabernardes/BinaRickAndMorty.git
```

2. Abra no Android Studio Hedgehog+  
3. Rode com o **Emulador API 33+ ou dispositivo real**

> 🔐 Este projeto não requer chaves de API — usa uma API pública.

---

## 🧪 Testes

Testes estão organizados por camada:

- **Domain layer**: validação de regras de negócio com `MockK`
- **Presentation layer**: testes de UI com `Compose Testing` e `Espresso`
- **Data layer**: testes de fallback e falhas de rede com Retrofit

Cobertura de testes segmentada por módulo.  
Cobertura atual: **85% na camada de domínio, 70% no total**

Comandos:

```bash
./gradlew test
./gradlew connectedAndroidTest
./gradlew jacocoTestReport
```

---

## 📊 Monitoramento e Qualidade

- Uso de **Firebase Crashlytics** e **Logcat estruturado**
- Monitoramento de **ANRs e FPS** via Android Vitals
- Logs com categorizações por feature e tipo de evento
- Rollouts graduais com Feature Flags e staged rollout no Play Console

---

## 🤖 CI/CD

> ⚙️ Pipeline configurado com **GitHub Actions**:

- Build automático a cada push
- Execução de testes unitários
- Checagem de lint
- [ ] *(se aplicável)* Deploy para Firebase App Distribution

---
**Requisitos**:  
- Min SDK 26  
- Target SDK 35  
- JDK 17

---
---

## 📱 Funcionalidades

- 🔍 Buscar personagens por nome
- 📋 Listagem paginada com scroll infinito
- 💾 Exibição de detalhes de personagem
- 🌕 Suporte a tema escuro
- 🚫 Tratamento de erros (timeout, sem internet, etc)
- ✨ Navegação entre telas com animação

---

## 📸 Screenshots

| Home                       | Detalhe do Personagem           |
|----------------------------|----------------------------------|
| ![Captura de Tela 2025-06-28 às 13 53 36](https://github.com/user-attachments/assets/2020e3d5-6418-4527-a848-68e0d1573d20)
 |
|  ![Captura de Tela 2025-06-28 às 13 53 46](https://github.com/user-attachments/assets/6b37018e-668b-4bb3-89b6-e731558c4b38)
|

---

## 🧠 Decisões Técnicas

| Tema                     | Justificativa                                                                 |
|--------------------------|------------------------------------------------------------------------------|
| `Paging 3`               | Evita múltiplas requisições e melhora performance de listas                  |
| `Compose`                | Facilita previews e reatividade da UI                                        |
| `Kotlin Serialization`   | Evita reflection e é mais leve que Moshi/Gson                                |
| Modularização por feature| Reduz acoplamento e melhora testabilidade/tempo de build                    |
| Navegação via route      | Permite extensibilidade e modularização                                     |

---

## 🧯 Roadmap / Melhorias Futuras

- [ ] Persistência offline com Room
- [ ] Testes de screenshot com Paparazzi
- [ ] Tela de favoritos
- [ ] Lint customizado por domínio
- [ ] CI com deploy para Play Internal Track

---

## 🧑‍💻 Sobre

Projeto refatorado e mantido por **@sabinabernardes**, inspirado no original [BinaRickyMorty](https://github.com/sabinabernardes/BinaRickyMorty).  
Feito para aprender, compartilhar e evoluir.

---

