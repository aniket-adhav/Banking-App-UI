package com.example.bankingappui

import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AttachMoney
import androidx.compose.material.icons.rounded.CurrencyYen
import androidx.compose.material.icons.rounded.Euro
import androidx.compose.material.icons.rounded.KeyboardArrowDown
import androidx.compose.material.icons.rounded.KeyboardArrowUp
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bankingappui.ui.theme.BlueStart
import com.example.bankingappui.ui.theme.Currency.Currency
import com.example.bankingappui.ui.theme.GreenStart

var currency = listOf(
    Currency(
        name = "USD",
        buy = 23.35f,
        sell = 22.25f,
        icon = Icons.Rounded.AttachMoney
    ),
    Currency(
        name = "EUR",
        buy = 17.36f,
        sell = 13.45f,
        icon = Icons.Rounded.Euro
    ),
    Currency(
        name = "YEN",
        buy = 38.36f,
        sell = 37.45f,
        icon = Icons.Rounded.CurrencyYen
    ),
    Currency(
        name = "USD",
        buy = 46.35f,
        sell = 66.25f,
        icon = Icons.Rounded.AttachMoney
    ),
    Currency(
        name = "EUR",
        buy = 45.36f,
        sell = 45.45f,
        icon = Icons.Rounded.Euro
    ),
    Currency(
        name = "YEN",
        buy = 18.36f,
        sell = 37.45f,
        icon = Icons.Rounded.CurrencyYen
    ),
    Currency(
        name = "USD",
        buy = 23.35f,
        sell = 22.25f,
        icon = Icons.Rounded.AttachMoney
    ),
    Currency(
        name = "EUR",
        buy = 17.36f,
        sell = 13.45f,
        icon = Icons.Rounded.Euro
    ),
    Currency(
        name = "YEN",
        buy = 38.36f,
        sell = 37.45f,
        icon = Icons.Rounded.CurrencyYen
    ),
    Currency(
        name = "USD",
        buy = 46.35f,
        sell = 66.25f,
        icon = Icons.Rounded.AttachMoney
    ),
    Currency(
        name = "EUR",
        buy = 45.36f,
        sell = 45.45f,
        icon = Icons.Rounded.Euro
    ),
    Currency(
        name = "YEN",
        buy = 18.36f,
        sell = 37.45f,
        icon = Icons.Rounded.CurrencyYen
    ),
)


@Preview
@Composable
fun CurrenciesSection(){
    var isVisible by remember {
        mutableStateOf(false)
    }

    var iconState by remember {
        mutableStateOf(Icons.Rounded.KeyboardArrowUp)
    }
    Box(
        modifier = Modifier
            .padding(top = 20.dp)
            .fillMaxSize(),
        contentAlignment = Alignment.BottomCenter
    ){
        Column(
            modifier = Modifier
                .clip(RoundedCornerShape(topStart = 30.dp, topEnd = 30.dp))
                .background(MaterialTheme.colorScheme.inverseOnSurface)
                .animateContentSize(),
        ){

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
                    .animateContentSize(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    modifier= Modifier
                        .clip(CircleShape)
                        .background(MaterialTheme.colorScheme.secondary)
                        .clickable{
                            isVisible=!isVisible
                            if(isVisible){
                                iconState= Icons.Rounded.KeyboardArrowUp
                            }
                            else{
                                iconState= Icons.Rounded.KeyboardArrowDown
                            }
                        }
                ){
                    Icon(
                        modifier = Modifier.size(25.dp),
                        imageVector = iconState,
                        contentDescription = "Currencies",
                        tint = MaterialTheme.colorScheme.onSecondary
                    )
                }

                Spacer(modifier=Modifier.width(20.dp))

                Text(
                    text = "Currencies",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    color = MaterialTheme.colorScheme.onSecondaryContainer
                )
            }
            Spacer(
                modifier = Modifier
                    .height(1.dp)
                    .background(MaterialTheme.colorScheme.secondaryContainer)
                    .fillMaxWidth()
            )
            if(isVisible){
                BoxWithConstraints(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp)
                        .clip(RoundedCornerShape(topStart = 26.dp, topEnd = 26.dp))
                        .background(MaterialTheme.colorScheme.background),
                ){

                    var boxWithConstraintsScope = this
                    var width = boxWithConstraintsScope.maxWidth/3

                    Column(
                        modifier =Modifier.fillMaxSize()
                            .padding(horizontal = 16.dp),
                    ) {
                        Spacer(modifier=Modifier.height(10.dp))

                        Row(modifier=Modifier.fillMaxWidth()){
                            Text(
                                modifier= Modifier.width(width),
                                text = "Currency",
                                fontWeight = FontWeight.SemiBold,
                                fontSize = 16.sp,
                                color = MaterialTheme.colorScheme.onBackground
                            )
                            Text(
                                modifier= Modifier.width(width),
                                text = "Buy",
                                fontWeight = FontWeight.SemiBold,
                                fontSize = 16.sp,
                                color = MaterialTheme.colorScheme.onBackground,
                                textAlign = TextAlign.End
                            )
                            Text(
                                modifier= Modifier.width(width),
                                text = "Sell",
                                fontWeight = FontWeight.SemiBold,
                                fontSize = 16.sp,
                                color = MaterialTheme.colorScheme.onBackground,
                                textAlign = TextAlign.End
                            )
                        }
                        Spacer(modifier= Modifier.height(10.dp))

                        LazyColumn() {
                            items(currency.size){ index->
                                CurrenciesItem(index=index,width=width)

                            }
                        }
                    }

                }
            }

        }
    }

}


@Composable
fun CurrenciesItem(index: Int, width: Dp){
    var currencyy = currency[index]

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row(
            modifier = Modifier
                .width(width),
            verticalAlignment = Alignment.CenterVertically)
        {
            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(8.dp))
                    .background(GreenStart)
                    .padding(4.dp),
            ){
                Icon(
                    modifier = Modifier.size(20.dp),
                    imageVector = currencyy.icon,
                    contentDescription = currencyy.name,
                    tint = Color.White
                )

            }
            Text(
                modifier= Modifier.padding(start = 10.dp),
                text = currencyy.name,
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp,
                color = MaterialTheme.colorScheme.onBackground,
                textAlign = TextAlign.End
            )
        }

        Text(
            modifier= Modifier.width(width).padding(start = 10.dp),
            text = "₹${currencyy.buy}",
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp,
            color = MaterialTheme.colorScheme.onBackground,
            textAlign = TextAlign.End
        )
        Text(
            modifier= Modifier.width(width).padding(start = 10.dp),
            text = "₹${currencyy.sell}",
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp,
            color = MaterialTheme.colorScheme.onBackground,
            textAlign = TextAlign.End
        )

    }
}


















