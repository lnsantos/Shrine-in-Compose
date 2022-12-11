package com.lnsantos.shrineincompose.ui.cart

import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.lnsantos.shrineincompose.ui.theme.ShrineInComposeTheme

@Composable
fun RowCart(
    onClick: () -> Unit
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.fillMaxWidth()
    ) {
        IconButton(onClick = onClick) {
            Icon(
                imageVector = Icons.Filled.KeyboardArrowDown,
                contentDescription = "Esconder"
            )
        }
        Spacer(modifier = Modifier.padding(vertical = 8.dp))
        Text(text = "Cart".uppercase(), fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.padding(start = 16.dp))
        Text(text = "2 Items".uppercase())
    }
}

@Preview
@Composable
private fun RowCartPreview() {
    ShrineInComposeTheme {
        RowCart {}
    }
}