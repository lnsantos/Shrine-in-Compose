package com.lnsantos.shrineincompose.ui.home

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.lnsantos.shrineincompose.ui.theme.ShrineInComposeTheme

@Composable
fun HomeMenuList(
    menuList: MutableList<HomeMenuType> = HomeMenuType.values().toMutableList(),
    onSelectedItem: (HomeMenuType) -> Unit = {}
) {
    var currentSelected by remember { mutableStateOf<HomeMenuType?>(value = null) }

    LazyColumn(
        modifier = Modifier.fillMaxWidth().padding(vertical = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(24.dp)
    ) {
        itemsIndexed(items = menuList) { index, item ->

            if (index == menuList.size - 1) {
                Divider(
                    modifier = Modifier
                        .size(width = 60.dp, height = 1.dp)
                        .padding(bottom = 24.dp),
                    color = MaterialTheme.colors.onBackground
                )
            }

            HomeMenuItem(
                data = item,
                currentItem = currentSelected,
                onSelectedItem = {
                    currentSelected = it
                    onSelectedItem(it)
                }
            )
        }
    }
}

@Composable
private fun HomeMenuItem(
    data: HomeMenuType,
    currentItem: HomeMenuType?,
    onSelectedItem: (HomeMenuType) -> Unit
) {

    val fontSize = if (data == currentItem) 22.sp else 18.sp

    Text(
        text = data.description.uppercase(),
        style = MaterialTheme.typography.subtitle1,
        fontSize = fontSize,
        modifier = Modifier.clickable { onSelectedItem(data) }
    )
}

@Preview
@Composable
private fun PreviewHomeMenuList() {
    ShrineInComposeTheme {
        HomeMenuList()
    }
}