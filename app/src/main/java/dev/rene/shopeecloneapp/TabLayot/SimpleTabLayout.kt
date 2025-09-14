package dev.rene.shopeecloneapp.TabLayot

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import dev.rene.shopeecloneapp.ui.theme.ShopeeCloneAPPTheme



// Dummy Composables for your screens
@Composable
fun MySimpleTabView() {
    val tabs = listOf("Shop", "Product", "Categories", "Live")
    var tabIndex by remember { mutableStateOf(0) }

    Column(
        modifier = Modifier.fillMaxSize(),
    ) {
        TabRow(selectedTabIndex = tabIndex) {
            tabs.forEachIndexed { index, title ->
                Tab(
                    text = { Text(title, fontSize = 13.sp) },
                    selected = tabIndex == index,
                    onClick = {
                        // Simply update the state when a tab is clicked
                        tabIndex = index
                    }
                )
            }
        }

        // Your 'when' statement goes here, directly below the TabRow
//        when (tabIndex) {
//            0 -> SellerShop()
//            1 -> ProductList()
//            2 -> Category()
//            3 -> LiveScreen()
//        }
    }
}

@Preview
@Composable
fun simplePreview(){

    ShopeeCloneAPPTheme {
        MySimpleTabView()
    }
}