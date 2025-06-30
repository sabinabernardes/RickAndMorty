package com.bina.designsystem.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import com.bina.designsystem.tokens.TypographyTokens.DefaultTypography

@Composable
fun RickAndMortyTheme(
    useDarkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (useDarkTheme) DarkColorScheme else LightColorScheme
    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography(
            bodyLarge = DefaultTypography.bodySmall,
            titleLarge = DefaultTypography.titleLarge,
            labelSmall = DefaultTypography.labelSmall
        ),
        content = content
    )
}
