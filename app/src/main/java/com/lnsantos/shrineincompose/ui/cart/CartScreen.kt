package com.lnsantos.shrineincompose.ui.cart

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun CartScreen() {
    Surface() {
        Column(
            Modifier.fillMaxSize()
        ) {
            RowCart {}
        }
    }
}