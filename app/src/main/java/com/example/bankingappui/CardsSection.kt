package com.example.bankingappui

import android.graphics.fonts.Font
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bankingappui.ui.theme.BlueEnd
import com.example.bankingappui.ui.theme.BlueStart
import com.example.bankingappui.ui.theme.Card.Cards
import com.example.bankingappui.ui.theme.GreenEnd
import com.example.bankingappui.ui.theme.GreenStart
import com.example.bankingappui.ui.theme.OrangeEnd
import com.example.bankingappui.ui.theme.OrangeStart
import com.example.bankingappui.ui.theme.PurpleEnd
import com.example.bankingappui.ui.theme.PurpleStart

val cards = listOf(
    Cards(
        cardType = "VISA",
        cardNumber = "4657 8679 0985 6754",
        cardName = "Business",
        balance = "₹3500.27",
        color = gredient(PurpleStart, PurpleEnd),
    ),
    Cards(
        cardType = "MASTER CARD",
        cardNumber = "7684 9786 5635 8235",
        cardName = "Savings",
        balance = "₹1136.2",
        color = gredient(BlueStart, BlueEnd),
    ),
    Cards(
        cardType = "VISA",
        cardNumber = "2845 5763 4654 3458",
        cardName = "Travel",
        balance = "₹11.2",
        color = gredient(OrangeStart, OrangeEnd),
    ),
    Cards(
        cardType = "MASTER CARD",
        cardNumber = "9683 4653 3342 3242",
        cardName = "School",
        balance = "₹2004.2",
        color = gredient(GreenStart, GreenEnd),
    ),
)

fun gredient(
    startcolor : Color,
    endcolor : Color
): Brush {
    return Brush.horizontalGradient(
        colors = listOf(startcolor,endcolor)
    )
}


@Preview
@Composable
fun CardsSection(){
    LazyRow() {
        items(cards.size){ index->
            Carditem(index)
        }
    }
}
@Composable
fun Carditem(index : Int){
    val card = cards[index]
    var lastItemPaddingEnd = 0.dp
    if(index==cards.size-1){
        lastItemPaddingEnd = 16.dp
    }

    var image = painterResource(id = R.drawable.ic_visa)
    if(card.cardType == "MASTER CARD"){
        image = painterResource(id = R.drawable.ic_mastercard)
    }

    Box(
        modifier = Modifier
            .padding(start = 16.dp, end = lastItemPaddingEnd),
    ){

        Column(
            modifier = Modifier
                .clip(RoundedCornerShape(25.dp))
                .background(card.color)
                .width(250.dp)
                .height(160.dp)
                .clickable{}
                .padding(vertical = 12.dp, horizontal = 16.dp),
            verticalArrangement = Arrangement.SpaceBetween

        ) {
            Image(
                painter = image,
                contentDescription = card.cardName,
                modifier = Modifier.width(60.dp)
            )

            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = card.cardName,
                fontSize = 17.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
            Text(
                text = card.balance,
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
            Text(
                text = card.cardNumber,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )

        }
    }

}





















