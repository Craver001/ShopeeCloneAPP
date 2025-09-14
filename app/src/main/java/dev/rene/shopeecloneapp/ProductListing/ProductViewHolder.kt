package dev.rene.shopeecloneapp.ProductListing

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.rene.shopeecloneapp.ProductListing.Design.ProductCardDesign
import dev.rene.shopeecloneapp.ui.theme.ShopeeCloneAPPTheme


@Composable
fun ProductViewHolder(){
    LazyRow(

        horizontalArrangement = Arrangement.spacedBy(7.dp),

    ) {

        items(ProductListing){ listing ->
            ProductCardDesign(
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

@Preview
@Composable
fun PreviewListing(){
    ShopeeCloneAPPTheme {
        ProductViewHolder()
    }
}