package com.example.bankingappui.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.materialIcon
import androidx.compose.material.icons.rounded.AccountCircle
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Notifications
import androidx.compose.material.icons.rounded.Wallet
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.bankingappui.ui.theme.Data.Bottomitems

var items : List<Bottomitems> = listOf(
    Bottomitems(
        title = "Home",
        icons = Icons.Rounded.Home
    ),
    Bottomitems(
        title = "Wallet",
        icons = Icons.Rounded.Wallet
    ),
    Bottomitems(
        title = "Notifications",
        icons = Icons.Rounded.Notifications
    ),
    Bottomitems(
        title = "Account",
        icons = Icons.Rounded.AccountCircle
    ),
)




@Preview
@Composable
fun BottomNavigationBar(){
    NavigationBar {
        Row(
            modifier = Modifier.background(MaterialTheme.colorScheme.inverseOnSurface)
        ) {
            items.forEachIndexed { index,item ->
                NavigationBarItem(
                    selected = index == 0,
                    onClick = {},
                    icon = {
                        Icon(
                            imageVector = item.icons,
                            contentDescription = item.title,
                            tint = MaterialTheme.colorScheme.onBackground
                        )
                    },
                    label = {
                        Text(text = item.title)
                    }
                )
            }
        }
    }
}