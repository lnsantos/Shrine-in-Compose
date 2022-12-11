package com.lnsantos.shrineincompose.ui.home

import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.tooling.preview.Preview
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
        backLayerContent = { HomeMenuList() },
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
