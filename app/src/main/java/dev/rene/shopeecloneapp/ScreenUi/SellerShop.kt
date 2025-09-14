package dev.rene.shopeecloneapp.ScreenUi

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
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
import dev.rene.shopeecloneapp.ProductListing.ProductListing
import dev.rene.shopeecloneapp.ProductListing.ProductScreen
import dev.rene.shopeecloneapp.ProductListing.ProductViewHolder
import dev.rene.shopeecloneapp.ProfileDesign.ProductVideos
import dev.rene.shopeecloneapp.ProfileDesign.ShopProfile
import dev.rene.shopeecloneapp.R
import dev.rene.shopeecloneapp.TabLayot.ShopTabLayout
import dev.rene.shopeecloneapp.VoucherDesign.VoucherCard
import dev.rene.shopeecloneapp.ui.theme.ShopeeCloneAPPTheme

@Composable
fun SellerShop(){


    Scaffold(
        containerColor = Color(245,245,245)
        //modifier = Modifier.background(color = Color(f5f5f5)
        // )
    )
    { innerPadding ->

        Column(

            modifier =Modifier.padding(innerPadding).fillMaxSize()
                .verticalScroll(rememberScrollState())
        ) {


            Column(
                modifier = Modifier.height(240.dp)
            ) {

                ShopProfile()
                ProductVideos()

                Box(
                    modifier = Modifier.height(50.dp).fillMaxWidth()
                        .background(color = Color.Red)
                ){
                    ShopTabLayout()
                }


            }

            Box(
                modifier = Modifier.padding(10.dp).fillMaxWidth()
                    .background(color =Color.White, shape = RoundedCornerShape(5.dp))


            ){

                LazyRow {
                    item{
                        VoucherCard()
                    }
                }

            }



            Column(
                modifier = Modifier.padding(horizontal = 10.dp)
                    .background(
                        color = Color.White,
                        shape = RoundedCornerShape(5.dp)
                    ).height(320.dp).fillMaxWidth()

            ){

                Row(
                    modifier = Modifier.padding(10.dp)
                ) {
                    Text("Recommended For You", fontWeight = FontWeight.SemiBold,
                        fontSize = 14.sp, color =Color.Black)

                    Spacer(modifier = Modifier.weight(1f))

                    Row(
                        verticalAlignment = Alignment.CenterVertically

                    ){
                        Text("See More", fontSize = 13.sp, color = Color.Red)
                        Icon(
                            imageVector = Icons.Default.KeyboardArrowRight,
                            contentDescription = "",
                            modifier = Modifier.size(14.dp)
                        )

                    }


                }

                // Spacer(modifier = Modifier.weight(1f))
                //shop Listing
                ProductViewHolder()

            }

            // banner
            Box(
                modifier = Modifier.padding(top=5.dp,start=5.dp, end= 5.dp, bottom = 5.dp)
                    .height(185.dp).fillMaxWidth()
                    .clip(RoundedCornerShape(8.dp))

            ){
                Image(
                    painter = painterResource(id = R.drawable.banner01),
                    contentDescription = "banner",
                    contentScale = ContentScale.Fit,

                    )


            }

            ProductScreen(products = ProductListing)


        }



    }
}

@Preview
@Composable
fun SellerShopPreview(){
    ShopeeCloneAPPTheme {
        SellerShop()
    }
}