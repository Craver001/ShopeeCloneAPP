package dev.rene.shopeecloneapp.ProductListing

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.rene.shopeecloneapp.ProductListing.Design.ProductCardDesign
import dev.rene.shopeecloneapp.ProductListing.Design.UniversalProductCard
import dev.rene.shopeecloneapp.ui.theme.ShopeeCloneAPPTheme

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun ProductScreen(products: List<ProductClass>) {

    Column(
        modifier = Modifier.fillMaxSize(),

    ) {

        Text("Hot Products", modifier = Modifier.padding(start = 10.dp, top = 10.dp))


        FlowRow(
            modifier = Modifier.padding(8.dp).fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp, alignment = Alignment.CenterHorizontally),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            products.forEach { listing ->
                UniversalProductCard(
                    image = painterResource(id = listing.image),
                    subImage = painterResource(id = listing.subImage),
                    title = listing.title,
                    price = listing.price,
                    rating = listing.rating,
                    sold = listing.sold
                )
            }

        }

    }


}


@Preview
@Composable
fun ProductGridPreview(){
    ShopeeCloneAPPTheme {
        ShopeeCloneAPPTheme {
            ProductScreen(products = ProductListing)
        }
    }
}
