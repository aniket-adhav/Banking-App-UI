package com.example.bankingappui.ui.theme.Currency

import androidx.compose.ui.graphics.vector.ImageVector

data class Currency(
    var name : String,
    var buy : Float,
    var sell : Float,
    var icon : ImageVector
)