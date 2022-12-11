package com.lnsantos.shrineincompose.ui.cart

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.RemoveCircleOutline
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.lnsantos.shrineincompose.ui.theme.ShrineInComposeTheme

@Composable
fun ListCart(quantity: Int = 7) {
    LazyColumn {
        repeat(quantity) {
            item {
                ItemCart {}
            }
        }
    }
}

@Composable
fun ItemCart(
    onRemovedItemClick: () -> Unit
) {
    Row(
        Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        IconButton(onClick = onRemovedItemClick) {
            Icon(
                imageVector = Icons.Default.RemoveCircleOutline, 
                contentDescription = "Remover item"
            )
        }
        Column(
            Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
           Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
             Text(text = "Vendedor", style = MaterialTheme.typography.body2)
             Text(text = "Price", style = MaterialTheme.typography.body2)
           }
           Text(text = "title", style = MaterialTheme.typography.subtitle2)
        }
    }
}

@Preview
@Composable
fun ListCartPreview() {
    ShrineInComposeTheme {
        ListCart()
    }
}

@Preview
@Composable
fun ItemCartPreview() {
    ShrineInComposeTheme {
        ItemCart{ }
    }
}