package com.lnsantos.shrineincompose.ui.cart

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.RemoveCircleOutline
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.lnsantos.shrineincompose.ui.theme.ShrineInComposeTheme

@Composable
fun ListCart(
    itemsShop: MutableList<CartVO> = arrayListOf(),
    listState: LazyListState = rememberLazyListState(),
    onRemoved: (CartVO) -> Unit
) {
    LazyColumn(state = listState) {
        items(itemsShop) { item ->
            ItemCart(
                data = item,
                onRemovedItemClick = onRemoved
            )
        }
    }
}

@Composable
fun ItemCart(
    data: CartVO,
    onRemovedItemClick: (CartVO) -> Unit
) {
    Row(
        Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        IconButton(onClick = { onRemovedItemClick(data) }) {
            Icon(
                imageVector = Icons.Default.RemoveCircleOutline, 
                contentDescription = "Remover item"
            )
        }
        Spacer(modifier = Modifier.padding(6.dp))
        Image(
            painter = painterResource(id = data.photoResId),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.size(60.dp)
        )
        Spacer(modifier = Modifier.padding(6.dp))
        Column(
            Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
           Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
             Text(text = data.vendor.name.uppercase(), style = MaterialTheme.typography.body2)
             Text(text = data.price.uppercase(), style = MaterialTheme.typography.body2)
           }
           Text(text = data.title.uppercase(), style = MaterialTheme.typography.subtitle2)
        }
    }
}

@Preview
@Composable
fun ListCartPreview() {
    ShrineInComposeTheme {
        ListCart(fakeCartItems){}
    }
}

@Preview
@Composable
fun ItemCartPreview() {
    ShrineInComposeTheme {
        ItemCart(fakeCartItems[0]){ }
    }
}