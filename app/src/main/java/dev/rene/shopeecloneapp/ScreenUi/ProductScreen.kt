package dev.rene.shopeecloneapp.ScreenUi

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.google.android.gms.analytics.ecommerce.Product
import dev.rene.shopeecloneapp.ProductListing.ProductClass
import dev.rene.shopeecloneapp.ProductListing.ProductListing
import dev.rene.shopeecloneapp.ProductListing.ProductScreen
import dev.rene.shopeecloneapp.ui.theme.ShopeeCloneAPPTheme

@Composable
fun ProductList (){

    Scaffold { innerPadding ->

        Column(
            modifier = Modifier.padding(innerPadding)
        ) {

            ProductScreen(products = ProductListing)

        }

    }
}

@Preview
@Composable
fun ProductListPreview (){
    ShopeeCloneAPPTheme {
        ProductList()
    }
}