package com.lnsantos.shrineincompose.ui.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.lnsantos.shrineincompose.ui.cart.CartScreen
import com.lnsantos.shrineincompose.ui.theme.ShrineInComposeTheme
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun HomeScreen() {

    val coroutineScope = rememberCoroutineScope()
    val scaffoldState = rememberBackdropScaffoldState(BackdropValue.Concealed)

    BackdropScaffold(
        appBar = {
            HomeAppBar { coroutineScope changeStateBackdrop scaffoldState }
        },
        backLayerContent = {
            Column(
                Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "Item 1", style = MaterialTheme.typography.h3)
                Text(text = "Item 2", style = MaterialTheme.typography.h3)
                Text(text = "Item 3", style = MaterialTheme.typography.h3)
                Text(text = "Item 4", style = MaterialTheme.typography.h3)
            }
        },
        frontLayerContent = { CartScreen() },
        scaffoldState = scaffoldState,
        frontLayerShape = MaterialTheme.shapes.large
    )
}

@OptIn(ExperimentalMaterialApi::class)
private infix fun CoroutineScope.changeStateBackdrop(state: BackdropScaffoldState) {
    when (state.isConcealed) {
        true -> launch { state.reveal() }
        else -> launch { state.conceal() }
    }
}

@Preview
@Composable
private fun HomeScreenPreview() {
    ShrineInComposeTheme {
        HomeScreen()
    }
}
