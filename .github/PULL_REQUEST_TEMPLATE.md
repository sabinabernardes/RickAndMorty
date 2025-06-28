## 🚀 Description

> Brief summary of what was done. Include task context, goal of the MR, and expected behavior.
---
## 📸 Evidence (UI, Logs, Test Reports, etc.)

> Include screenshots, videos, logs, coverage reports or preview URLs if needed.

---

## 👀 How to Test

> Step-by-step to run the code, test the flow, or verify behavior locally. Include mock credentials if needed.

---

## ✅ Quality Checklist

### 🧱 Architecture
- [ ] Followed Clean Architecture with `data`, `domain`, and `presentation` layers
- [ ] No violation of unidirectional dependencies between modules

### 🧩 Declarative UI
- [ ] UI built exclusively using Jetpack Compose
- [ ] Proper state management applied

### 🎨 Design System
- [ ] Visual components reused or created in `:core:designsystem`
- [ ] Applied token-based spacing, typography, and color

### 🌗 Theming
- [ ] Validated in both light and dark mode
- [ ] Used `MaterialTheme` for consistent styling

### 🧭 Navigation
- [ ] Used centralized navigation from `:core:navigation`
- [ ] Used named or sealed class routes for type safety

### 🧪 Testing
- [ ] Automated tests added or updated for affected layers
- [ ] Proof of test execution provided (screenshots, logs, or coverage diff)

### ⚙️ CI
- [ ] CI passed (build, lint, test checks)

### 📝 Commits & Traceability
- [ ] Commit messages follow the convention (`feat:`, `fix:`, etc.)
- [ ] MR is linked to a well-defined, documented task

### 🧪 Playground Validation
- [ ] Visual components validated in `:core:playground`

## ⚠️ Notes

> Mention any external dependency, workaround, known tech debt or TODOs.