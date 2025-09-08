package com.example.bankingappui.ui.theme.Card

import androidx.compose.ui.graphics.Brush

data class Cards(
    val cardType : String,
    val cardNumber : String,
    val cardName : String,
    val balance : String,
    val color : Brush,
)