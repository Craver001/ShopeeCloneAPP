package dev.rene.shopeecloneapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import dev.rene.shopeecloneapp.ScreenUi.SellerShop

import dev.rene.shopeecloneapp.ui.theme.ShopeeCloneAPPTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ShopeeCloneAPPTheme {
                SellerShop()
            }
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

