package dev.rene.shopeecloneapp.TabLayot

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navOptions
import dev.rene.shopeecloneapp.ScreenUi.Category
import dev.rene.shopeecloneapp.ScreenUi.LiveScreen
import dev.rene.shopeecloneapp.ScreenUi.ProductList
import dev.rene.shopeecloneapp.ScreenUi.SellerShopMain

@Composable
fun TabLayoutContent(navController: NavHostController) {
    val tabs = listOf("Category", "Live", "Products", "Shop")
    var selectedTabIndex by remember { mutableStateOf(0) }

    Column {
        // TabRow at the top
        TabRow(selectedTabIndex = selectedTabIndex) {
            tabs.forEachIndexed { index, title ->
                Tab(
                    selected = selectedTabIndex == index,
                    onClick = {
                        selectedTabIndex = index
                        when (index) {
                            0 -> navController.navigate("category") { launchSingleTop = true }
                            1 -> navController.navigate("live") { launchSingleTop = true }
                            2 -> navController.navigate("products") { launchSingleTop = true }
                            3 -> navController.navigate("shop") { launchSingleTop = true }
                        }
                    },
                    text = { Text(title, fontSize = 13.sp) }
                )
            }
        }

        // NavHost showing your screens below the TabRow
        NavHost(
            navController = navController,
            startDestination = "category",
            modifier = Modifier.fillMaxSize()
        ) {
            composable("category") { Category() }
            composable("live") { LiveScreen() }
            composable("products") { ProductList() }
            composable("shop") { SellerShopMain() }
        }
    }
}


