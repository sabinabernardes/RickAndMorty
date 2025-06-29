package com.bina.designsystem.theme

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.material3.ColorScheme
import androidx.compose.ui.graphics.Color

val LightColorScheme: ColorScheme = lightColorScheme(
    primary = Color(0xFF00B4D8),
    onPrimary = Color(0xFFFFFFFF),
    primaryContainer = Color(0xFF90E0EF),
    onPrimaryContainer = Color(0xFF000000),
    secondary = Color(0xFF90E0EF),
    onSecondary = Color(0xFF000000),
    background = Color(0xFFFFFFFF),
    onBackground = Color(0xFF000000),
    surface = Color(0xFFF6F6F6),
    onSurface = Color(0xFF000000),
    error = Color(0xFFB00020),
    onError = Color(0xFFFFFFFF)
)

val DarkColorScheme: ColorScheme = darkColorScheme(
    primary = Color(0xFF00B4D8),
    onPrimary = Color(0xFF000000),
    primaryContainer = Color(0xFF0077B6),
    onPrimaryContainer = Color(0xFFFFFFFF),
    secondary = Color(0xFF90E0EF),
    onSecondary = Color(0xFF000000),
    background = Color(0xFF121212),
    onBackground = Color(0xFFFFFFFF),
    surface = Color(0xFF222222),
    onSurface = Color(0xFFFFFFFF),
    error = Color(0xFFCF6679),
    onError = Color(0xFF000000)
)

