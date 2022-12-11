package com.lnsantos.shrineincompose.ui.cart

import androidx.annotation.DrawableRes
import androidx.annotation.IdRes
import com.lnsantos.shrineincompose.R
import java.util.*

enum class Vendor {
    Alphim,
    Lmbrjk,
    Mal,
    Six,
    Squiggle
}

data class CartVO(
    val id: String = UUID.randomUUID().toString(),
    val title: String,
    val price: String,
    val vendor: Vendor,
    @DrawableRes val photoResId: Int
)

val fakeCartItems = arrayListOf(
    CartVO(
        title = "Vagabound sack",
        price = "R$ 120,00",
        vendor = Vendor.Squiggle,
        photoResId = R.drawable.photo_0
    ),
    CartVO(
        title = "Stella sunglasses",
        price = "R$ 60,00",
        vendor = Vendor.Mal,
        photoResId = R.drawable.photo_1
    ),
    CartVO(
        title = "Whitney belt",
        price = "R$ 35,00",
        vendor = Vendor.Lmbrjk,
        photoResId = R.drawable.photo_2
    ),
    CartVO(
        title = "Garden stand",
        price = "R$ 90,00",
        vendor = Vendor.Alphim,
        photoResId = R.drawable.photo_3
    ),
    CartVO(
        title = "Strut earrings",
        price = "R$ 1.200,00",
        vendor = Vendor.Six,
        photoResId = R.drawable.photo_3
    )
)