package com.raystudio.ios17launcher.core.ui

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

/**
 * iOS 17 inspired theme for the launcher
 */
private val LightColorScheme = lightColorScheme(
    primary = androidx.compose.ui.graphics.Color(0xFF007AFF),
    secondary = androidx.compose.ui.graphics.Color(0xFF5AC8FA),
    tertiary = androidx.compose.ui.graphics.Color(0xFFFF9500)
)

private val DarkColorScheme = darkColorScheme(
    primary = androidx.compose.ui.graphics.Color(0xFF0A84FF),
    secondary = androidx.compose.ui.graphics.Color(0xFF64D2FF),
    tertiary = androidx.compose.ui.graphics.Color(0xFFFF9F0A)
)

@Composable
fun iOS17Theme(
    darkTheme: Boolean = false,
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme

    MaterialTheme(
        colorScheme = colorScheme,
        content = content
    )
}
