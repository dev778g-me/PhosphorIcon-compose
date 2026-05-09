# Phosphor Icons for Compose Multiplatform

A **Compose Multiplatform library of Phosphor Icons** for Jetpack Compose.

This library provides the complete **Phosphor icon set** as `ImageVector`s that work seamlessly with:

* Jetpack Compose (Android)
* Compose Multiplatform
* Desktop

It exposes the icons through a simple and familiar API similar to Material Icons.

---

## ✨ Features

* Full **Phosphor icon pack**
* Multiple icon weights
* Optimized `ImageVector` icons
* Works with **Jetpack Compose & Compose Multiplatform**
* Simple and clean API

---

## 📦 Installation

Add the dependency to your `build.gradle.kts`:

```kotlin
implementation("io.github.dev778g-me:phosphoricon-compose:1.0.4")
```

Sync your project after adding the dependency.

---

## 🧩 Icon Weights

Phosphor icons support multiple visual weights.

```kotlin
object PhIcons {
    object Light
    object Thin
    object Bold
    object Filled
    object Duotone
    object Regular
}
```

Each icon is available in these styles.

---

## 🚀 Usage

Example usage with `Icon` in Jetpack Compose:

```kotlin
Icon(
    imageVector = PhIcons.Duotone.AcornDuotone,
    tint = MaterialTheme.colorScheme.primary,
    contentDescription = "Acorn icon"
)
```

You can also control size using modifiers:

```kotlin
Icon(
    imageVector = PhIcons.Bold.AcornBold,
    contentDescription = "Acorn",
    modifier = Modifier.size(56.dp)
)
```

---

## 🎨 Example

```kotlin
Row {
    Icon(
        imageVector = PhIcons.Light.AcornLight,
        contentDescription = null
    )

    Icon(
        imageVector = PhIcons.Bold.AcornBold,
        contentDescription = null
    )

    Icon(
        imageVector = PhIcons.Filled.AcornFill,
        contentDescription = null
    )
}
```

---

## 🖥 Supported Platforms

* Android
* Desktop
* Compose Multiplatform

---

## 📚 About Phosphor Icons

Phosphor is a flexible icon family designed for interfaces, diagrams, and presentations.

Official website: https://phosphoricons.com

---

## 📄 License

Phosphor Icons are licensed under the MIT License.

This Compose wrapper library follows the same license.
