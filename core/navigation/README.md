# Módulo core:navigation

## Objetivo
Este módulo centraliza as abstrações de navegação da aplicação, promovendo isolamento, facilidade de testes e melhor suporte a previews.

## Abordagem
- **Destinos como sealed classes**: Cada tela ou fluxo é representado por uma sealed class, facilitando a manutenção e o uso de argumentos tipados.
- **Suporte a argumentos**: Destinos podem receber argumentos de forma segura, evitando erros de digitação em rotas.
- **Interface Navigator**: Permite abstrair a navegação, facilitando mocks em testes e previews.

## Ganhos
- **Isolamento**: A navegação fica desacoplada das implementações de UI, facilitando mudanças e manutenção.
- **Preview**: Telas podem ser visualizadas em previews sem dependência do sistema de navegação real.
- **Testes**: É possível testar fluxos de navegação facilmente, utilizando implementações fake/mocks do Navigator.

## Exemplo de uso
```kotlin
val navigator: Navigator = ...
navigator.navigateTo(NavDestination.Detail(itemId = "42"))
```

