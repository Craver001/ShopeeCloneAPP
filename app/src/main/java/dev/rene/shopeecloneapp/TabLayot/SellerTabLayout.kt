package dev.rene.shopeecloneapp.TabLayot

import android.R.attr.title
import android.R.id.tabs
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Divider
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Tab
import androidx.compose.material3.TabPosition
import androidx.compose.material3.TabRow
import androidx.compose.material3.TabRowDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.motionEventSpy
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.rene.shopeecloneapp.ScreenUi.Category
import dev.rene.shopeecloneapp.ScreenUi.LiveScreen
import dev.rene.shopeecloneapp.ScreenUi.ProductList
import dev.rene.shopeecloneapp.ScreenUi.SellerShopMain
import kotlinx.coroutines.launch


@Composable
fun ShopTabLayout() {


    val tabs = listOf(
        "Shop", "Product", "Categories", "Live"
    )

    // Pager state to control and observe the current page
    val pagerState = rememberPagerState(pageCount = { tabs.size })

    // Coroutine scope to animate page changes
    val scope = rememberCoroutineScope()


    TabRow(
        selectedTabIndex = pagerState.currentPage,
        containerColor = Color.Transparent,
        divider = {
            HorizontalDivider(
                modifier = Modifier.padding(horizontal = 16.dp),
                thickness = 1.dp,
                color = Color.LightGray
            )
        },

        indicator = { tabPositions ->
            TabRowDefaults.Indicator(
                Modifier
                    .customTabOffset(tabPositions[pagerState.currentPage]),
                height = 4.dp,
                color = Color(0xFF9367FF) // purple example
            )
        }
    ) {

        //Content
        tabs.forEachIndexed { index, title ->
            Tab(
                selected = pagerState.currentPage == index,
                onClick = {
                    scope.launch {
                        pagerState.animateScrollToPage(index)
                    }
                },
                content = {
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {

                        // Spacer(modifier = Modifier.weight(1f))

                        Text(
                            text = title, color = Color.White, fontSize = 13.sp,
                            modifier = Modifier.padding(5.dp)
                        )


                    }

                },


                )

        }


        // The HorizontalPager that displays the content
//        HorizontalPager(state = pagerState) { page ->
//            // The 'when' statement now uses the 'page' from the Pager
//            when (page) {
//                0 -> SellerShopMain()
//                1 -> ProductList()
//                2 -> Category()
//                3 -> LiveScreen()
//            }
//
//        }

    }
}

fun Modifier.customTabOffset(
    tabPosition: TabPosition,
    indicatorWidth: Dp = 118.dp // custom fixed width
): Modifier = composed {
    val currentTabWidth = tabPosition.width

    // Animate the indicator’s X offset
    val indicatorOffset = animateDpAsState(
        targetValue = tabPosition.left + currentTabWidth / 2 - indicatorWidth / 2,
        animationSpec = tween(
            durationMillis = 300, // you can change this
            easing = FastOutSlowInEasing
        )
    )

    fillMaxWidth()
        .wrapContentSize(Alignment.BottomStart)
        .offset(x = indicatorOffset.value)
        .width(indicatorWidth)
}


@Preview
@Composable
fun ShopTabLayoutPreview(){
    ShopTabLayout()
}