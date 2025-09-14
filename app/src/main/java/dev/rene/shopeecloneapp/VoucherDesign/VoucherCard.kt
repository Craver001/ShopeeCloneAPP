package dev.rene.shopeecloneapp.VoucherDesign

import android.R
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.rene.shopeecloneapp.ui.theme.ShopeeCloneAPPTheme

@Composable
fun VoucherCard(){

    Column (
        modifier = Modifier.padding(10.dp).width(275.dp)
//             .border(
//                width = 1.dp, color = Color.Red.copy(0.35f),
//                shape = RoundedCornerShape(5.dp)
//             )
            .clip(RoundedCornerShape(5.dp)),
        verticalArrangement = Arrangement.Center
    ){


        Row (
            modifier = Modifier.fillMaxWidth()
                .background(color = Color(251,237,237).copy(0.66f))
                .padding(10.dp),
              //  .clip(RoundedCornerShape(10.dp)),
            verticalAlignment = Alignment.CenterVertically,

        ) {



            Column (
                //verticalArrangement = Arrangement.Center

            ) {
                Text("₱100 off",
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 18.sp,
                    color = Color.Black)

                Text("Min. Spend ₱10k",
                    fontSize = 13.sp, color = Color.Black)


                Text("Valid Till: 30.09.2025",
                    fontSize = 13.sp, color = Color.Black,
                    fontWeight = FontWeight.W200
                )

            }

            Spacer(modifier = Modifier.weight(1f))

            Text("Use", fontSize = 14.sp,
                color = Color.Red,
                modifier = Modifier.padding(5.dp)
                    .border(
                        width = 1.dp,
                        color =Color.Red,
                        shape = RoundedCornerShape(5.dp)
                    )
                    .padding(start = 15.dp, end = 15.dp, bottom = 5.dp, top = 5.dp)


            )


        }


    }

}



@Preview
@Composable
fun VoucherCardPreview()
{
    ShopeeCloneAPPTheme {
        VoucherCard()
    }
}