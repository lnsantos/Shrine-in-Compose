package com.lnsantos.shrineincompose.ui.theme

import androidx.compose.material.lightColors
import androidx.compose.ui.graphics.Color

val ShrinePink10 = Color(0xFFFFFBFA)
val ShrinePink50 = Color(0xFFFEEAE6)
val ShrinePink100 = Color(0xFFFEDBD0)
val ShrinePink300 = Color(0xFFFFF0EA)
val ShrinePink500 = Color(0xFFFBB8AC)
val ShrinePink900 = Color(0xFF442C2E)

val ShrineError100 = Color(0xFFC5032B)

val ShrineColorPalette = lightColors(
    primary = ShrinePink100,
    primaryVariant = ShrinePink500,
    secondary = ShrinePink50,
    background = ShrinePink100,
    surface = ShrinePink10,
    error = ShrineError100,
    onPrimary = ShrinePink900,
    onSecondary = ShrinePink900,
    onBackground = ShrinePink900,
    onSurface = ShrinePink900,
    onError = ShrinePink10
)