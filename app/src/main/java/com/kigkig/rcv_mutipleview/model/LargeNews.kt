package com.kigkig.rcv_mutipleview.model

import android.graphics.drawable.Drawable

data class LargeNews(
    override val title: String,
    override val image: Drawable?,
    val description: String
) : News() {
}