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

## 🗂️ Estrutura do Projeto

```
RickyAndMorty/
├── app/                   # Módulo Android principal
├── core/
│   ├── ui/                # Componentes UI genéricos
│   ├── network/           # Retrofit, Moshi, interceptors
│   └── model/             # Data classes comuns
└── features/
    ├── character_list/   # Listagem + Paging 3
    └── character_detail/ # Tela de detalhe
```

---

## 🛠️ Tecnologias e Bibliotecas

- ✅ **Jetpack Compose** – UI moderna
- 🔄 **Navigation Compose** – Módulos screen-to-screen
- 🧩 **Coroutines + Flow** – Fluxos reativos
- 💉 **Koin** – Injeção de dependência leve
- 📡 **Retrofit + Moshi** – Req/resp JSON
- 📦 **Paging 3** – Anima lista infinita
- 🖼️ **Coil** – Carregamento de imagens
- 🧪 **JUnit + MockK** – Testes unitários

---

## 📌 Decisões Técnicas

- **Clean Architecture (simplificada)**:  
  Domain → UseCases, Data → Repositories, Presentation → Compose/ViewModels.

- **Modularização por feature**:  
  Garante desacoplamento, build incremental e testes isolados.

- **Estados explícitos**:  
  Uso do `UiState` com Loading / Success / Error para clareza e previsibilidade.

- **Teste early**:  
  Planejado para unit tests e instrumented tests no futuro próximo.

---

## 🧩 Ordem de Implementação

1. Criação do projeto base com structure de módulos
2. Setup Retrofit + Moshi e fetch da API
3. UI inicial com Jetpack Compose + Theme Material3
4. Listagem paginada com Paging 3
5. Navegação screen-to-screen (list → detail)
6. Implementação de Search por nome
7. Carregamento de imagens com Coil
8. Adição de estados (loading, error)
9. Suporte a dark mode
10. Preparação para testes + configuração de CI (GitHub Actions)

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

## 📈 Rumo ao Futuro

- [ ] Cobertura de testes (unit + UI com ComposeTestRule)  
- [ ] Implementar Favorites com Room  
- [ ] Animações sutis (paginações, transições)  
- [ ] Adicionar CI via GitHub Actions (build, test, lint)

---

## 🧑‍💻 Sobre

Projeto refatorado e mantido por **@sabinabernardes**, inspirado no original [BinaRickyMorty](https://github.com/sabinabernardes/BinaRickyMorty).  
Feito para aprender, compartilhar e evoluir.

---

