package com.lnsantos.shrineincompose.ui.cart

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.lnsantos.shrineincompose.ui.theme.ShrineInComposeTheme

@Composable
fun CartScreen() {
    Surface() {
        Column(
            Modifier.fillMaxSize()
        ) {
            RowCart(quantity = fakeCartItems.size) {}
            ListCart(fakeCartItems) {}
            Button(onClick = {}, Modifier.fillMaxWidth().padding(16.dp)) {
                Text(text = "Confirmar compra")
            }
        }
    }
}

@Preview
@Composable
fun CartScreenPreview() {
    ShrineInComposeTheme {
        CartScreen()
    }
}