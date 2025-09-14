package dev.rene.shopeecloneapp.ProfileDesign

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.rene.shopeecloneapp.R
import dev.rene.shopeecloneapp.ui.theme.ShopeeCloneAPPTheme

@Composable
fun ShopProfile(){

    Box(

    ){
//        Image(
//            painter = painterResource(R.drawable.background),
//            contentDesciption = "",
//            modifier = Modifier.height(275.dp))

        Image(painter = painterResource(R.drawable.background),
            contentDescription = "",
            modifier = Modifier.height(170.dp).fillMaxWidth())


        Row(
          // containerColor = Color()
            verticalAlignment = Alignment.Bottom,

            modifier = Modifier
                .height(170.dp)
                .fillMaxWidth()
                .background(color =Color.Red.copy(0.65f),)

          //  color = Color.Red.copy(0.15f),

        ) {

            Row(
                modifier = Modifier.height(85.dp)
                    .fillMaxWidth()
            ){

                Column(
                    modifier = Modifier.padding(start = 10.dp, end =5.dp, bottom = 5.dp, top = 5.dp ),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {

                    Image(
                        painter = painterResource(R.drawable.icon),
                        contentDescription = "",
                        contentScale = ContentScale.Crop, // makes the image fill the circle
                        modifier = Modifier
                            .height(60.dp)
                            .border(
                                1.dp,
                                color = Color.White,
                                shape = CircleShape
                            )
                            .clip(CircleShape) )

                    Image(painter = painterResource(id = R.drawable.shopeemall),
                        contentDescription = "",
                        contentScale = ContentScale.FillBounds, // stretches to fit width & height
                        modifier = Modifier
                            .height(25.dp)
                            .width(60.dp)
                            .offset(x = 1.dp, y = -8.dp) )

                }

                Column (
                    modifier = Modifier.height(80.dp).padding(start = 5.dp),

                    horizontalAlignment = Alignment.Start,
                    verticalArrangement = Arrangement.Center

                ) {
                    Text("Honor Official Store",
                        fontSize = 16.sp,
                        color =Color.White,
                        fontWeight = FontWeight.SemiBold,
                        modifier = Modifier.offset(y = 3.dp).padding(start = 5.dp )

                    )

                    Row{
                        Icon(
                            imageVector = Icons.Default.Star, // ⭐ default star
                            contentDescription = "Star Icon",
                            tint = Color.Yellow, // set color
                            modifier = Modifier
                                .size(12.dp)
                                .align(Alignment.CenterVertically)
                        )

                        Text("4.9 |", fontSize = 13.sp, color = Color.White)
                        Text(" 563.45k Followers", fontSize = 13.sp, color = Color.White)
                    }


                }

                Column(
                    horizontalAlignment = Alignment.End,
                    verticalArrangement = Arrangement.Center,
                    modifier =Modifier.fillMaxSize().padding(end =15.dp)

                ) {

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center,
                        //horizontalArrangement = Arrangement.spacedBy(3.dp),


                        modifier = Modifier
                            .border(
                                width = 1.dp,
                                color = Color.White,
                                shape = RoundedCornerShape(5.dp))
                            .background(color = Color.Red, shape = RoundedCornerShape(5.dp))
                            .width(80.dp)
                            .padding(4.dp)



                    ) {
                        Icon(
                            imageVector = Icons.Default.Favorite, // or any other icon
                            contentDescription = "Follow Icon",
                            tint = Color.Yellow,
                           modifier = Modifier.size(13.dp)
                             //   .padding(start = 5.dp)
                        )
                        Spacer(modifier = Modifier.width(4.dp)) // space between icon & text
                        Text(text = "Follow", fontSize = 13.sp, color = Color.White,)
                        //modifier = Modifier.padding(end= 5.dp))
                    }

                    Spacer(modifier = Modifier.height(2.dp))

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center,
                       // horizontalArrangement = Arrangement.spacedBy(4.dp),


                        modifier = Modifier
                            .border(
                                width = 1.dp,
                                color = Color.White,
                                shape = RoundedCornerShape(5.dp))
                            .background(color = Color.Red, shape = RoundedCornerShape(5.dp))
                            .width(80.dp)
                            .padding(4.dp)



                    ) {
                        Icon(
                            imageVector = Icons.Default.Call, // or any other icon
                            contentDescription = "Follow Icon",
                            tint = Color.Yellow,
                            modifier = Modifier.size(13.dp)
                             //   .padding(start = 5.dp)
                        )
                         Spacer(modifier = Modifier.width(3.dp)) // space between icon & text
                        Text(text = "Chat", fontSize = 13.sp, color = Color.White,
                            modifier = Modifier.padding(end= 5.dp))
                    }


                    //  Text("Follow", fontSize = 12.sp, color = Color.White)
                }

            }

        }

    }

}

@Preview
@Composable
fun ShopProfilePreview(){
    ShopeeCloneAPPTheme {
        ShopProfile()
    }
}