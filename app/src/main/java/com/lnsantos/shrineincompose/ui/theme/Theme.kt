package com.lnsantos.shrineincompose.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable

@Composable
fun ShrineInComposeTheme(content: @Composable () -> Unit){
    MaterialTheme(
        colors = ShrineColorPalette,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}