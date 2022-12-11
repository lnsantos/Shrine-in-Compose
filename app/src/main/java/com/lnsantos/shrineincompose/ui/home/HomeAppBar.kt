package com.lnsantos.shrineincompose.ui.home

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.lnsantos.shrineincompose.R
import com.lnsantos.shrineincompose.ui.theme.ShrineInComposeTheme

@Composable
fun HomeAppBar(
    onMenuClick: () -> Unit
) {
    TopAppBar(
        title = {
            HomeTitleBar(title = "Shrine App", onMenuClick)
        },
        actions = {
            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = "Buscar"
            )
        },
        elevation = 0.dp
    )
}

@Composable
private fun HomeTitleBar(
    title: String,
    onMenuClick: () -> Unit
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .background(Color.Transparent)
            .padding(vertical = 8.dp)
    ) {
        Icon(
            modifier = Modifier.clickable(onClick = onMenuClick),
            painter = painterResource(id = R.drawable.ic_menu_cut),
            contentDescription = "Opções"
        )
        Text(text = title, style = MaterialTheme.typography.subtitle1)
    }
}

@Preview
@Composable
private fun HomeAppBarPreview() {
    ShrineInComposeTheme {
        HomeAppBar{ }
    }
}