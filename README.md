# 🧠 RickyAndMorty (Refactor)

Este projeto é uma reestruturação/refactor do app original [BinaRickyMorty](https://github.com/sabinabernardes/BinaRickyMorty), mantendo o propósito: consumir a Rick and Morty API, aprender e aplicar boas práticas.

---

## 🔍 Visão Geral

App Android em Jetpack Compose + Clean Architecture para exibir personagens da série Rick and Morty. Permite:

- Listagem paginada de personagens
- Detalhes de personagem
- Busca por nome
- Tratamento de estados (loading, error, empty)
- Suporte a tema claro/escuro

---

## 🧱 Estrutura do Projeto e Organização

Este projeto foi pensado para ser modular, escalável e fácil de manter, seguindo os princípios de Clean Architecture, com divisão clara entre infraestrutura e features.

### 📦 Organização dos Módulos

```
:app                       # App launcher
:core:designsystem         # Tokens, componentes visuais, tema claro/escuro
:core:navigation           # Gerenciamento de rotas e destinos
:core:playground           # Tela interna para testes visuais dos componentes
:features:home             # Tela principal (home) com Clean Architecture
:features:detail           # Tela de detalhe com navegação via argumento
```

---

## 🏗️ Etapas de Implementação

### [Infraestrutura]

#### ✅ 001 - Setup inicial
- Estrutura base do projeto Android
- Criação da pasta `.github/workflows` com GitHub Actions (CI)
- Adição de Pull Request Template 

#### ✅ 002 - Design System
- Módulo `:core:designsystem` com tokens de cor, tipografia e espaçamento
- Suporte a modo claro/escuro com Material3
- Criação de componentes visuais reutilizáveis
- Módulo `:core:playground` para testes visuais (debug only)
- Testes instrumentados com `ComposeTestRule`

#### ✅ 003 - Navegação
- Módulo `:core:navigation`
- Abstrações para destinos (sealed classes ou rotas nomeadas)
- Suporte a argumentos entre telas
- Documentação dos ganhos (isolamento, preview, testes)

---

### [Features]

#### ✅ 001 - Módulo de Home
- Módulo `:features:home` com camadas `data`, `domain`, `presentation`
- Tela Compose consumindo dados fictícios
- Navegação para a tela de detalhes
- Testes unitários e de UI por camada

#### ✅ 002 - Módulo de Detalhes
- Módulo `:features:detail` com mesmo padrão do Home
- Recebimento de argumentos via navArgs
- Reuso de componentes do design system
- Cobertura de testes por camada

---

## 📋 Organização Detalhada de Branches e Tarefas

O projeto é organizado com branches numeradas por escopo técnico, camada e contexto de entrega. Essa granularidade facilita o rastreio, revisão e merge de partes específicas da base.

---

### 🛠️ Infraestrutura

#### `infra/001-project-setup`
- Criação do projeto Android
- Configuração inicial do Gradle e arquivos base (`README`, `.gitignore`)

#### `infra/002-github-actions`
- Configuração do CI com GitHub Actions (build, lint, test)

#### `infra/003-pr-templates`
- Adição de Pull Request e Issue templates na pasta `.github`

#### `infra/004-core-navigation-module`
- Criação do módulo `:core:navigation`
- Definição de estrutura base de rotas

#### `infra/005-core-designsystem-module`
- Criação do módulo `:core:designsystem`

#### `infra/006-designsystem-tokens`
- Implementação dos tokens: colors, spacing, typography

#### `infra/007-designsystem-theme`
- Implementação do tema claro/escuro usando MaterialTheme

#### `infra/008-designsystem-components`
- Criação dos primeiros componentes reutilizáveis (Botão, TextField, etc.)

#### `infra/009-playground-setup`
- Criação do módulo `:core:playground`
- Tela para visualização dos componentes

#### `infra/010-ui-tests-setup`
- Setup de testes instrumentados com `ComposeTestRule`
- Testes visuais para Design System

---

### 🧩 Features

#### 🏠 Home

##### `feature/home/001-structure`
- Criação do módulo `:features:home`
- Separação das camadas: `data`, `domain`, `presentation`

##### `feature/home/002-presentation-layer`
- Composable da tela inicial
- ViewModel + UiState

##### `feature/home/003-domain-layer`
- Casos de uso e modelos da camada de negócio

##### `feature/home/004-data-layer`
- Repositório, fake source/local data, DTOs

##### `feature/home/005-tests`
- Testes unitários e de UI por camada

##### `feature/home/006-navigation`
- Integração da tela com o NavGraph
- Envio de ID para próxima tela

---

#### 📄 Detail

##### `feature/detail/001-structure`
- Módulo `:features:detail` com camadas Clean

##### `feature/detail/002-presentation-layer`
- Composable da tela de detalhes
- ViewModel + estado com argumento

##### `feature/detail/003-domain-layer`
- Casos de uso, modelos, interfaces

##### `feature/detail/004-data-layer`
- Fonte de dados, mapeamento de dados, fake API

##### `feature/detail/005-tests`
- Testes unitários e de UI

##### `feature/detail/006-navigation`
- Recebimento e uso do argumento de navegação

---

## 🚀 Como Executar

1. Faça clone:
   ```bash
   git clone https://github.com/sabinabernardes/RickyAndMorty.git
   ```
2. Abra no Android Studio (recomenda-se 2024.3 ou superior)
3. Execute em emulador ou dispositivo real
4. Rode testes unitários via `./gradlew test`

**Requisitos**:  
- Min SDK 26  
- Target SDK 35  
- JDK 17

---

## 🧑‍💻 Sobre

Projeto refatorado e mantido por **@sabinabernardes**, inspirado no original [BinaRickyMorty](https://github.com/sabinabernardes/BinaRickyMorty).  
Feito para aprender, compartilhar e evoluir.

---

