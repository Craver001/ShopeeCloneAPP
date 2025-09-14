package dev.rene.shopeecloneapp.ProductListing

import androidx.compose.ui.res.painterResource
import dev.rene.shopeecloneapp.R

class ProductClass(
   val image: Int,
   val subImage:Int,
   val title: String,
   val price:String,
   val rating: String,
   val sold:String

)

val ProductListing = listOf<ProductClass>(
    ProductClass(R.drawable.product02, R.drawable.mall,"Honor X8c", "₱12,444", "4.9","| 10K+ sold"),
    ProductClass(R.drawable.product01, R.drawable.mall, "Honor Magic6 Pro", "₱53,599", "4.9", "| 10K+ sold"),
    ProductClass(R.drawable.product02, R.drawable.mall,"Honor X8c", "₱12,444", "4.9","| 10K+ sold"),
    ProductClass(R.drawable.product01, R.drawable.mall, "Honor Magic6 Pro", "₱53,599", "4.9", "| 10K+ sold"),
    ProductClass(R.drawable.product02, R.drawable.mall,"Honor X8c", "₱12,444", "4.9","10K+ sold"),
    ProductClass(R.drawable.product01, R.drawable.mall, "Honor Magic6 Pro", "₱53,599", "4.9", "10K+ sold"),
    ProductClass(R.drawable.product02, R.drawable.mall,"Honor X8c", "₱12,444", "4.9","10K+ sold"),
    ProductClass(R.drawable.product01, R.drawable.mall, "Honor Magic6 Pro", "₱53,599", "4.9", "10K+ sold"),

)