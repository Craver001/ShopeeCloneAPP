package dev.rene.shopeecloneapp.ProductListing.Design

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.rene.shopeecloneapp.R
import dev.rene.shopeecloneapp.ui.theme.ShopeeCloneAPPTheme

@Composable
fun UniversalProductCard(image: Painter,subImage: Painter, title:String,price:String,rating:String,sold:String){

    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(5.dp))
            .height(270.dp)
            .width(180.dp)
            .background(color = Color(255,255,255))

    ){

        Column(
            verticalArrangement = Arrangement.Bottom,

            ) {
            Image(
                image,
                contentDescription = "",
                contentScale = ContentScale.FillBounds ,
                modifier = Modifier.height(150.dp)
                    .fillMaxWidth().padding(bottom = 10.dp)
            )

            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(5.dp),
                modifier = Modifier.fillMaxWidth().padding(
                    start = 5.dp, end = 5.dp,
                )

            ) {

                Image(
                    subImage,
                    contentDescription = "",
                    modifier = Modifier.size(22.dp)
                )

                Text(title,
                    fontSize = 13.sp,
                    color =Color.Black,
                    maxLines = 2,               // allow wrapping to 2 lines)
                )

            }

            // Price

            Text(price, fontSize = 24.sp, color = Color.Red,
                modifier = Modifier.padding(start=5.dp))

            // SPayLater

            Row(
                verticalAlignment = Alignment.Top,
                // verticalAlignment = Alignment.CenterVertically
                //  modifier = Modifier.background()
            ) {

                Text(" SPayLater 0%", fontSize = 10.sp, color = Color.Black,
                    modifier = Modifier
                        .background(color = Color.Red,)

                )

                Text("6x", fontSize = 10.sp,
                    modifier = Modifier.border(
                        width = 1.dp,
                        color = Color.Black.copy(0.45f)
                    ).padding(horizontal = 5.dp)
                )
            }

            //ratings and sold

            Row (
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(5.dp),
                modifier = Modifier.padding(top = 5.dp)
            ){

                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(5.dp),
                    modifier = Modifier.padding(start = 5.dp)
                        .border(
                            width = 1.dp,
                            color = Color.Yellow.copy(0.65f)
                        )
                        .background(
                            color = Color(251,246,224),
                            shape = RoundedCornerShape(5.dp))
                ) {

                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = Color.Yellow,
                        modifier = Modifier.size(14.dp).padding(start = 5.dp)
                    )

                    Text(rating, fontSize = 12.sp,
                        modifier = Modifier.padding(end = 5.dp))




                }

                Text(sold, fontSize = 12.sp, color = Color.Black)
            }


        }

    }

}

@Preview
@Composable
fun ProductCardDesignPreview2(){
    ShopeeCloneAPPTheme {
        UniversalProductCard(painterResource(R.drawable.product01),
            painterResource(R.drawable.mall),
            "Honor Magic6 Pro",
            "₱53,599",
            "4.9",
            "| 10K+ sold")
    }
}