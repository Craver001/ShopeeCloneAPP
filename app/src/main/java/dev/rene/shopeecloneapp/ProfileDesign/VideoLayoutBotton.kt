package dev.rene.shopeecloneapp.ProfileDesign

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.rene.shopeecloneapp.R
import dev.rene.shopeecloneapp.ui.theme.ShopeeCloneAPPTheme

@Composable
fun ProductVideos(){

    Box(


        modifier = Modifier.height(40.dp)
            .fillMaxWidth()
           // .padding(10.dp)
            .background(color =Color.Red.copy(0.65f))

    ){


        Row (
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(start=10.dp, end = 10.dp, top = 3.dp)
                .border(
                    width = 1.dp,
                    color = Color.White.copy(0.15f),
                    shape = RoundedCornerShape(10.dp)
                )
                .clip(RoundedCornerShape(10.dp))
                .background(color =Color.DarkGray.copy(0.30f)),


        ){

            Row (
                horizontalArrangement = Arrangement.spacedBy(6.dp),
                verticalAlignment = Alignment.CenterVertically,

                modifier = Modifier.padding(5.dp),
            ){
                Image(painter = painterResource(R.drawable.shopee),
                    "",
                    modifier = Modifier.size(14.dp).padding(start = 5.dp))

                Text("Product Videos",
                    fontSize = 13.sp,
                    color =Color.White, fontWeight = FontWeight.SemiBold)

            }

            Spacer(modifier = Modifier.weight(1f))


            Row (
                horizontalArrangement = Arrangement.spacedBy(5.dp),
                verticalAlignment = Alignment.CenterVertically
            ){

                Text("100k+ Views",
                    fontSize = 13.sp,
                    color =Color.White,
                    fontWeight = FontWeight.W200)

                Icon(
                    imageVector = Icons.Default.KeyboardArrowLeft,
                    contentDescription = "",
                    tint = Color.White,
                    modifier = Modifier.size(18.dp).padding(end = 5.dp))

            }




        }

    }
}


@Preview
@Composable
fun ProductVideosPreview(){
    ShopeeCloneAPPTheme {
        ProductVideos()
    }
}